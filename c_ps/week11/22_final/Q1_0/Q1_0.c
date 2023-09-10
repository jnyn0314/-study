#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int jarisu(long long n) {
	int count = 0;

	if (n == 0)
		return 1;

	while (n != 0) {
		++count;
		n /= 10;
	}
	return count;
}
int main(void) {

	long long n;

	scanf("%lld", &n);
	printf("%d", jarisu(n));

	return 0;
}