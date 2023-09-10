#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
// 이건 오름차순 정렬이 아니야!
void insertionSort(int* A, int n) {
	int i;
	int j, k, temp;

	for (i = 1; i < n; i++) {
		for (j = 0; j < i; j++)
			if (A[j] > A[i])
				break;
		temp = A[i];
		for (k = 0; k > j; k--)
			A[k] = A[k - 1];
		A[j] = temp;
	}
}
int main(void) {

	return 0;
}