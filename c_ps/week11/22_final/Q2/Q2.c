#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h> 
int pick(int* list, int n, int* bucket, int bucketSize, int k, int money) {
	int c = 0;

	int i, lastIndex, smallest, item, sum = 0, j;
	
	if (n == 0)
		return 0;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) 
			sum += list[bucket[i]];
		if (sum == money) 
			return 1;
		return 0;
	}

	lastIndex = bucketSize - k - 1;

	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex];

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;

		c += pick(list, n, bucket, bucketSize, k - 1, money);
	}
	return c;
}
int main(void) {

	int items[] = {1, 2, 3, 0};
	int* bucket;

	int money;

	scanf("%d", &money);

	int count = (money);

	bucket = (int*)malloc(sizeof(int) * count);

	printf("%d", pick(items, 4, bucket, count, count, money));

	free(bucket);
	return 0;
}

