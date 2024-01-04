#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void bubbleSort(int num[], int N) {

	int i, j, temp = 0;

	for (i = 0; i < N - 1; i++) {
		for (j = 0; j < N - 1 - i; j++) {
			if (num[j] < num[j + 1]) {
				temp = num[j];
				num[j] = num[j + 1];
				num[j + 1] = temp;
			}
		}
	}
}
int cutLine(int num[], int k, int N) {
	int i, cutLineNumber = 0;
	
	bubbleSort(num, N);
	
	for (i = 0; i < k; i++) {
		cutLineNumber = num[i];
	}
	return cutLineNumber;
}
int main(void) {

	int N, k, i, cutLineNumber = 0;
	int stu[10000];
		
	scanf("%d %d", &N, &k);

	for (i = 0; i < N; i++) {
		scanf("%d", &stu[i]);
	}

	cutLineNumber = cutLine(stu, k, N);

	printf("%d", cutLineNumber);
	return 0;
}