#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
// #include<stdlib.h>
#include<string.h> // strlen의 헤더
void makeCode(char code[], int dist) {
	int i;

	for (i = 0; i < 26; i++) {
		code[i] = 'A' + ((i + dist) % 26);
	}
}
void printCode(char code[]) {
	int i;

	for (i = 0; i < 26; i++)
		printf("%c", 'A' + i);
	printf("\n");

	for (i = 0; i < 26; i++)
		printf("%c", code[i]);
	printf("\n");
}
void encode(char code[], char s[], char e[]) {
	int i = 0;

	for (i = 0; i < strlen(s); i++) {
		char ch = s[i];

		if ('A' <= ch && ch <= 'Z') {
			int relative_pos = ch - 'A';
			e[i] = code[relative_pos];
		}
		else {
			printf("%d\n", ch);
			e[i] = ch;
		}
	}
	e[i] = '\0';
}
int main(void) {

	char code[26];
	int distance;
	char sentence[80], encodedSentence[80];
	char* buf;
	char ch;
	
	FILE *fp1, *fp2;
	fp1 = fopen("original.txt", "rt");
	if (fp1 == NULL) {
		printf("원본 파일을 열 수 없습니다.");
		exit(1);
	}

	fp2 = fopen("encoded.txt", "wt");
	if (fp2 == NULL) {
		printf("암호화된 파일을 열 수 없습니다.");
		fclose(fp1);
		exit(1);
	}
	
	printf("암호화할 거리 입력: ");
	scanf("%d", &distance);
	makeCode(code, distance);
	printf("암호화 코드:\n");
	printCode(code);

	fgets(sentence, sizeof(sentence), fp1);

	encode(code, sentence, encodedSentence);
	fputs(encodedSentence, fp2);

	fclose(fp1);
	fclose(fp2);

	return 0;
}