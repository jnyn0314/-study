// 20220803 컴퓨터학과 정여진
// 0114 tic-tac-toe
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void display(char b[][3]) {
	int i, j;
	printf(" ");
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
int findWinner(char b[][3], char player, int r, int c, int sum_row, int sum_cols, int sum_left, int sum_right) {

	// 오른쪽 대각선
	if (b[r][c] == b[r + 1][c + 1])
		sum_right++;
	if (b[r][c] == b[r + 2][c + 2])
		sum_right++;
	if (b[r][c] == b[r - 1][c - 1])
		sum_right++;
	if (b[r][c] == b[r - 2][c - 2])
		sum_right++;

	// 왼쪽 대각선
	if (b[r][c] == b[r + 1][c - 1])
		sum_left++;
	if (b[r][c] == b[r + 2][c - 2])
		sum_left++;
	if (b[r][c] == b[r - 1][c + 1])
		sum_left++;
	if (b[r][c] == b[r - 2][c + 2])
		sum_left++;

	// row
	if (b[r][c] == b[r + 1][c])
		sum_row++;
	if (b[r][c] == b[r + 2][c])
		sum_row++;
	if (b[r][c] == b[r - 1][c])
		sum_row++;
	if (b[r][c] == b[r - 2][c])
		sum_row++;

	// cols
	if (b[r][c] == b[r][c + 1])
		sum_cols++;
	if (b[r][c] == b[r][c + 2])
		sum_cols ++;
	if (b[r][c] == b[r][c - 1])
		sum_cols++;
	if (b[r][c] == b[r][c - 2])
		sum_cols++;

	if (sum_row == 2 || sum_cols == 2 || sum_right == 2 || sum_left == 2)  // 이렇게 두면 문제 : 0 0 로 같아도 cols++, 1 1 으로 같아도 cols++임
		return 1;														// => 그래서 sum_cols_o, sum_cols_x 이런식으로 두지 않는 이상,,,
	else
		return 0;
}
int main(void) {

	char b[3][3] = { 0 };
	int row, cols;
	char player = 'O';
	int count = 0;
	display(b);
	int sum_row = 0, sum_cols = 0, sum_left = 0, sum_right = 0;

	do {
		do {
			printf("Player %c<행 열>:", player);
			scanf("%d %d", &row, &cols);
		} while (b[row][cols] != 0);

		if (count % 2 != 0) {
			player = 'o';
		}
		else {
			player = 'x';
		}

		b[row][cols] = player;
		display(b);

		if (findWinner(b, player, row, cols, sum_row, sum_cols, sum_left, sum_right) == 1) {
			printf("\nPlayer % c wins!\n", player);
			break;
		}
		count++;
	} while (count != 9);
	if (count == 9)
		printf("\nNobody wins!\n");
	return 0;
}
*/
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define COLS 3
#define ROWS 3

int winCheck(int sum)
{
	if (sum == 3)
	{
		printf("Player X wins!\n");
		return 1;
	}
	else if (sum == -3)
	{
		printf("Player O wins!\n");
		return 1;
	}

	return 0; 
}

int win(int b[][COLS])
{
	int i, j;
	int sum;
	// 가로
	for (i = 0; i < ROWS; i++)
	{
		sum = 0; 
		for (j = 0; j < COLS; j++)
			sum += b[i][j];

		if (winCheck(sum)) 
			return 1;
	}

	for (j = 0; j < ROWS; j++)
	{
		sum = 0;
		for (i = 0; i < COLS; i++)
			sum += b[i][j];
		if (winCheck(sum)) 
			return 1;
	}
	// 오른쪽 대각선 
	sum = 0;
	for (i = 0; i < ROWS; i++)
	{
		sum += b[i][i];
	}
	if (winCheck(sum)) 
		return 1;

	// 왼쪽 대각선
	sum = 0;
	for (i = 0; i < ROWS; i++)
	{
		sum += b[i][ROWS - 1 - i];
	}
	if (winCheck(sum))
		return 1;

	return 0;
}

void display(int b[][COLS])
{
	char ch;
	int i, j;

	printf("    0 1 2\n");
	printf("   ------\n");
	for (i = 0; i < ROWS; i++)
	{
		printf("%d |", i);
		for (j = 0; j < COLS; j++)
		{
			if (b[i][j] == 1)
				ch = 'X';
			else if (b[i][j] == -1)
				ch = 'O';
			else
				ch = ' ';
			printf(" %c", ch);
		}
		printf("\n");
	}
}

int main(void)
{
	int board[3][3];
	char turn = 'X'; //처음 turn을 X로 시작

	int r, c;
	int i, j;
	int count;
	int lose;

	for (i = 0; i < ROWS; i++)
		for (j = 0; j < COLS; j++)
			board[i][j] = 0;

	count = 0;
	display(board);

	do
	{
		printf("Player %c(행 열):", turn);
		scanf("%d %d", &r, &c);
		printf("\n");

		if (board[r][c])
			continue;

		count++;

		if (turn == 'X') {

			board[r][c] = 1;
			turn = 'O'; 
		}
		else {
			board[r][c] = -1;
			turn = 'X';
		}
		display(board);

	} while ((lose = !win(board)) && count < 9); 

	if (lose && count == 9)
		printf("Nobody wins!\n");
}