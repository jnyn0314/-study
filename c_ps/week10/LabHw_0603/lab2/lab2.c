#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void matrixAdd(int** a, int** b, int** x, int r, int c) {
	int i, j;

	for (i = 0; i < r; i++)
		for (j = 0; j < c; j++)
			x[i][j] = a[i][j] + b[i][j];
}
void printMatrix(int** a, int r, int c) {
	int i, j;

	for (i = 0; i < r; i++) {
		for (j = 0; j < c; j++)
			printf("%3d ", a[i][j]);
		printf("\n");
	}
}
void readMatrix(int** a, int r, int c) {
	int i, j;

	for (i = 0; i < r; i++)
		for (j = 0; j < c; j++)
			scanf("%d", &a[i][j]);
}
int main(void) {

	int** A, ** B;
	int** X;
	int aRow, aCol;
	int i, j;

	printf("Enter 행렬 A의 행과 열의 개수: ");
	scanf("%d %d", &aRow, &aCol);

	A = (int**)malloc(sizeof(int*) * aRow);
	for (i = 0; i < aRow; i++)
		A[i] = (int*)malloc(sizeof(int) * aCol);
	
	B = (int**)malloc(sizeof(int*) * aRow);
	for (i = 0; i < aRow; i++)
		B[i] = (int*)malloc(sizeof(int) * aCol);

	X = (int**)malloc(sizeof(int*) * aRow);
	for (i = 0; i < aRow; i++)
		X[i] = (int*)malloc(sizeof(int) * aCol);

	printf("<%d * %d> 행렬 A 입력:\n", aRow, aCol);
	readMatrix(A, aRow, aCol);
	printf("<%d * %d> 행렬 C 입력:\n", aRow, aCol);
	readMatrix(B, aRow, aCol);
	
	
	printf("행렬합:\n");
	matrixAdd(A, B, X, aRow, aCol);
	printMatrix(X, aRow, aCol);

	free(A);
	free(B);
	free(X);
	return 0;
}