#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void pick(int n, int* bucket, int bucketSize, int k, int *list, int target, int *min) {
	int smallest, item, lastIndex, i, sum = 0;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			
		}
	}

	lastIndex = smallest - k - 1;

	for(item = smallest; item < )
}
int main(void) {

	int n, i;
	int* bucket;
	int* item;
	int min = 0;

	scanf("%d", &n);

	bucket = (int*)malloc(sizeof(int) * n);
	item = (int*)malloc(sizeof(int) * (n - 1));

	for (i = n - 1; i >= 1; i++)
		item[i] = i;
	
	min = n;
	pick(n - 1, bucket, n, n, n, item, &min); // ¿Ö &¾¸?

	
	free(bucket);
	free(item);
	return 0;
}