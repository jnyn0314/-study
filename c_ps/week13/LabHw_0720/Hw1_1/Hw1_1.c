#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
void remove_duplicated_char(char* word) {
	int i, j, k = 0;
	char ch;
	int found = 0;

	for (i = 0; i < strlen(word); i++) {
		ch = word[i];
		found = 0;
		
		for (j = 0; j < k; j++) {
			if (word[j] == ch) {
				found = 1;
				break;
			}
		}

		if (!found) {
			word[k] = ch;
			k++;
		}
	}
	word[k] = '\0';
}
int main(void) {
	
	char key[] = "PROGRAMMING";
	remove_duplicated_char(key);
	printf("%s", key); // programin이 출력되어야 함

	return 0;
}