// 21 문해기 중간
// 2023-04-04
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
void reverse(char src_s[], char s[]) {
	int length = strlen(src_s);

	for (int i = 0; i < length; i++) {
		s[i] = src_s[length - 1 - i] - '0';
	}
}
int main(void) {
	char num1[101], num2[101], result[102], n1[101] = {0,}, n2[101] = {0,};
	int carry = 0, count = 0;
	int len1, len2, max, sum;
	int i;

	scanf("%s %s", num1, num2);

	len1 = strlen(num1);
	len2 = strlen(num2);

	if (len1 >= len2)
		max = len1;
	else
		max = len2;

	for (i = 0; i < max; i++) {
		reverse(num1, n1);
		reverse(num2, n2);

		sum = n1[i] + n2[i] + carry;

		if (sum >= 10) {
			carry = 1;
		}
		else
			carry = 0;

		result[max - i] = (sum % 10) + '0';
		count += carry;
	}

	printf("%d", count);
}
// 21 중간고사
// 2023-04-06
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
int toNum(char ch) {
	if (ch == '\0')
		return 0;
	else
		return ch - '0';
} // 문자 -> 정수
int carry(char n1[], char n2[], char result[]) {
	int i, carry = 0, carryCount = 0;
	int sum;

	for (i = 0; n1[i] != '\0' || n2[i] != '\0'; i++) {
		sum = toNum(n1[i]) + toNum(n2[i]) + carry; //  문자 -> 정수, sum정수형에담아
		result[i] = sum % 10 + '0'; // char형이니까 다시 정수 -> 문자로
		if (sum >= 10) {
			carry = 1;
			carryCount++;
		}
		else {
			carry = 0;
		}
	}
	if (carry == 1)
		result[i++] = 1 + '0'; // 왜?
	result[i] = '\0'; // 마지막에null값
	return carryCount;
}
void reverse(char src_n[], char n[]) {
	int len = strlen(src_n);
	int i;
	for (i = 0; src_n[i] != '\0'; i++)
		n[len - i - 1] = src_n[i];
	n[len] = '\0';
}
int main(void) {

	char src_num1[101];
	char src_num2[101];
	char result[101];
	char result2[101];
	char num1[101] = { 0 };
	char num2[101] = { 0 };

	scanf("%s %s", src_num1, src_num2);
	reverse(src_num1, num1);
	reverse(src_num2, num2);

	printf("%d\n", carry(num1, num2, result));

	return 0;
}
