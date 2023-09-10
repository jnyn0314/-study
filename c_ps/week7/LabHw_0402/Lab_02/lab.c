// 2023-04-12
// 동적할당, 정렬
// 2023-04-12
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void selectionSort(int* A, int n) {
	int i, j, temp, max, max_index;

	for (i = 0; i < n - 1; i++) {
		max = A[0];
		max_index = 0;
		for (j = 0; j < n - i; j++) {
			if (max < A[j]) {
				max = A[j];
				max_index = j;
			}
		}
		temp = A[max_index];
		A[max_index] = A[n - i - 1];
		A[n - i - 1] = temp;
	}
} // 배열 A를 정렳한다. 
int main(void) {

	// 시드값 설정
	srand((unsigned)time(NULL));

	int n;
	int* a;

	printf("Enter a number:");
	scanf("%d", &n);

	a = (int*)malloc(sizeof(int) * n);

	if (n <= 0)
		return 0;
	if (!a)
		return 0;

	int i;

	for (i = 0; i < n; i++) {
		a[i] = rand() % 1000;
	}
	for (i = 0; i < n; i++)
		printf("%d ", a[i]);

	selectionSort(a, n);
	
	printf("\n정렬된 후");
	for (i = 0; i < n; i++)
		printf("%d ", a[i]);

	free(a);
	return 0;
}