
#define _CRT_SECURE_NO_WARNINGS
/*
#include<stdio.h>
#include<stdlib.h>
int pick(int n, int* bucket, int bucketSize, int k, int *list, int L) {
	int i, lastIndex, smallest, item, count = 0, rslt = 0;
	if (k == 0) { // »Ì¾ß¾ß ÇÒ °¹¼ö = 0 (´Ù »Ì¾ÒÀ¸¸é)
		for (i = 0; i < bucketSize; i++) {
			// if(list[bucket[i]] != 0)
			if ((list[bucket[i]] + 1) % 2 == 0) {
				count++;
				if (count >= L)
					break;
			}
		}
		for (i = 0; i < bucketSize; i++) {
			if (count >= L) {
				//printf("%d", list[bucket[i]] + 1);
				return 1;
			}
			return 0;
		}
		//if(count >= L)
			//printf("\n");
		return 0; // ¹Ýµå½Ã, ¹«ÇÑ È£ÃâÀ» ¸·¾ÆÁÜ
	}

	lastIndex = bucketSize - k - 1;

	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex] + 1;

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		rslt = rslt + pick(n, bucket, bucketSize, k - 1, list, L);
	}
	return rslt;
}
int main(void) {
	int N, M, L;
	int* bucket;
	int* list;
	
	scanf("%d %d %d", &N, &M, &L);

	bucket = (int*)malloc(sizeof(int) * N);
	list = (int*)malloc(sizeof(int) * N);

	int i;
	
	for (i = 0; i < N; i++) {
		bucket[i] = 0;
	}
	for (i = 0; i < N; i++) {
		list[i] = i;
	} // 1 2 3 4 5 6

	printf("%d", pick(N, bucket, M, M, list, L));

	free(list);
	free(bucket);
	return 0;
}
*/
#include <stdio.h>
#include <stdlib.h>

int count = 0;

void pick(int n, int* bucket, int bucketSize, int k, int* list, int L) {
	if (k == 0) { // »Ì¾Æ¾ß ÇÒ °¹¼ö = 0 (´Ù »Ì¾ÒÀ¸¸é)
		int evenCount = 0;
		for (int i = 0; i < bucketSize; i++) {
			if ((list[bucket[i]] + 1) % 2 == 0) {
				evenCount++;
				if (evenCount >= L)
					break;
			}
		}
		if (evenCount >= L)
			count++;
		return;
	}

	int lastIndex = bucketSize - k - 1;
	int smallest = (bucketSize == k) ? 0 : bucket[lastIndex] + 1;

	for (int item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1, list, L);
	}
}

int main(void) {
	int N, M, L;
	int* bucket;
	int* list;

	scanf("%d %d %d", &N, &M, &L);

	bucket = (int*)malloc(sizeof(int) * M);
	list = (int*)malloc(sizeof(int) * N);

	for (int i = 0; i < N; i++) {
		list[i] = i;
	}

	pick(N, bucket, M, M, list, L);

	printf("%d\n", count);

	free(list);
	free(bucket);
	return 0;
}
