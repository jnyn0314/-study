// 문해기 19 중간
// 2023-04-01
// 2,3,4,5 배수 여부로 인코딩
/*
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int find_if2(int last) {
    if (last % 2 == 0)
        return 1;
    else
        return 0;
}
int find_if3(int sum) {
    if (sum % 3 == 0)
        return 1;
    else
        return 0;
}
int find_if4(int num) {
    if (num % 4 == 0)
        return 1;
    else
        return 0;
}
int find_if5(
    int last) {
    if (last % 5 == 0)
        return 1;
    else
        return 0;
}
int main(void) {

    char str[52] = { 0 }; // 10의 51승 받아야되니까!
    int last = 0;
    int sum = 0;
    int num = 0;

    scanf("%s", str);

    for (int i = 0; str[i] != '\0'; i++) {
        last = str[i] - 48;
    }
    for (int i = 0; str[i] != '\0'; i++) {
        sum += str[i] - 48;
    }

    num = atoi(str);
    if (num > 100)
        num = num % 100;

    printf("%d%d%d%d", find_if2(last), find_if3(sum), find_if4(last), find_if5(num));

    return 0;
}
*/
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>

int main(void) {
    char num[52] = { 0 };
    int two, three, four, five;
    int len;
    int i;
    int sum = 0;
    int tmpNum;

    scanf("%s", num);

    len = strlen(num);

    if ((num[len - 1] - '0') % 2 == 0)
        two = 1;
    else
        two = 0;

    if ((num[len - 1] - '0') % 5 == 0)
        five = 1;
    else
        five = 0;

    for (i = 0; i < len; i++) {
        sum += num[i] + '0';
    }
    if (sum % 3 == 0)
        three = 1;
    else
        three = 0;

    tmpNum = 10 * (num[len - 2] - '0') + (num[len - 1] - '0');
    if (tmpNum % 4 == 0)
        four = 1;
    else
        four = 0;
    
    printf("%d %d %d %d", two, three, four, five);




}