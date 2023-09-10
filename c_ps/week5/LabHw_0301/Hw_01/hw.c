// 20220830 컴퓨터학과 정여진
// 2023-04-08
// HW(뽑기 - 4진수) 
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void pick(int n, int* bucket, int bucketSize, int k) {

	int i, lastIndex, smallest = 0, item;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++)
			printf("%d", bucket[i]);
		printf("\n");
		return;
	}

	lastIndex = bucketSize - k - 1;
	smallest = 0;

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1);
	}
}  
int main(void) {

	int n, i;
	int* bucket;

	scanf("%d", &n);

	if (n <= 0)
		return 0;

	bucket = (int*)malloc(sizeof(int) * n);

	if (!bucket) {
		printf("error");
		return 0;
	}

	for (i = 0; i < n; i++)
		bucket[i] = 0;

	pick(4, bucket, n, n);

	free(bucket);
	return 0;
}