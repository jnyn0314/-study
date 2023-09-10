#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void swap(char* x, char* y) {
    char temp = *x;
    *x = *y;
    *y = temp;
}

void permute(char* str, int l, int r, int* perm, int* used, char* str2) {
    int i;
    if (l == r) {
        for (i = 0; i <= r; i++) {
            printf("%d ", perm[i]);
        }
        printf(", ");
        for (i = 0; i < strlen(str2); i++) {
            printf("%d ", perm[str2[i] - 'A']);
        }
        printf("\n");
    }
    else {
        for (i = l; i <= r; i++) {
            if (used[i] == 0) {
                used[i] = 1;
                perm[l] = str[i] - 'A' + 1;
                permute(str, l + 1, r, perm, used, str2);
                used[i] = 0;
            }
        }
    }
}

void generatePermutations(char* str1, char* str2) {
    int n = strlen(str1);
    int* perm = (int*)malloc(n * sizeof(int)); 
    int* used = (int*)malloc((n) * sizeof(int));
    int i;

    for (i = 0; i < n; i++) {
        used[i] = 0;
    }

    permute(str1, 0, n - 1, perm, used, str2);

    free(perm);
    free(used);
}

int main() {
    char str1[9];
    char str2[9];

    printf("첫 번째 문자열을 입력하세요: ");
    scanf("%s", str1);
    getchar();

    printf("두 번째 문자열을 입력하세요: ");
    scanf("%s", str2);
    getchar();
    generatePermutations(str1, str2);

    return 0;
}
