#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h> // exit(1)
#define MAX_LIST_SIZE 5
typedef int element;
typedef struct {
	element array[MAX_LIST_SIZE];
	int size;
}ArrayListType;
void error(char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}
void init(ArrayListType* L) {
	L->size = 0;
}
int is_empty(ArrayListType* L) {
	return L->size == 0;
}
int is_full(ArrayListType* L) {
	return L->size == MAX_LIST_SIZE;
}
element get_entry(ArrayListType* L, int pos) {
	if (pos < 0 || pos >= L->size)
		error("위치 오류");
	return L->array[pos];
}
void print_list(ArrayListType* L) {
	int i;
	for (i = 0; i < L->size; i++) {
		printf("%d->", L->array[i]);
	}
	printf("리스트 끝\n");
}
void insert_last(ArrayListType* L, element item) {
	if (is_full(L)) {
		printf("리스트 오버플로우\n");
		return;
	}
	L->array[L->size++] = item;
}
void insert_first(ArrayListType* L, element item) {
	if (is_full(L)) {
		printf("리스트 오버플로우\n");
		return;
	}
	L->size++;
	
	for (int i = L->size - 1; i >= 0; i--)
		L->array[i + 1] = L->array[i];
	L->array[0] = item;
}
void insert(ArrayListType* L, int pos, element item) {
	if (!is_full(L) && pos >= 0 && pos <= L->size) {
		for (int i = (L->size - 1); i >= pos; i--)
			L->array[i + 1] = L->array[i];
		L->array[pos] = item;
		L->size++;
	}
}
element delete(ArrayListType* L, int pos) {
	element item;

	if (pos < 0 || pos >= L->size)
		error("위치 오류");
	item = L->array[pos];

	for (int i = pos; i < (L->size - 1); i++)
		L->array[i] = L->array[i + 1];
	L->size--;

	return item;
}
void clear_list(ArrayListType* L) {
	for (int i = 0; i < L->size; i++) {
		// 데이터 요소를 해제
		free(L->array[i]);
	}
	L->size = 0; 
}
int get_length(ArrayListType* L) {
	int count = 0;
	
	for (int i = 0; i < L->size; i++)
		count++;
	return count;
}
element replace(ArrayListType* L, int pos, int item) {
	int temp = 0;

	temp = L->array[pos];
	L->array[pos] = item;
	item = temp;

	return L->array[pos];
}
int is_in_list(ArrayListType* L, int item) {
	for (int i = 0; i < L->size; i++) {
		if (item == L->array[i])
			return 1;
	}
	return 0;
}
void delete_by_key(ArrayListType *L, int item) {
	for (int i = 0; i < L->size; i++) {
		if (item == L->array[i]) {
			delete(L, i);
			return; // 더 이상 처리가 필요 없으므로 함수를 종료한다.
		}
	}
	printf("삭제하려는 key값 %d는 리스트에 없습니다.\n", item);
}
int main(void) {

	ArrayListType list1;

	init(&list1);
	insert(&list1, 0, 20);
	insert(&list1, 0, 10);
	print_list(&list1);
	clear_list(&list1);
	print_list(&list1);

	insert_last(&list1, 90);
	print_list(&list1);

	insert(&list1, 0, 30);
	insert(&list1, 0, 20);
	insert(&list1, 0, 10);
	print_list(&list1);

	delete(&list1, 2);
	print_list(&list1);

	printf("\n-이 이후는 hw1_1에서 추가한 함수들 테스트-\n");
	insert_first(&list1, 9);
	print_list(&list1);
	insert_last(&list1, 99);
	print_list(&list1);

	insert_first(&list1, 1); // 리스트 오버플로우 출력해야돼 -> 바로 끝나버리네 -> exit(1) 지웠더니 끝까지 돌아(100까지)
	print_list(&list1);
	
	printf("길이는 %d\n", get_length(&list1));
	printf("3번째 데이터는 %d\n", get_entry(&list1, 2));
	
	replace(&list1, 3, 40);
	print_list(&list1);
	printf("20은 리스트에 %s\n", is_in_list(&list1, 20) ? "있습니다" : "없습니다");
	printf("22는 리스트에 %s\n", is_in_list(&list1, 22) ? "있습니다" : "없습니다");

	delete_by_key(&list1, 20);
	print_list(&list1);
	delete_by_key(&list1, 22);
	print_list(&list1);
	
	return 0;
}
