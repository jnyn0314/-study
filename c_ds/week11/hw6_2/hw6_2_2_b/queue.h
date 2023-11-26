#pragma once
#ifndef MYHEADER_H
#define MYHEADER_H
typedef int element;
typedef struct QueueNode {
	element item;
	struct QueueNode* link;
}QueueNode;
typedef struct {
	QueueNode* front, * rear;
}QueueType;
void error(char* message);
void init(QueueType* q);
int is_empty(QueueType* q);
int is_full(QueueType* q);
void enqueue(QueueType* q, element item);
element dequeue(QueueType* q);
#endif