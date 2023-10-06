#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
typedef int element;
typedef struct ListNode {
	element data;
	struct ListNode* link;
}ListNode;
void print_list(ListNode* head) {
	ListNode* p;

	if (head == NULL)
		return;

	p = head->link;
	
	while (p != head) {
		printf("%d->", p->data);
		p = p->link;
	}
	printf("%d->\n", head->data);
}
ListNode* insert_first(ListNode* head, element data) {
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	node->data = data;

	if (head == NULL) {
		head = node;
		node->link = node;
	}
	else {
		node->link = head->link;
		head->link = node;
	}
	return head;
}
ListNode* insert_last(ListNode* head, element data) {
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	node->data = data;

	if (head == NULL) {
		head = node;
		node->link = node;
	}
	else {
		node->link = head->link;
		head->link = node;
		head = node;
	}
	return head;
}
ListNode* delete_first(ListNode* head) {
	ListNode* temp;
	if (head == NULL) {
		printf("리스트가 비어 삭제를 못함\n");
		return NULL;
	}
	else if(head->link == head){
		temp = head;
		head = NULL;
		free(temp);
	}
	else {
		temp = head->link;
		head->link = temp->link;
		free(temp);
	}
	return head;
}
ListNode* delete_last(ListNode* head) {
	ListNode* temp;
	ListNode* removed;

	if (head == NULL) {
		printf("리스트가 비어 삭제를 못함\n");
		return NULL;
	}
	else if (head->link == head) {
		removed = head;
		head = NULL;
		free(removed);
	}
	else {
		// 리스트에 두 개 이상의 노드가 있는 경우
		temp = head->link;
		while(temp->link != head)
			temp = temp->link;
		temp->link = head->link;
		removed = head;
		head = temp;
		free(removed);
	}
	return head;
}
ListNode* search(ListNode* head, element data) {
	
	ListNode* temp;

	if (head == NULL) {
		printf("리스트가 비어 데이터를 찾을 수 없음\n");
		return NULL;
	}
	temp = head->link;
	do{
		if (temp->data == data)
			return temp;
		temp = temp->link;
	} while (temp != head->link);
	
	printf("리스트에 없음\n");
	return NULL;
}
ListNode* get_size(ListNode* head) {
	ListNode* temp;
	int count = 1;

	if (head == NULL)
		return 0;

	temp = head->link;

	while (temp != head) {
		count++;
		temp = temp->link;
	}
	return count;
}
int main(void) {
	
	ListNode* head = NULL;
	ListNode* node = NULL;
	int size = 0;

	// list = 10->20->30->40
	head = insert_last(head, 20);
	print_list(head);

	head = insert_last(head, 30);
	print_list(head);
	head = insert_last(head, 40);
	print_list(head);
	head = insert_first(head, 10);
	print_list(head);

	head = delete_first(head);
	print_list(head);
	
	head = delete_last(head);
	print_list(head);
	
	node = search(head, 20);
	printf("%d\n", node->data);
	
	size = get_size(head);
	printf("%d\n", size);

	return 0;
}