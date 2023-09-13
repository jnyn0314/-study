#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main(void) {

	char str[100];
	char temp;
	int len = 0;

	printf("Enter any string:");
	scanf("%s", str);
	
	len = strlen(str);

	for (int i = len - 1; i >= (len - 1) / 2; i--) {
		temp = str[i];
		str[i] = str[len - i - 1];
		str[len - i - 1] = temp;
	}

	printf("\nReversed String is %s", str);

	return 0;
}