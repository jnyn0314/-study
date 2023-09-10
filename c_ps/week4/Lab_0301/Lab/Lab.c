// 20220803 컴퓨터학과 정여진
// Lab(동적할당을 이용한 조합출력
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void pick(int n, int picked[], int m, int toPick){
	int smallest, lastIndex, i;
	if (toPick == 0) {
		for (i = 0; i < m; i++)
			printf("%d", picked[i]);
		printf("\n");

		return;
	}
	lastIndex = m - toPick - 1;

	if (m == toPick)
		smallest = 0;
	else
		smallest = picked[lastIndex] + 1;

	for (i = smallest; i < n; i++) {
		picked[lastIndex + 1] = i;
		pick(n, picked, m, toPick - 1);
	}
}
int main(void) {
	/*
	int picked[4];
	pick(7, picked, 4, 4);
	*/
	int n, m;
	int *picked; // int picked[m];

	scanf("%d %d", &n, &m);
	
	if (n <= 0)
		return 0;
	
	picked = (int*)malloc(sizeof(int) * m);

	if (!picked) {
		printf("메모리를 할당할 수 없습니다.");
		return 0;
	}

	pick(n, picked, m, m);
	
	free(picked);
}