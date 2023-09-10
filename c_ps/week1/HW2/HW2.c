#include<stdio.h>
int isPrime(int x);
int isPrime(int x) {

	int i;
	
	for (i = 2; i < x; i++) {
		if (x % i == 0)
			return 0;
	}
	return 1;
}
int main(void) {

	int i;

	for (i = 2; i < 30; i++) {
		if (isPrime(i) == 1)
		printf("%d ", i);
	}

	return 0;
}