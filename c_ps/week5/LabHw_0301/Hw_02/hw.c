// 20220803 컴퓨터학과 정여진
// 2023-04-10
// 뽑기 - 수식 나열
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void pick(int n, int* bucket, int bucketSize, int k, char list[]) {
	int lastIndex, i, smallest, item;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			printf("%c ", list[bucket[i]]);
			printf("%d ", bucket[i]);
			
		}
		printf("\n");
		return;
	}

	lastIndex = bucketSize - k - 1;

	smallest = 0; // 이 부분만 차이 // 

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1, list);
	}
}
main() {

	int n = 2;
	int bucket[2];

	char list[2] = "+-";
	pick(n, bucket, 2, 2, list);

	return 0;
}
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include<stdlib.h>
int findSum(char c, int n, int sum) {
	if (c == '+') {
		sum += n;
	}
	else {
		sum -= n;
	}
	return sum;
}
void pick(int n, int* bucket, int bucketSize, int k, char list[]) {
	int lastIndex, i, smallest, item;

	if (k == 0) {
		int sum = 0;
		for (i = 0; i < bucketSize; i++) {
			printf("%c ", list[bucket[i]]);
			printf("%d ", i + 1);
			sum = findSum(list[bucket[i]], i + 1, sum);
		}
		printf(" = %d\n", sum);
		return;
	}

	lastIndex = bucketSize - k - 1;

	smallest = 0; 

	for (item = smallest; item < n; item++) {
		// if(lastIndex >= 0)
		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1, list);
	}
}
int main(void) {

	int n, i;
	int *bucket;

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

	char list[2] = { '+', '-' };

	pick(2, bucket, n, n, list);

	free(bucket);
	return 0;
}
