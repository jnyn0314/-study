// 스크린트리 3
// 20220803 컴퓨터학과 정여진

#define _CRT_SECURE_NO_WARNINGS
#define MAX_LEVEL 5
#define MAX_WIDTH 70
char screen[MAX_LEVEL][MAX_WIDTH];
#include <stdio.h>
void draw_tree(int row, int left, int right) {
	int mid, count = 0;
	if (right - left < 2)
		return;
	mid = (right + left) / 2;

	screen[row][mid] = count;

	draw_tree(row + 1, left, mid - 1); // 왼쪽
	draw_tree(row + 1, mid + 1, right); // 오른쪽
}
void init(char s[][MAX_WIDTH]) {
	int i, j;
	for (i = 0; i < MAX_LEVEL; i++)
		for (j = 0; j < MAX_WIDTH; j++)
			s[i][j] = '-';
}
void display(char s[][MAX_WIDTH], int width, int count) {
	int i, j;
	for (i = 0; i < MAX_LEVEL; i++) {
		for (j = 0; j < width; j++) {
			if (s[i][j] == '-')
				printf(" %c", s[i][j]);
			else {
				if (count < 9) {
					printf(" %d", ++count);
				}
				else {
					printf("%d", ++count);
				}
			}
		}
		printf("\n");
	}
}
int main(void) {

	int width, count = 0;
	init(screen);
	printf("Enter a width(<=70) of a screen:");
	scanf("%d", &width);

	draw_tree(0, 0, width - 1);
	display(screen, width, count);

	return 0;
}