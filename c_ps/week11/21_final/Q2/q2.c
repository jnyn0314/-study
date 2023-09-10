#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<ctype.h>
int id_in(char word[], char ch) { // 필요하면 쓰자
	int i;
	for (i = 0; word[i] != '\0'; i++)
		if (word[i] == ch)
			return 1;
	return 0;
}
void makeCode(char code[], char word[])
{
	char ch = NULL;
	int i, j;
	int len = 0; 

	for (i = 0; i < 26; i++)
		code[i] = 'A' + i;

	for (i = 0; word[i] != '\0'; i++)
		for (j = 0; j < 26 - len; j++)
			if (word[i] == code[j]) {
				len++;
				for (int k = j; k < 26 - len; k++) {
					code[k] = code[k + 1];
				}
			}

	for (int i = 25 - len; i < 26; i++) {
		char temp = code[i];
		code[i] = word[i];
		word[i] = temp;
	}

	
}
void printCode(char code[])
{
	int i;
	for (i = 0; i < 26; i++)
		printf("%c", code[i]);
}
int main(void) // 변경하지 말라 
{
	char code[26]; // code[0]부터 'A'의 암호화문자를 넣음 
	char keyWord[10];
	scanf("%s", keyWord);
	makeCode(code, keyWord);
	printCode(code);
}