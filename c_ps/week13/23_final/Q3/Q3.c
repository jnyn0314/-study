#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
long fib(int n, int* F, int k) {
	int i;
	long sum = 0;

	for(i = 0; i < k; i++)
		if (n == k - i)
			return 1;
	
	for(i = 1; i <= k; i++)
		if (F[n - i] == 0) // memo에서 f(n-1)확인
			F[n - i] = fib(n - i, F, k);

	for (i = 1; i <= k; i++)
		sum = sum + F[n - i];

	return sum;
}
int main(void) {

	int n, i;
	int* F;
	int k;

	scanf("%d", &n);
	scanf("%d", &k);

	// memo 초기화
	F = (int*)malloc(sizeof(int*) * (n + 1));

	for (i = 1; i <= n; i++)
		F[i] = 0;

	// for (i = 1; i <= n; i++)
		// printf("%ld ", fib(i, F, k));
	
	printf("%ld", fib(n, F, k));
	free(F);
	return 0;
}