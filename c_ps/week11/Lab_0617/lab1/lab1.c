#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int H(int n) {
	if (n == 0 || n == 1)
		return 1;
	for (int i = 0; i < n; i++)
		for()
		H(i)* H(n - j - i);
}
int main(void) {
	int n;
	printf("0보다 큰 정수:");
	scanf("%d", &n);
	printf("결과는 %d\n", H(n));
}