#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
void print_reverse(char* str, int end) {

	int i, count = 0;

	for (i = end; i >= 0; i--) {
		printf("%c", str[i]);
	}
}
int main(void) {

	char str[100];

	printf("Enter any string:");
	scanf("%s", str);

	printf("Reversed String is:");
	print_reverse(str, strlen(str) - 1);
	
	return 0;
}