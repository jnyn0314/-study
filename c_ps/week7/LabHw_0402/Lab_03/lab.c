// Lab(bubble)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void bubbleSort(int* A, int n) {
	int i, j, temp;

	for (i = 0; i < n - 1; i++) {
		for (j = 0; j < n - 1 - i; j++) {
			if (A[j] > A[j + 1]) {
				temp = A[j];
				A[j] = A[j + 1];
				A[j + 1] = temp;
			}
		}
	}
}
int main(void) {

	srand((unsigned)time(NULL));

	int n;
	int* a;

	scanf("%d", &n);

	if (n <= 0)
		return 0;

	a = (int*)malloc(sizeof(int) * n);

	if (!a)
		return 0;

	for (int i = 0; i < n; i++) {
		a[i] = rand() % 1000;
	}

	bubbleSort(a, n);

	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}


	free(a);
	return 0;
}