#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int findZero(int n) {
	int count = 0;
	while (1) {
		int leftN = n % 10;
		n = n / 10; 

		if (leftN == 0) {
			count++;
			continue;
		}
		else
			return count;
	}
}
int factorial(int n) {
	if (n == 1)
		return 1;
	else
		return n * factorial(n - 1);
}
int main(void) {

	int n;
	scanf("%d", &n);

	// printf("%d", factorial(n));
	int num = factorial(n);

	printf("%d", findZero(num));

	return 0;
}