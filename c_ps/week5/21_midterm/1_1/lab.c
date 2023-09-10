// 2021 중간고사 1_1
// 2023-04-04
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
void reverse(char src_s[], char s[]) {
	int length = strlen(src_s);

	for (int i = 0; i < length; i++) {
		s[i] = src_s[length - 1 - i];
	}
}
int main(void) {
	char src_s[101] = { 0 };
	char s[101] = { 0 };

	scanf("%s", src_s);
	reverse(src_s, s);
	printf("%s\n", s);

	return 0;
}