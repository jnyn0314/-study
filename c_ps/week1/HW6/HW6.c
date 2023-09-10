#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(void)
{
	int num[6];
	int i;
	char ch = 0;

	while (ch != 'n')
	{
		srand(time(NULL));

		printf("*** 로또 번호 생성기 ***\n");
		printf("생성 번호: ");

		for (i = 0; i < 6; i++) {
			num[i] = rand() % 45 + 1;
		}
		for (i = 0; i < 6; i++) {
			printf("%d ", num[i]);
		}

		printf("\n다시 생성하시겠습니까?(y/n)");
		scanf(" %c", &ch);
	}
	
}