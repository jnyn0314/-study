#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void print_fact_exp(int n) {
	if (n == 0) {
		printf("1");
		return 0;
	}
	else {
		if (n != 1) {
			printf("%d * ", n);
			return print_fact_exp(n - 1);
		}
		else if (n == 1) {
			printf("%d", n);
			return 0;
		}
	}
}
int main(void) {
	int n;
	printf("Enter a number:");
	scanf("%d", &n);

	printf("%d! = ", n);
	print_fact_exp(n);
	printf("\n");
}
