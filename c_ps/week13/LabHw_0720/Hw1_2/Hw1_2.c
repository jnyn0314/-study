#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <ctype.h>
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
void makeCode(char code[], int distance, char* key) {
    int i, j;
        int key_len = strlen(key);
        char alphabet[27] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Remove duplicate characters from the key
        char temp_key[27] = "";
        for (i = 0; i < key_len; i++) {
            if (strchr(temp_key, key[i]) == NULL) { // key[i]값이 없다면 
                strncat(temp_key, &key[i], 1); // 문자열 이어준다
            }
        }

        // Construct new key without duplicate characters
        int new_key_len = strlen(temp_key); 
        char new_key[27] = "";
        strncat(new_key, temp_key, new_key_len);

        // Create the new alphabet string without key characters
        char new_alphabet[27] = "";
        for (i = 0; i < 26; i++) {
            if (strchr(new_key, alphabet[i]) == NULL) { // alphabet[i]값이 없다면
                strncat(new_alphabet, &alphabet[i], 1);
            }
        }

        // Construct the resulting code array
        int code_index = 0;
        for (i = 0; i < key_len; i++) { 
            code[code_index] = new_key[i];
            code_index++;
        }

        for (i = 0; i < 26; i++) {
            if (strchr(new_key, new_alphabet[i]) == NULL) { 
                code[code_index] = new_alphabet[i];
                code_index++;
            }
        }

        // Perform the distance shift
        char temp_code[27];
        for (i = 0; i < 26; i++) {
            temp_code[i] = code[(i - distance + 26) % 26];
        }

        // Copy the shifted code array back to the original code array
        for (i = 0; i < 26; i++) {
            code[i] = temp_code[i];
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

int main(void) {
    char code[27];
    int distance;
    char key[30];

    printf("Enter a distance for encoding: ");
    scanf("%d", &distance);
    printf("Enter a word to use for encoding (lowercase): ");
    scanf("%s", key);

    remove_duplicated_char(key);
    makeCode(code, distance, key);
    printCode(code);

    return 0;
}

