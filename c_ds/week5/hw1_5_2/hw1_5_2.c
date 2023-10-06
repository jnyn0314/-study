#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_CHAR_PER_LINE 100
typedef struct {
	char line[MAX_CHAR_PER_LINE];
} element;
typedef struct ListNode {
	element data;
	struct ListNode* link;
} ListNode;
void error(char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}
ListNode* insert_first(ListNode* head, element data) {
	ListNode* list = (ListNode*)malloc(sizeof(ListNode));
	list->data = data;
	list->link = head;
	head = list;
	return head;
}
ListNode* insert_pos(ListNode* head, int pos, element value) {
	if (pos < 0)
		error("pos값이 너무 작습니다.");
	else if (pos == 0) { // insert_first
		ListNode* p = (ListNode*)malloc(sizeof(ListNode));
		p->data = value;
		p->link = head;
		head = p;
	}
	else {
		ListNode* temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp->link;
			if (temp == NULL) {
				error("pos값이 너무 큽니다.");
			}
		}
		ListNode* p = (ListNode*)malloc(sizeof(ListNode));
		p->data = value;
		p->link = temp->link;
		temp->link = p;
	}
	return head;
}
ListNode* delete_pos(ListNode* head, int pos) {
	if (pos < 0)
		error("pos값이 너무 작습니다.");
	if (head == NULL)
		error("삭제할 항목이 없음");

	if (pos == 0) { // delete_first
		ListNode* temp = head;
		head = temp->link;
		free(temp);
	}
	else {
		ListNode* temp = head;
		ListNode* prevTemp = NULL;
		for (int i = 0; i < pos; i++) {
			prevTemp = temp;
			temp = temp->link;
			if (temp == NULL) {
				error("pos값이 너무 큽니다.");
			}
		}
		prevTemp->link = temp->link;
		free(temp);
	}
	return head;
}
void display_te(ListNode* head) {
	ListNode* p;
	p = head;
	int i;
	printf("\n-----------text edited---------\n");
	while (p != NULL) {
		printf("(%d) %s", p->data.line, p->data);
	}
	printf("------------------------------\n");
}
element get_entry(ListNode* head, int pos) {
	ListNode* p = head;
	for (int i = 0; i < pos; i++)
		p = p->link;
	return p->data;
}
int get_length(ListNode* head) {
	ListNode* p = head;
	int count = 0;

	while (p != NULL) {
		p = p->link;
		count++;
	}
	return count;
}
char askChoice(void) {
	char choice;
	printf("------------------------------\n");
	printf("a: 텍스트 끝에 라인 추가\n");
	printf("i: 라인 번호로 라인 추가\n");
	printf("d: 라인 번호로 라인 삭제\n");
	printf("v: 라인 번호로 해당 라인 출력\n");
	printf("p: 전체 텍스트 출력\n");
	printf("q: 끝\n");
	printf("메뉴 선택:");
	scanf(" %c", &choice); // Use a space before %c to skip leading whitespace.
	return choice;
}
int main(void){

	ListNode* list = NULL;
	char choice;
	int lineNb;
	element newElement;
	while ((choice = askChoice()) != 'q') {
		switch (choice) {
		case 'a':
			printf("텍스트 끝에 삽입할 라인: ");
			fflush(stdin);
			fgets(newElement.line, MAX_CHAR_PER_LINE, stdin);
			// 코드 삽입
			insert_first(list, newElement);
			display_te(list);
			break;
		case 'i':
			printf("삽입할 라인 번호: ");
			scanf("%d", &lineNb);

			printf("삽입할 라인: ");
			fflush(stdin);
			fgets(newElement.line, MAX_CHAR_PER_LINE, stdin);
			// 코드
			insert_pos(list, lineNb, newElement);
			display_te(list);
			break;
		case 'd':
			printf("삭제할 라인 번호: ");
			scanf("%d", &lineNb);
			delete_pos(list, lineNb);
			display_te(list);
			//코드
			break;
		case 'v':
			printf("출력할 라인 번호: ");
			scanf("%d", &lineNb);
			if (lineNb >= 1 && lineNb <= get_length(list))
				printf("(%d) %s\n", lineNb, get_entry(list, lineNb - 1));
			else
				error("라인 번호가 범위 내에 없습니다.");
			display_te(list);
			break;
		case 'p':
			display_te(list);
		}
		while (getchar() != '\n');
		return 0;
	}
}
