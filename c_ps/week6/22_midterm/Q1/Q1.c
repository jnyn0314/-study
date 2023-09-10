#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(void) {

	int n, k;
	char str_number1[64] = " "; // ¿Ö 64 = 2 ^ 8
	char str_number2[64] = " ";
	int i = 0;
	int str_len;

	scanf("%d %d", &n, &k); // kÁø¹ý

	/*
	memset(str_number1, 0, 64);
	memset(str_number2, 0, 64);
	*/

	while (n != 0) {
		if (k == 16 && n % k >= 0) {
			str_number1[i] = (n % k - 10) + 'A';
		}
		else
			str_number1[i] = (n % k) + '0';
		n = n / k;
		i++;
	}

	str_len = i;

	for (i = 0; i < str_len; i++)
		str_number2[i] = str_number1[str_len - i - 1];

	printf("%s\n", str_number1);
	printf("%s\n", str_number2);

	printf("%d\n", !strcmp(str_number1, str_number2));
	return 0;
}