// 21 중간고사
// 2023-04-06
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int calDigits(int n) {
	int result = 1;
	int i;
	while (n != 0) {
		n /= 10;
		result *= 10;
	}
	return result / 10;
}
int main(void) {

	int n = 0;
	int count = 0;
	int tmpNum, nextDigit, tmpNum2;
	int jarisu;

	jarisu = calDigits(n * 9);
	tmpNum = tmpNum2 = n * 9;

	do {
		nextDigit = tmpNum2 / jarisu;
		printf("%d ", nextDigit);
		tmpNum2 %= jarisu;
		jarisu /= 10;
		tmpNum /= 10;
	} while (tmpNum != 0);
	return 0;
}

