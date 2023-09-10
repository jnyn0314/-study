// 20220803 컴퓨터학과 정여진
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void swap(int A[], int i, int j) {
	int temp = A[j];
	A[j] = A[i];
	A[i] = temp;
}
int partition(int* A, int p, int r) {
	int i, j;

	i = p - 1;

	for (j = p; j < r; j++) {
		if (A[j] < A[r]) {
			i++;
			swap(A, i, j);
		}
	}
	i++;
	swap(A, i, j);

	return i;
} // 분할
int find(int* A, int p, int q, int i) {
	
	int r;
	
	if (p <= q) {
		r = partition(A, p, q);

		if (i == r) {
			return A[i];
		}
		else if (i < r) {
			find(A, p, r - 1, i);
		}
		else
			find(A, r + 1, q, i);
	}
}
int main(void) {

	int n;
	int* A;
	int key;
	int j;
	int rslt;

	srand(time(NULL));

	printf("Enter the number of numbers: ");
	scanf("%d", &n);

	A = (int*)malloc(sizeof(int) * n);

	for (int i = 0; i < n; i++)
		A[i] = rand() % 1000;
	
	if (!A)
		return 0;
	if (n <= 0)
		return 0;

	for (int i = 0; i < n; i++)
		printf("%d ", A[i]);
	
	printf("\n몇번째로 작은 수:");
	scanf("%d", &key);

	rslt = find(A, 0, n - 1, key -1);

	printf("\n%d번째 작은 수는 %d", key, rslt);

	free(A);
	return 0;
}