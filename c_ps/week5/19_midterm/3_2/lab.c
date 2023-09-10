 // 19 문해기 중간
// 2023-04-01
// 3의 배수 게임
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int calDigits(int n) {
	int count = 0;
	while (n != 0) {
		n /= 10;
		count++;
	}
	return count;
} // 자리수 return 코드
int main() {
	
	int n;
	int num = 0;
	int jarisu;

	scanf("%d", &n);

	while (n > 0) {
		num += 3;
		jarisu = calDigits(num);
		if (n <= jarisu) {
			// printf("%d %d\n", num, n);
			for (int i = 0; i < (jarisu - n); i++)
				num /= 10;
			printf("%d\n", num % 10);
		}
		n = n - jarisu;
	}

	return 0;
}