// 동적할당, 정렬
// 2023-04-12
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(void) {

	// 시드값 설정
	srand((unsigned)time(NULL));

	int n;
	int* a;

	printf("Enter a number:");
	scanf("%d", &n);

	a = (int*)malloc(sizeof(int) * n);

	if (n <= 0)
		return 0;
	if (!a) 
		return 0;

	int i;
	
	for (i = 0; i < n; i++) {
		a[i] = rand() % 1000;
	}
	for (i = 0; i < n; i++)
		printf("%d ", a[i]);

	free(a);
	return 0;
}