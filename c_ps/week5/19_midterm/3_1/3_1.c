// 19 문해기 중간
// 2023-04-01
// 자리수 구하기
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int solution(int n) {
	
	int count = 0;

	do{
		n /= 10;
		count++;
	} while (n != 0);
	return
		count;
}
int main(void) {

	int num;
	scanf("%d", &num);
	printf("%d", solution(num));

	return 0;
}