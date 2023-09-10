#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
long long fib(int n, int* F) {
	if (n == 1 || n == 2 || n == 3)
		return 1;

	if (F[n - 1] == 0) // memo에서 f(n-1)확인
		F[n - 1] = fib(n - 1, F); // memo에 없으면 호출
	if (F[n - 2] == 0) // memo에서 확인
		F[n - 2] = fib(n - 2, F); // 없으면 호출 -> 호출 횟수를 줄여줌
	if (F[n - 3] == 0)
		F[n - 3] = fib(n - 3, F);

	return F[n - 1] + F[n - 2] + F[n - 3];
}
int main(void) {

	int n, i;
	int* F;

	scanf("%d", &n);

	// memo 초기화
	F = (int*)malloc(sizeof(int*) * (n + 1));
	for (i = 1; i <= n; i++)
		F[i] = 0;

	// for (i = 1; i <= n; i++)
		// printf("%d", fib(i, F));
	printf("%ld", fib(n, F));

	free(F);
	return 0;
}