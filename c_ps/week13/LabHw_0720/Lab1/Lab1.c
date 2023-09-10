#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <ctype.h>
#include <string.h>
void makeCode(char code[], int dist) {
    int i;

    for (i = 0; i < 26; i++) {
        code[i] = 'A' + ((i - dist + 26) % 26);
    }
}
void printCode(char code[]) {
    int i;

    for (i = 0; i < 26; i++) {
        printf("%c", 'A' + i);
    }
    printf("\n");

    for (i = 0; i < 26; i++) {
        printf("%c", code[i]);
    }
    printf("\n");
}
void encode(char code[], char s[], char e[]) {
    int i = 0;

    for (i = 0; i < strlen(s); i++) {
        char ch = s[i];

        if ('A' <= ch && ch <= 'Z') {
            // encoding.
            int relative_pos = ch - 'A';
            e[i] = code[relative_pos];
        }
        else {
            printf("%d\n", ch);
            e[i] = ch;
        }
    }
    e[i] = '\0'; // 꼭 비워놔야 함 
}
int main(void)
{
    char code[26]; // code[0]부터 ‘A’의 암호화문자를 넣음
    int distance;
    char sentence[80], encodedSentence[80];

    printf("Enter a distance for encoding:");
    scanf("%d", &distance);

    makeCode(code, distance);
    printCode(code);

    fflush(stdin);
    gets(sentence);
    printf("Enter a sentence to encode:");
    gets(sentence);
    printf("original sentence:\t");
    puts(sentence);

    encode(code, sentence, encodedSentence);
    printf("encoded sentence:\t");
    puts(encodedSentence);
}