// 레벨 순회(큐를 이용)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<memory.h>
typedef struct TreeNode {
	int data;
	struct TreeNode* left, * right;
}TreeNode;
// 원형 큐 시작
#define MAX_QUEUE_SIZE 100
typedef int element;
typedef struct {
	element queue[MAX_QUEUE_SIZE];
	int front, rear;
}QueueType;
void error(char* message) {
	fprintf(stderr, "%s\n", message);
}
void init(QueueType* q) {
	q->front = q->rear = 0;
}
int is_empty(QueueType* q) {
	return (q->front == q->rear);
}
int is_full(QueueType* q) {
	return (q->front == (q->rear + 1) % MAX_QUEUE_SIZE);
}
void enqueue(QueueType* q, element item) {
	if (is_full(q))
		error("큐가 포화상태입니다.");
	q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
	q->queue[q->rear] = item;
}
element dequeue(QueueType* q) {
	if (is_empty(q))
		error("큐가 공백상태입니다.");
	q->front = (q->front + 1) % MAX_QUEUE_SIZE;
	return (q->queue[q->front]);
}
void level_order(TreeNode* ptr) {
	QueueType q;
	init(&q);

	if (ptr == NULL)
		return;

	enqueue(&q, ptr);
	
	while(!is_empty(&q)){
		ptr = dequeue(&q); // 큐에서 하나를 빼서 ptr에. 노드 전체를 가리키기 위해서 ptr->data가 아니라 ptr
		printf("[%d]", ptr->data);
		if (ptr->left) // 포인터가 왼쪽을 가리킨다면
			enqueue(&q, ptr->left);
		if(ptr->right)
			enqueue(&q, ptr->right);
	}
}