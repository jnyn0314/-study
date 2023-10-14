#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<memory.h>
#define TRUE 1
#define FALSE 0
#define MAX_TREE_SIZE 20
typedef struct TreeNode {
	int data;
	struct TreeNode* left, * right; // 구조체 포인터
}TreeNode;
int get_nonleaf_count(TreeNode* node) { // 구조체 포인터
	int count = 0;

	if (node != NULL) {
		if (node->left != NULL || node->right != NULL)
			count = 1 + get_nonleaf_count(node->left) + get_nonleaf_count(node->right);
		else
			return 0;
	}
	return count;
}
int get_oneleaf_count(TreeNode* node) { // 수정
	int count = 0;

	if (node != NULL) {
		if ((node->left == NULL && node->right != NULL) || (node->right == NULL && node->left != NULL))
			count = 1 + get_oneleaf_count(node->right) + get_oneleaf_count(node->left);
		else
			count = get_oneleaf_count(node->right) + get_oneleaf_count(node->left);
	}
	return count;
}
int get_twoleaf_count(TreeNode* node) {
	int count = 0;

	if (node != NULL) {
		if (node->left != NULL && node->right != NULL)
			count = 1 + get_twoleaf_count(node->left) + get_twoleaf_count(node->right);
		else
			count = get_twoleaf_count(node->left) + get_twoleaf_count(node->right);
	}
	return count;
}
int get_max(TreeNode* node) {
	if (node == NULL) {
		return INT_MIN; 
	}

	int leftMax = get_max(node->left);
	int rightMax = get_max(node->right);
	int rootMax = node->data;

	// 현재 노드의 값과 자식 노드의 최댓값을 비교하여 최댓값을 반환합니다.
	int maxVal = (leftMax > rightMax) ? leftMax : rightMax;
	return (rootMax > maxVal) ? rootMax : maxVal;
}
int get_min(TreeNode* node) {
	if (node == NULL)
		return INT_MAX;
	
	int leftMin = get_min(node->left);
	int rightMin = get_min(node->right);
	int rootMin = node->data;

	int minVal = (leftMin < rightMin) ? leftMin : rightMin;
	return (rootMin < minVal) ? rootMin : minVal;
}
void node_increase(TreeNode*) { // 이진 트리의 노드들의 값을 1씩 증가
	
}
int main(void) {

	TreeNode n1 = { 15, NULL, NULL };
	// TreeNode n7 = { 10, NULL, NULL };
	// TreeNode n2 = { 4, &n1, &n7};
	TreeNode n2 = { 4, &n1, NULL};
	TreeNode n3 = { 16, NULL, NULL };
	TreeNode n4 = { 25, NULL, NULL };
	TreeNode n5 = { 15, &n3, &n4 };
	TreeNode n6 = { 15, &n2, &n5 };
	TreeNode* root = &n6;

	TreeNode m1 = { 15, NULL, NULL };
	TreeNode m2 = { 4, &n1, NULL };
	TreeNode m3 = { 16, NULL, NULL };
	TreeNode m7 = { 28, NULL, NULL }; // 추가
	TreeNode m4 = { 25, NULL, &m7 }; // 변경
	TreeNode m5 = { 15, &m3, &m4 };
	TreeNode m6 = { 15, &m2, &m5 };
	TreeNode* root2 = &m6;

	printf("get_nonleaf_count(TreeNode *) 테스트:\n");
	printf("%d ", get_nonleaf_count(root)); // 34
	printf("%d ", get_nonleaf_count(root2));  // 75 

	printf("\nget_oneleaf_count(TreeNode *) 테스트:\n");
	printf("%d ", get_oneleaf_count(root)); // 1
	printf("%d ", get_oneleaf_count(root)); // 2

	printf("\nget_twoleaf_count(TreeNode *) 테스트:\n");
	printf("%d ", get_twoleaf_count(root)); // 2
	printf("%d ", get_twoleaf_count(root)); // 2


	printf("\nint get_max (TreeNode *) 테스트:\n");
	printf("%d ", get_max(root));
	printf("%d ", get_max(root2));

	printf("\nint get_min (TreeNode *) 테스트:\n");
	printf("%d ", get_min(root));
	printf("%d ", get_min(root2));
	return 0;
}