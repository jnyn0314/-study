// 21 중간 3번, 사다리타기
// 2023-04-07
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main(void) {
	int M, N;
	int location;
	char a[10][10];
	int i, j;

	scanf("%d %d\n%d", &M, &N, &location);

	for (i = 0; i < N; i++)
		scanf("%s", a[i]);

	for (i = 0; i < N; i++) {
		if (location - 1 >= 0 && a[i][location - 1] == '1')
			location--;
		else if (location < M - 1 && a[i][location] == '1')
			location++;
	}
	printf("%d\n", location);
}