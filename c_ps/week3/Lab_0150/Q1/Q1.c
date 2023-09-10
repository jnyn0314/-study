/*20220803 컴퓨터학과 정여진*/
/*
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void) {

	int n1, n2, i = 0, j = 0, count = 0, k = 0, l = 0;
	int num1[10], num2[10];

	scanf("%d %d", &n1, &n2);

	do {
		num1[i] = n1 % 10;
		n1 /= 10;
		i++;
	} while (n1 != 0);
	do {
		num2[j] = n2 % 10;
		n2 /= 10;
		j++;
	} while (n2 != 0);

	do {
		if (num1[k] + num2[l] >= 10) {
			count++;
		}
		k++;
		l++;
	} while (k != i && l != j);

	printf("%d", count);

	return 0;
}
*/
// 교수님 코드
/*
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void) {
	unsigned long long number1, number2;
	unsigned long long reminder1, reminder2;
	int carry = 0;
	int carry_count = 0;

	scanf("%d %d", &number1, &number2);

	while (number1 != 0 || number2 != 0) {
		reminder1 = number1 % 10;
		reminder2 = number2 % 10;

		if (reminder1 + reminder2 + carry >= 10) {
			carry = 1;
			carry_count++;
		}
		else
			carry = 0;

		number1 = number1 / 10;
		number2 = number2 / 10;
	}
	printf("%d", carry_count);
}
*/
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
	
	// int count = 0, carry = 0;
	// int n1_percent = 0, n2_percent = 0, n1, n2;
	
	unsigned long long n1_percent = 0, n2_percent = 0;
	unsigned n1, n2;
	int count = 0, carry = 0;

	scanf("%d %d", &n1, &n2);

	do {
		n1_percent = n1 % 10;
		n2_percent = n2 % 10;

		n1 /= 10;
		n2 /= 10;

		if (n1_percent + n2_percent + carry >= 10) {
			count++;
			carry = 1;
		}
	} while (n1 != 0 && n2 != 0);

	printf("%d", count);

	return 0;
}
*/ // 이거 196일 때 왜 안돼?