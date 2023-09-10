// 
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int* memo;
int H(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    if (memo[n] != 0) {
        return memo[n];
    } // 메모이제이션 -> 예외인 경우 먼저 설정하고 1로 return
    // 아니다 하면 return 다른 값
    int result = 0;
    for (int i = 0; i < n; i++) {
        result += H(i) * H(n - 1 - i);
    }

    memo[n] = result;
    return result;
}

int main(void) {
    int n;
    printf("0보다 큰 정수: ");
    scanf("%d", &n);

    memo = (int*)malloc((n + 1) * sizeof(int));
    if (memo == NULL) {
        printf("메모리 할당 실패\n");
        return 1;
    }

    for (int i = 0; i <= n; i++) {
        memo[i] = 0;
    }

    printf("결과는 %d\n", H(n));

    free(memo);
    return 0;
}