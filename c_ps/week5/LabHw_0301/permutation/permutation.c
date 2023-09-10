// 20220803 컴퓨터학과 정여진
// 2023-03-30
// 순열
#include<stdio.h>
void pick(int n, int* bucket, int bucketSize, int k) {

	int i, lastIndex, smallest, item, count = 0;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			printf("%d", bucket[i]);
		}
		printf("\n");
		return;
	}
	
	lastIndex = bucketSize - k - 1;
	
	smallest = 0; // 중복순열 base에서 서로 다른 수 n개 라는 개념을 더해 => 앞에 똑같은 수 있으면 그건 중복순열이지 순열이 아님

	int flag = 0;

	for (item = smallest; item < n; item++) {
		flag = 0; // 매번 다시
		for (int j = 0; j <= lastIndex; j++) {
			if (bucket[j] == item)
				flag = 1;
		}
		if (flag == 1)
			continue;  // flag = 1일때만 넘어가는 효과가 있다.

		bucket[lastIndex + 1] = item;
		pick(n, bucket, bucketSize, k - 1);
	}
}
main() {

	int n = 3;
	int bucket[3];
	pick(n, bucket, 3, 3);

	return 0;
}
