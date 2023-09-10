#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void display(char b[][3]) {
	int i, j;

	for (i = 0; i < 3; i++) {
		printf("%d ", i);
	}
	printf("\n------------------------\n");
	for (i = 0; i < 3; i++) {
		printf("%d :", i);
		for (j = 0; j < 3; j++) {
			printf(" %c", b[i][j]);
		}
		printf("\n");
	}
}
int main(void) {

	char b[3][3] = { 0 };
	int row, cols;
	char player;
	int count = 0;
	display(b);
	do {
		printf("Player X<За ї­>:");
		scanf("%d %d", &row, &cols);

		if (count % 2 != 0) {
			player = 'x';
		}
		else {
			player = 'o';
		}

		b[row][cols] = player;
		display(b);
		count++;

	} while (count != 9);

	return 0;
}