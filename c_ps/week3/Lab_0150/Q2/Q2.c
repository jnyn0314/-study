#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int calculateReverse(int n) {

	int new_num = 0;

	do {

		new_num = new_num * 10 + (n % 10);
		n /= 10;

	} while (n != 0);

	return new_num;

} // n을 뒤집은 수를 반환한다
int main(void) {
	unsigned long long num, new_num;
	int total = 0, count = 1;

	scanf("%d", &num);

	do {
		total = num + calculateReverse(num);

		if (total == calculateReverse(total)) {
			printf("%d %d", count, total);
			break;
		}
		else {
			count++;
			num = total;
			total = 0;
		}
	} while (count < 1000);
	if (count >= 1000) {
		printf("NaN");
	}
	return 0;
}