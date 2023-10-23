// 반복적 중위순회
#include<stdio.h>
#include<stdlib.h>
#include<memory.h>
typedef struct TreeNode {
	int data;
	struct TreeNode* left, * right;
}TreeNode;
// 스택을 위한 typedef
typedef TreeNode* element;
typedef struct StackNode {
	element item;
	struct StackNode* link;
}StackNode;
typedef struct {
	StackNode* top;
}LinkedStackType;
void init(LinkedStackType* s) {
	s->top = NULL;
}
element is_empty(LinkedStackType* s) {
	return s->top == NULL;
}
int is_full(LinkedStackType* s) {
	return 0;
}
void push(LinkedStackType* s, element item) {
	StackNode* temp = (StackNode*)malloc(sizeof(StackNode));
	if (temp == NULL) {
		fprintf(stderr, "메모리 할당에러\n");
		return;
	}
	else {
		temp->item = item;
		temp->link = s->top;
		s->top = temp;
	}
}
element pop(LinkedStackType* s) {
	StackNode* temp;
	element item;
	if (is_empty(s)) {
		fprintf(stderr, "스택이 비어있음\n");
		exit(1);
	}
	else {
		temp = s->top;
		item = temp->item;
		s->top = temp->link;
		free(temp);
		return item;
	}
}
void stack_print(LinkedStackType* s) {
	LinkedStackType* temp = s->top;
	if (is_empty(s)) {
		printf("<empty>\n--\n");
		return;
	}
	else {
		printf("%d <-top\n", s->top->item);
		s->top = s->top->link;
		while (s->top != NULL) {
			printf("%d\n", s->top->item);
			s->top = s->top->link;
		}
	}
	printf("--\n");
	s->top = temp;
}
void inorder_iter(LinkedStackType *s, TreeNode* root) { // 중위순회
	for (; root ; root = root->left) // for(int i = 0; i < arraySize; i++) 
		push(s, root);
	while (!is_empty(s)) {
		root = pop(s);
		printf("[%d]", root->data);
		root = root->right;

		for (; root; root = root->left) {
			push(s, root);
		}
	}
}
void postorder_iter(LinkedStackType* s, TreeNode* root) { // 후위 순회
	if (!root) return;

	LinkedStackType* outputStack;
	init(outputStack);

	push(s, root);

	while (!is_empty(s)) {
		root = pop(s);
		push(outputStack, root);

		if (root->left) push(s, root->left);
		if (root->right) push(s, root->right);
	}

	while (!is_empty(outputStack)) {
		root = pop(outputStack);
		printf("[%d]", root->data);
	}
}
void preorder_iter(LinkedStackType* s, TreeNode* root) { // 전위순회
	if (!root) return;

	push(s, root);

	while (!is_empty(s)) {
		root = pop(s);
		printf("[%d]", root->data);

		if (root->right) push(s, root->right);
		if (root->left) push(s, root->left);
	}
// for 루프를 이용해서 중위 순회 구현한 경우
/*void inorder_iter(TreeNode* root) {
    TreeNode* stack[100]; // 최대 스택 크기
    int indexStack[100]; // 인덱스 스택
    int top = -1;

    TreeNode* current = root;
    
    while (current || top >= 0) {
        while (current) {
            stack[++top] = current;
            indexStack[top] = 0; // 왼쪽 서브트리에 있는 것을 나타내는 인덱스 0
            current = current->left;
        }
        
        current = stack[top];
        
        printf("[%d]", current->data);
        
        if (++indexStack[top] == 1) {
            current = current->right;
        } else {
            current = NULL;
            top--;
        }
    }
}
*/