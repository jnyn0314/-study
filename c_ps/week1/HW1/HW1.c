#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void) {

	int num, i, rslt = 1;

	printf("Enter a number:");
	scanf("%d", &num);

	for (i = 0; i < num; i++) {
		rslt *= 2;
	}

	printf("%d", rslt);

	return 0;
}