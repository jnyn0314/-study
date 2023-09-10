#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int total(int n);
int total(int n) {

	int i, total = 0;

	for (i = 0; i <= n; i++) {
		total += i;
	}
	return total;
}
int main(void) {

	int num = 0;

	while (num != -1)
	{
		printf("Input a number(-1 for exit):");
		scanf("%d", &num);
		if (num == -1)
			break;
		printf("1부터 %d까지의 합은 %d\n", num, total(num));
	}
	return 0;
}