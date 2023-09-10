#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int digits(int n) {

	int num_of_digits = 0;
	while (n != 0) {
		n = n / 10;
		num_of_digits++;
	}
	return num_of_digits;	
} // 몇자리수인지 
int kth_digit(int n, int k) {
	int i = 0, ret = 0;
	
	for (i = 0; i < k; i++) {
		ret = n % 10;
		n = n / 10;
	}
	return ret;
}
int solution(int n){

	int i = 0;
	int t_digits = 0; // 자릿수의 누적
	while (t_digits < n) {
		i++;
		t_digits = t_digits + digits(i);
	}
	// t_digits - n + 1
	printf("%d %d %d\n", i, t_digits, kth_digit(i, t_digits - n + 1)); // -> 1부터 - 9 10 

	int j;
	return kth_digit(i, t_digits - n + 1); // -> 0 출력됨
} // n번째 숫자는 어떤 수가 담고 있는지
int main(void) {

	int n; 

	scanf("%d", &n);
	// printf("%d\n", digits(n));
	printf("%d\n", solution(n));
}