#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {

	char ch;
	int i, count = 0;
	char string[100];

	printf("Enter a String:");
	scanf("%s", string);

	printf("Enter a character:");
	scanf(" %c", &ch);

	for(i = 0; string[i] != '\0'; i++) {
		if (string[i] == ch) {
			count++;
		}
	}

	printf("%c is appeared %d times", ch, count);
	return 0;
}