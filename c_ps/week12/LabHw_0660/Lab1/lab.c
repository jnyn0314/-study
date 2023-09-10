#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define UP 1
#define LE 2
void print_path(int i, int j, int** BP) {
	if (BP[i][j] == UP)
		print_path(i - 1, j, BP);
	else if (BP[i][j] == LE)
		print_path(i, j - 1, BP);
	printf("%d %d", i, j);
}
void matrix_path(int i, int j, int *BP) {
	// 전에 꺼 가져다 쓴다는 개념
	
}
int main(void) {

	int rows, cols;
	int** array;
	int i, j;

	scanf("%d %d", &rows, &cols);

	array = (int**)malloc(sizeof(int*) * rows);
	
	for (i = 0; i < rows; i++)
		array[i] = (int*)malloc(sizeof(int) * cols);



	return 0;
}