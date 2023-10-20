#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_QUEUE_SIZE 3
// typedef char element;
typedef struct {
	char name[10];
	char gender;
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
	if (p->rear == MAX_QUEUE_SIZE - 1)
		return 1;
	else
		return 0;
}
void enqueue(QueueType* p, element item) {
	/*
	if (is_full(p)) {
		error("아직 대상자가 없습니다. 대기자가 꽉찼으니 담 기회를 이용");
	}
	*/
	p->man[++(p->rear)] = item;
}
element dequeue(QueueType* p) {
	if (is_empty(p)) {
		error("큐가 공백상태입니다.");
	}
	element item = p->man[++(p->front)];
	return item;
}
element peek(QueueType* q)
{
	if (is_empty(q))
	{
		printf("큐가 포화상태입니다.");
	}
	else return q->man[(q->front) % MAX_QUEUE_SIZE];
}
int get_count(QueueType *p) {
	return p->rear - p->front;
}
void print_queue(QueueType* q) {
	int start = (q->front + 1) % MAX_QUEUE_SIZE;
	int end = (q->rear + 1) % MAX_QUEUE_SIZE;

	for (int i = start; i != end; i = (i + 1) % MAX_QUEUE_SIZE) {
		printf("%s ", q->man[i].name);
	}
}
void find_mate(QueueType *manQ, QueueType *womanQ, element item) {
	
	if(!is_empty(manQ) && !is_empty(womanQ)) {

		printf("커플이 탄생했습니다!");
		printf("%s %s\n", manQ->man[manQ->front + 1].name, womanQ->man[womanQ->front + 1].name);
		dequeue(manQ);
		dequeue(womanQ);
	}
	else if (is_full(manQ) || is_full(womanQ)) {
		printf("아직 대상자가 없습니다. 대기자가 꽉 찼으니 담 기회를 이용");
		if (is_full(manQ))
			dequeue(manQ);
		else if(is_full(womanQ))
			dequeue(womanQ);
	}
	else
		printf("아직 대상자가 없습니다. 기다려주십시요.\n");
}
void check_gender(char *gen, QueueType *manQ, QueueType *womanQ, element newPerson) {
	
	if (gen == 'm') {
		enqueue(manQ, newPerson); // enqueue(*manQ, newPerson); 이렇게 하면 반복문 안돌아가
	}
	else {
		enqueue(womanQ, newPerson);
	}
}
int main(void) {

	QueueType manQ, womanQ;
	element newPerson;

	init_queue(&manQ);
	init_queue(&womanQ);

	char input = 0;
	char gender = 0;

	printf("미팅 주선 프로그램입니다.");
	do {
		printf("\ni<nsert, 고객입력>, c<heck, 대기자 체크>, q<uit>:");
		scanf(" %c", &input);
		
		if (input == 'i') {
			printf("이름을 입력:");
			scanf("%s", newPerson.name);
			printf("성별을 입력<m or f>:");
			scanf(" %c", &newPerson.gender);

			check_gender(newPerson.gender, &manQ, &womanQ, newPerson); // 여기서 큐에 삽입까지 한번에
			find_mate(&manQ, &womanQ, newPerson);
		}
		else if (input == 'c') {
			printf("남성 대기자 %d명: ", get_count(&manQ));
			print_queue(&manQ);
			printf("여성 대기자 %d명: ", get_count(&womanQ));
			print_queue(&womanQ);
		}
	} while (input != 'q');
	
	return 0;
}