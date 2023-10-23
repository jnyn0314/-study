// 레벨 순회(큐를 이용)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<memory.h>
typedef struct TreeNode {
	int data;
	struct TreeNode* left, * right;
}TreeNode;
void level