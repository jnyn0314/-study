// // 순열과 조합
// lab(뽑기 - 연기상)
// 한 명은 우수, 한 명은 최우수 => 순서 중요, 중복 x => 순열
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void pick(int n, int* bucket, int bucketSize, int k, char actors[][10]) {
	
	int i, smallest, lastIndex, item, j, count = 0, flag = 0;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			printf("%10s", actors[bucket[i]]);
		}
		printf("\n");
		return;
	}

	lastIndex = bucketSize - k - 1;
	smallest = 0;

	for (item = smallest; item < n; item++) {
		flag = 0;
		for (j = 0; j <= lastIndex; j++) {
			if (bucket[j] == item) {
				flag = 1;
			}
		}
		if (flag == 1)
			continue; // flag = 1일때만 넘어가는 효과가 있다.

		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1, actors);
	}
}
int main(void) {

	int n, i;
	int* bucket;
	char actors[5][10] = { "공유", "김수현", "송중기", "지성", "현빈" };

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
	} // 초기화
	
	pick(5, bucket, n, n, actors);

	free(bucket);
	return 0;

}
