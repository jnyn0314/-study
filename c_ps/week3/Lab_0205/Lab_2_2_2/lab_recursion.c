// Lab(사이클 숫자 - 순환)
// 20220803 컴퓨터학과 정여진
#include<stdio.h>
int get_cycle_number(int n);
int get_cycle_number(int n) {

	int count = 1;

	printf("%d ", n);

	if (n == 1)
		return count;
	else if (n % 2 == 0)
		count += get_cycle_number(n / 2);
	else
		count += get_cycle_number(n * 3 + 1);
}
int main(void) {

	printf("\n%d ", get_cycle_number(22));

	return 0;
}