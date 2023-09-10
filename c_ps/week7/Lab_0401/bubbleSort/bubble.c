// Lab(bubble)
#include<stdio.h>
void bubbleSort(int *A, int n) {
	int i;
	for (i = 0; i < n - 1; i++) { // n - 1 반복. 인접한 두 숫자의 sub 배열의 끝까지 순서만 바꿈
		int j;
		for (j = 0; j < n - 1 - i; j++) {
			if (A[j] > A[j + 1]) {
				int temp;
				temp = A[j];
				A[j] = A[j + 1];
				A[j + 1] = temp;
			}
		}
	}
}
int main(void) {

	int array[5] = { 0, 6, 89, 33, 7 };
	int i;

	bubbleSort(array, 5);

	for(i = 0; i < 5; i++)
		printf("%d ", array[i]);

	return 0;
}