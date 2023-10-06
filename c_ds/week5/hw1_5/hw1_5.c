#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
typedef int element;
typedef struct DListNode {
	element data;
	struct DListNode *llink;
	struct DListNode* rlink;
}DListNode;
void init(DListNode* phead) { // 이중 연결 리스트를 초기화
	phead->llink = phead;
	phead->rlink = phead;
}
void print_dlist(DListNode* phead) {
	DListNode* p;

	for (p = phead->rlink; p != phead; p = p->rlink) {
		printf("<-| |%d| |-> ", p->data);
	}
	printf("\n");
}
void dinsert(DListNode* before, element data) {
	DListNode* newNode = (DListNode*)malloc(sizeof(DListNode));
	newNode->data = data;;

	newNode->llink = before;
	newNode->rlink = before->rlink;
	before->rlink->llink = newNode;
	before->rlink = newNode;
}
void ddelete(DListNode* head, DListNode* removed) {
	if (removed == head)
		return;
	removed->llink->rlink = removed->rlink;
	removed->rlink->llink = removed->llink;
	free(removed);
}
void print_reverse_dlist(DListNode* head) {
	DListNode* p;

	for (p = head->llink; p != head; p = p->llink) {
		printf("<-| |%d| |-> ", p->data);
	}
	printf("\n");
}
DListNode* search(DListNode* head, element data) {
	DListNode* p;

	for (p = head->rlink; p != head; p = p->rlink) {
		if (p->data == data)
			return p;
	}
	printf("해당 데이터가 없습니다.\n");
	return NULL;
}
int main(void) {

	DListNode* head = (DListNode*)malloc(sizeof(DListNode));
	init(head);
	
	printf("추가 단계\n");
	dinsert(head, 10);
	print_dlist(head);
	dinsert(head, 20);
	print_dlist(head);
	dinsert(head, 30);
	print_dlist(head);

	dinsert(head->llink, 99);
	print_dlist(head);

	printf("삭제 단계\n");
	ddelete(head, head->rlink); // 맨앞의 노드를 삭제
	print_dlist(head);
	ddelete(head, head->llink); // 맨뒤의 노드를 삭제
	print_dlist(head);

	printf("역순 순회 단계\n");
	print_reverse_dlist(head);

	printf("특정 데이터 찾기 단계\n");
	head = search(head, 99);
	printf("%d\n", head->data);

	free(head);
	return 0;
}