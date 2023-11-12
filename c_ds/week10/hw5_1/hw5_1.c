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
	HeapType newH;
	init(&newH); 

	for (int i = 1; i <= h->heap_size; i++) {
		insert_max_heap(&newH, h->heap[i]); 
	}

	while (newH.heap_size > 0) {
		element max_element = delete_max_heap(&newH); 
		printf("%d ", max_element.key);
	}
	printf("\n");
}

int main(void) {
	element e1 = { 10 }, e2 = { 5 }, e3 = { 30 }, eA = { 9 }, eB = { 19 }, eC = { 39 };
	element e4;
	HeapType heap;
	init(&heap);
	insert_max_heap(&heap, e1);
	insert_max_heap(&heap, e2);
	insert_max_heap(&heap, e3);
	insert_max_heap(&heap, eA);
	insert_max_heap(&heap, eB);
	insert_max_heap(&heap, eC);
	preorder(&heap, 1); // 39 15 5 9 30 10 
	printf("\n");
	
	print_heap(&heap); // 39 \n 19 30 \n 5 9 10

	int index = find(&heap, 1, 9);
	printf("\n%d\n", index); // 5

	print_sorted_value(&heap); // 39 30 19 10 9 5
	e4 = delete_max_heap(&heap); 
	printf("\n<%d>\n", e4.key); // 39
	print_heap(&heap); // 30 19 10 9 5

	e4 = delete_max_heap(&heap);
	printf("\n<%d>\n", e4.key);
	print_heap(&heap);
}