// 순열과 조합
// lab(뽑기 - 인기상) // 순서 상관 없으니 조합
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void pick(int n, int *bucket, int bucketSize, int k, char actors[][10]) {
	int smallest, i, lastIndex, item;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			printf("%10s", actors[bucket[i]]);
		}
		printf("\n");
		return;
	}

	lastIndex = bucketSize - k - 1;

	if (bucketSize == k) {
		smallest = 0;
	}
	else {
		smallest = bucket[lastIndex] + 1;
	}
	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1, actors);
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
		printf("메모리를 할당할 수 없습니다.");
		return 0;
	}
	
	for (i = 0; i < n; i++) {
		bucket[i] = 0;
	}

	char actors[5][10] = {"공유", "김수현", "송중기", "지성", "현빈"};
	pick(5, bucket, n, n, actors);

	free(bucket);
	return 0;
}