// 20220803 컴퓨터학과 정여진
// 2023-03-30
// 순열
#include<stdio.h>
void pick(int n, int* bucket, int bucketSize, int k) {

	int i, lastIndex, smallest, item, count = 0;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++)
			printf("%d", bucket[i]);
		printf("\n");
		return;
	}
	
	lastIndex = bucketSize - k - 1;
	
	/*
	smallest = 0;

	for (item = smallest; item < n; item++) {
		for (int j = 0; j <= smallest; j++)
			if(bucket[j] == bucket[item])
			count++;
		if (count == 0)
			bucket[lastIndex + 1] = item;

		pick(n, bucket, bucketSize, k - 1);
	}
	*/
	// 이부분 고민해보기
}
main() {

	int n = 5;
	int bucket[3];
	pick(n, bucket, 3, 3);

	return 0;
}