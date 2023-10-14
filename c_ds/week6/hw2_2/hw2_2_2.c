#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>
#include <string.h>
#define MAX_STRING 100

typedef int element;
typedef struct StackNode {
	element item;
	char name[MAX_STRING];
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
void push(LinkedStackType* s, element item, char name) {
	StackNode* temp = (StackNode*)malloc(sizeof(StackNode));
	if (temp == NULL) {
		fprintf(stderr, "메모리 할당에러\n");
		return;
	}
	else {
		temp->item = item;
		strcpy(temp->name, name);
		if (s->top != NULL) {
			temp->link = s->top;
			s->top = temp;
		}
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
element peek(LinkedStackType* s) { // 맨 앞 노드를 보는건가?
	if (is_empty(s)) {
		fprintf(stderr, "스택이 비어있음\n");
		exit(1);
	}
	else {
		return s->top->item;
	}
}
void stack_print(LinkedStackType* s) {
	LinkedStackType* temp = s->top;
	if (is_empty(s)) {
		printf("<empty>\n--\n");
		return;
	}
	else {
		printf("[%d %s] <-top\n", s->top->item, s->top->name);
		s->top = s->top->link;
		while (s->top != NULL) {
			printf("[%d, %s]\n", s->top->item, s->top->name);
			s->top = s->top->link;
		}
	}
	printf("--\n");
	s->top = temp;
}
int main(void) {

	LinkedStackType s;
	init(&s);
	stack_print(&s);

	push(&s, 10, "ten");
	stack_print(&s);

	push(&s, 20, "twenty");
	stack_print(&s);

	push(&s, 30, "thirty");
	stack_print(&s);

	push(&s, 40, "fourty");
	stack_print(&s);

	pop(&s);
	stack_print(&s);

	push(&s, 50, "fifty");
	stack_print(&s);

	pop(&s);
	stack_print(&s);

	pop(&s);
	stack_print(&s);

	pop(&s);
	stack_print(&s);

	return 0;
}