#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int jarisu(unsigned long long n) {
	unsigned long long newN = 0, count = 0;

	do {
		newN = n % 10;
		n /= 10;
		count++;
	} while (n != 0);

	return count;
}
unsigned long long makeNum(int n) {
	unsigned long long total = n, newN = 1;
	do {
		
	for(int i = 0; i < jarisu(n); i++)
		newN *= 10;

	total += (--n * newN);

	} while (n != 0);
	return total;
}

int main(void) {

	int n;

	scanf("%d", &n);
	printf("%llu", makeNum(n));
	printf("\n%d", jarisu(makeNum(n)));

	return 0;
}