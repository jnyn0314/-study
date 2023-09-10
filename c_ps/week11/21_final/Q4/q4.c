#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int pick(int n, int *bucket, int bucketSize, int k, int *list) {
	int i, lastIndex, smallest, item, sum = 0, j, count = 0;

	if(k == 0){
		for (i = 0; i < bucketSize; i++)
			sum = sum + list[bucket[i]];
		if (sum == bucketSize) {
			for (j = 0; j < bucketSize; j++)
			if (list[bucket[j]] != 0)
				printf("%d", list[bucket[j]]);
			printf("\n");
		}
		count++;
		return count;
	}

	lastIndex = bucketSize - k - 1;

	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex];

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		count = count + pick(n, bucket, bucketSize, k - 1, list);
	}
}
int main(void) {

	int n, i;
	int list[3] = { 1, 2 , 0};
	int* bucket;

	scanf("%d", &n);
	bucket = (int*)malloc(sizeof(int) * n);

	for (i = 0; i < n; i++)
		bucket[i] = 0;

	int count = pick(3, bucket, n, n, list);
	printf("%d", count);
	free(bucket);
	return 0;
}