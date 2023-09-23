#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX_QUEUE_SIZE 3

// typedef char element;

typedef struct {
	char name[10];
	char gender[2];
}element;

typedef struct {
	element man[MAX_QUEUE_SIZE];
	int front;
	int rear;
}QueueType;

void error(char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

void init_queue(QueueType* p) {
	p->front = -1;
	p->rear = -1;
}

int is_empty(QueueType* p) {
	if (p->front == p->rear)
		return 1;
	else
		return 0;
}

int is_full(QueueType* p) {
	if ((p->rear + 1) % MAX_QUEUE_SIZE == p->front)
		return 1;
	else
		return 0;
}

void enqueue(QueueType* p, element item) {
	if (is_full(p)) {
		error("큐가 포화상태입니다.");
		return;
	}
	p->man[++(p->rear)] = item;
}

element dequeue(QueueType* p) {
	if (is_empty(p)) {
		error("큐가 공백상태입니다.");
	}
	element item = p->man[++(p->front)];
	return item;
}

int get_count(QueueType *p) {
	return p->rear - p->front;
}

void print_queue(QueueType* p) {
	for(int i = p->front + 1; i <= p->rear; i++)
		printf("%s ", p->man[i].name);
}

int main(void) {

	QueueType manQ;
	element newPerson;

	init_queue(&manQ);

	printf("이름을 입력:");
	scanf("%s", newPerson.name);
	enqueue(&manQ, newPerson);

	printf("이름을 입력:");
	scanf("%s", newPerson.name);
	enqueue(&manQ, newPerson);

	printf("이름을 입력:");
	scanf("%s", newPerson.name);
	enqueue(&manQ, newPerson);

	printf("%d명: ", get_count(&manQ));
	print_queue(&manQ);
	
	return 0;
}