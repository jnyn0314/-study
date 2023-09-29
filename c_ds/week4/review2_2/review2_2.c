#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

typedef struct ListNode{
	int number;
	struct ListNode* link;
}ListNode;
void displayList1(ListNode* head) {
	ListNode* temp = head;
	while (temp != NULL) {
		printf("%d->", temp->number);
		temp = temp->link;
	}
}
void displayList2(ListNode* head) {
	ListNode* temp = head;
	printf("%d->", temp->number);
	if (temp->link == NULL)
		return 1;
	return displayList2(temp->link);
}
int main(void)
{
	// 1)
	ListNode* head, * newNode, *temp;
	
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->number = 10;
	newNode->link = NULL;
	head = newNode;

	// 2)
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->number = 20;
	newNode->link = NULL;
	head->link = newNode;

	// 3)
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->number = 30;
	newNode->link = NULL;
	head->link->link = newNode;

	// 4)
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->number = 44;
	newNode->link = NULL;
	
	temp = head;
	while (temp->link != NULL)
		temp = temp->link;
	temp->link = newNode;
	
	// 5)
	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->number = 1;
	newNode->link = head;
	head = newNode;

	// 6), 7) Ãâ·Â
	displayList1(head);
	printf("\n");
	displayList2(head);
}