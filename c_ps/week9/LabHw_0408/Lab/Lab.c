#define _CRT_SECURE_NO_WARNINGS
#include<stdlib.h>
#include<stdio.h>
#include<time.h>
void merge(int* A, int p, int q, int r, int* B) {
	int i, j, t;

	i = p;
	j = q + 1;
	t = p;

	while (i <= q && j <= r) {
		if (A[i] < A[j]) {
			B[t] = A[i];
			i++;
		}
		else {
			B[t] = A[j];
			j++;
		}
		t++;
	}
	// ¿Ö?
	if (j > r) {
		for (; i <= q; i++, t++)
			B[t] = A[i];
	}
	else {
		for (; j <= r; j++, t++)
			B[t] = A[j];
	}

	for (i = p; i <= r; i++)
		A[i] = B[i];


}

void mergeSort(int *A, int p, int r, int *B) {
	int q;
	
	if (p < r) {
		q = (p + r) / 2;
		mergeSort(A, p, q, B);
		mergeSort(A, q + 1, r, B);
		merge(A, p, q, r, B);
	}
}

int main(void) {
	
	int n;
	int* A, *B;
	int i; 
	
	srand(time(NULL));

	scanf("%d", &n);

	A = (int*)malloc(sizeof(int) * n);
	B = (int*)malloc(sizeof(int) * n);

	for (i = 0; i < n; i++) {
		A[i] = rand() % 100;
	}

	for (i = 0; i < n; i++)
		printf("%d ", A[i]);
	printf("\n");

	mergeSort(A, 0, n - 1, B);

	for (i = 0; i < n; i++)
		printf("%d ", A[i]);
	printf("\n");

	free(B);
	free(A);
	return 0;
}