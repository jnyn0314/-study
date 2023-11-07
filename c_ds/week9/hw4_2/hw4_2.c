#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0
typedef struct TreeNode {
	int key;
	struct TreeNode* left, * right;
}TreeNode;
TreeNode* new_node(int item) {
	TreeNode* temp = (TreeNode*)malloc(sizeof(TreeNode));
	temp->key = item;
	temp->left = temp->right = NULL;
	return temp;
}
void inorder(TreeNode* root) {
	if (root) {
		inorder(root->left);
		printf("[%d]", root->key);
		inorder(root->right);
	}
}
void preorder(TreeNode* root) {
	if (root) {
		printf("[%d]", root->key);
		preorder(root->left);
		preorder(root->right);
	}
}
TreeNode* search(TreeNode* node, int key) {
	if (node == NULL)
		return NULL;
	if (key == node->key)
		return node;
	else if (key < node->key)
		return search(node->left, key);
	else
		return search(node->right, key);

	return NULL;
}
TreeNode* insert_node(TreeNode* root, int key) {
	if (root == NULL)
		return new_node(key);
	if (key < root->key)
		root->left = insert_node(root->left, key);
	else if (key > root->key)
		root->right = insert_node(root->right, key);
	return root;
}
int get_minimum(TreeNode* node) {
	TreeNode* current = node;
	while (current->left != NULL)
		current = current->left;
	return current->key;
}
int get_maximum(TreeNode* node) {
	TreeNode* current = node;
	while (current->right != NULL)
		current = current->right;
	return current->key;
}
TreeNode* delete_node(TreeNode* root, int key) {
	TreeNode* temp;
	if (root == NULL)
		return root;

	if (key < root->key)
		root->left = delete_node(root->left, key);
	else if (key > root->key)
		root->right = delete_node(root->right, key);
	else {
		if (root->left == NULL) {
			TreeNode* temp = root->right;
			free(root);
			return temp;
		}
		else if (root->right == NULL) {
			TreeNode* temp = root->left;
			free(root);
			return temp;
		}
		temp = get_minimum(root->right);
		
		root->key = temp->key; // 중위 순회시 후계 노드를 복사한다.

		root->right = delete_node(root->right, temp->key); // 중위 순회시 후계 노드를 삭제한다.
	}
	return root;
}
int get_height(TreeNode* root) {
	if (root == NULL)
		return 0;

	int left_height = get_height(root->left);
	int right_height = get_height(root->right);

	return 1 + (left_height >= right_height ? left_height : right_height);
}
int get_count(TreeNode* root) {
	if (root == NULL)
		return 0;

	int left_count = get_count(root->left);
	int right_count = get_count(root->right);

	return 1 + left_count + right_count;
}
int main(void) {
	char input;
	int key;
	TreeNode* tree = NULL;

	printf("Enter i<nsert>, d<elete>, s<earch>, p<rint>, h<eight>, c<ount>, m<ax>, n<in>, q<uit>:");
	scanf(" %c", &input);
	while (getchar() != '\n');

	while (input != 'q') {
		switch (input)
		{
		case 'i':
			printf("삽입할 key값 입력:");
			scanf("%d", &key);
			tree = insert_node(tree, key);
			while (getchar() != '\n');
			break;
		case 'd':
			printf("삭제할 key값 입력:");
			scanf("%d", &key);
			tree = delete_node(tree, key);
			while (getchar() != '\n');
			break;
		case 's':
			printf("탐색할 key값 입력:");
			scanf("%d", &key);
			tree = search(tree, key);
			if (tree != NULL)
				printf("있음\n");
			else
				printf("없음\n");
			while (getchar() != '\n');
			break;
		case 'p':
			preorder(tree); 
			break;
		case 'h':
			printf("트리의 높이는 %d\n", get_height(tree));
			break;
		case 'c':
			printf("노드의 갯수는 %d\n", get_count(tree));
			break;
		case 'm':
			printf("가장 큰 값은 %d\n", get_maximum(tree));
			break;
		case 'n':
			printf("가장 작은 값은 %d\n", get_minimum(tree));
			break;
		default:
			break;
		}
		
		printf("Enter i<nsert>, d<elete>, s<earch>, p<rint>, h<eight>, c<ount>, m<ax>, m<in>, q<uit>:");
		scanf("%c", &input);
		while (getchar() != '\n');
	}
	return 0;
}