// Lab(사이클 숫자 - 반복)
// 20220803 컴퓨터학과 정여진
#include<stdio.h>
int get_cycle_number(int n);
int get_cycle_number(int n) {

	int count = 1;
	do {
		printf("%d ", n);
		if (n % 2 == 0) {
			n /= 2;
		}
		else {
			n = n * 3 + 1;
		}
		count++;
	} while (n != 1);

	printf("1\n%d", count);
	
}
int main(void) {

	printf(get_cycle_number(22));

	return 0;
}