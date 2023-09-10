#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void pick(int* list, int n, int* bucket, int bucketSize, int k, int money) {

	int i, lastIndex, smallest, item, sum = 0, j;

	if (n == 0)
		return;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			sum += list[bucket[i]];
		}
		if (sum == money) {
			for (j = 0; j < bucketSize; j++) {
				if (list[bucket[j]] != 0) 
					printf("%d ", list[bucket[j]]);
			}
			printf("\n");
		}
		return;
	}

	lastIndex = bucketSize - k - 1;

	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex];

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(list, n, bucket, bucketSize, k - 1, money);
	}
}
int main(void) {

	int items[] = { 1000, 5000, 10000, 0 };
	int *bucket;

	int money;

	scanf("%d", &money);

	int count = (money) / 1000;

	bucket = (int*)malloc(sizeof(int) * count);

	pick(items, 4, bucket, count, count, money);

	free(bucket);
	return 0;
}
