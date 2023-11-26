// 배열로 구현된 힙 트리
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define MAX_ELEMENT 200
#define TRUE 1
#define FALSE 0
typedef struct {
	int key;
}element;
typedef struct {
	element heap[MAX_ELEMENT];
	int heap_size;
}HeapType;
HeapType* create() {
	return (HeapType*)malloc(sizeof(HeapType));
}
void init(HeapType* h) {
	h->heap_size = 0;
}
void insert_max_heap(HeapType* h, element item) {
	int i;
	i = ++(h->heap_size);

	while ((i != 1) && item.key > h->heap[i / 2].key) {
		h->heap[i] = h->heap[i / 2];
		i /= 2;
	}
	h->heap[i] = item;
}
element delete_max_heap(HeapType* h) {
	int parent, child;
	element item, temp;
	item = h->heap[1];
	temp = h->heap[(h->heap_size)--];
	parent = 1;
	child = 2;

	while (child <= h->heap_size) {
		if ((child < h->heap_size) && h->heap[child].key < h->heap[child].key)
			child++;
		if (temp.key >= h->heap[child].key)
			break;
		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}
	h->heap[parent] = temp;
	return item;
}
void preorder(HeapType* h, int root) {
	int child;
	if (root <= h->heap_size && h->heap[root].key != NULL) {
		printf("%d ", h->heap[root].key);
		child = root * 2;
		preorder(h, child);
		preorder(h, child + 1);
	}
}
void print_heap(HeapType* h) {
	int root = 1, level = 1;

	while (root <= h->heap_size) {
		for (int i = 0; i < level && root <= h->heap_size; i++) {
			printf("%d ", h->heap[root].key);
			root++;
		}
		printf("\n");
		level = level * 2;
	}
}
int find(HeapType* h, int root, int key) {
	
	while (root <= h->heap_size) {
		if(h->heap[root].key == key) {
			return root;
		}
		root++;
	}
	return 0;
}
void print_sorted_value(HeapType* h) {
	int i;
	HeapType* temp_heap = create();
	init(temp_heap);

	for (i = 1; i <= h->heap_size; i++) {
		insert_max_heap(temp_heap, h->heap[i]);
	}

	for (i = 1; i <= temp_heap->heap_size; i++) {
		printf("%d ", temp_heap->heap[i].key);
	}
	printf("\n");

	free(temp_heap);
}
void heap_sort(element a[], int n) {
	int i;
	HeapType* h;
	h = create();
	init(h);
	for (i = 0; i < n; i++) {
		insert_max_heap(h, a[i]);
	}
	for (i = 0; i < n; i++ ) {
		a[i] = delete_max_heap(h);
	}
	free(h);
}
void modify_priority(HeapType* h, int key1, int key2) {
	element a[MAX_ELEMENT];
	int i = 0;
	while (find(h, 1, key1)) {
		a[i++] = delete_max_heap(h);
	}
	insert_max_heap(h, (element) { key2 });
	for (int j = 0; j < i; j++) {
		insert_max_heap(h, a[j]);
	}
}
int main(void)
{
	element e1 = { 10 }, e2 = { 5 }, e3 = { 30 }, eA = { 9 }, eB = { 19 }, eC = { 39 };
	element e4, e5, e6;
	int index;
	int key, oldKey, newKey;
	HeapType heap; // 히프 생성 
	init(&heap); // 초기화 

	printf("Step1: 삽입된 10, 5, 30 에 추가적으로 9, 19, 39 를 <삽입> 한다");
	insert_max_heap(&heap, e1);
	insert_max_heap(&heap, e2);
	insert_max_heap(&heap, e3);
	insert_max_heap(&heap, eA);
	insert_max_heap(&heap, eB);
	insert_max_heap(&heap, eC);

	printf("\nStep2: preorder, print_heap 함수 테스트\n");
	preorder(&heap, 1);
	printf("\n\n");
	print_heap(&heap);

	e4 = delete_max_heap(&heap);
	printf("\n 삭제: 루트가 삭제됨\n", e4.key);
	print_heap(&heap);

	printf("\nStep3: find 함수 테스트\n");
	printf("찾을 key 입력(-1 for exit):");
	scanf("%d", &key);
	while (key != -1) {
		if ((index = find(&heap, 1, key)) == 0)
			printf("%d 는 없음\n", key);
		else
			printf("%d 은 [%d]에 있음\n", key, index);
		printf("찾을 key 입력(-1 for exit):");
		scanf("%d", &key);
	}

	printf("\nStep4: print_sorted_value 함수 테스트\n");
	print_sorted_value(&heap);

	printf("\nStep5: modify_priority 함수 테스트\n");
	printf("바꿀 key 입력(-1 for exit):");
	scanf("%d", &oldKey);
	while (oldKey != -1) {
		printf("새 key 입력:");
		scanf("%d", &newKey);
		modify_priority(&heap, oldKey, newKey);
		print_heap(&heap);
		printf("바꿀 key 입력(-1 for exit):");
		scanf("%d", &oldKey);
	}
}
