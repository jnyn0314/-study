#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int input(char name[]);
void reverse(char name[]);
int input(char name[]) {
	
	printf("Enter your name:");
	scanf("%s", name);
}
void reverse(char name[]) {
	int i, j;

	for(i = 0; name[i] != '\0'; i++);
	for (j = i - 1; j >= 0; j--) {
		printf("%c", name[j]);
	}
	printf("\n");
}
int main(void) {

	char name[20];

	input(name);
	reverse(name);

	return 0;
}