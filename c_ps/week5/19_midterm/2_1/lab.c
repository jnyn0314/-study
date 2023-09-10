// 19 문해기 중간고사
// 2023-04-01
// 2-1. (2의 배수 판별)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int find(char str[]) {

    int last = 0;

    for (int i = 0; str[i] != '\0'; i++)
        last = str[i];

    if (last % 2 == 0)
        return 1;
    else
        return 0;
}
int main(void) {

    char str[50] = { 0 };
    scanf("%s", str);

    printf("%d", find(str));

    return 0;
}