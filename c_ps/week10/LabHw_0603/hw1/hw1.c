#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
void turnMatrix(int **a, int r, int c) {
	int i, j;

	int** newA;

	newA = (int**)malloc(sizeof(int*) * c);
	for (i = 0; i < c; i++)
		newA[i] = (int*)malloc(sizeof(int) * r);

	for (i = 0; i < r; i++) {
		for (j = 0; j < c; j++) {
			newA[j][i] = a[i][j];
		}
	}
	for (i = 0; i < c; i++) {
		for (j = 0; j < r; j++)
			printf("%d ", newA[i][j]);
		printf("\n");
	}

	free(newA);
}
void matrixAdd(int** a, int** b, int** x, int r, int c, int n) {
	int i, j, k;
	
	for(i = 0; i < r; i++)
		for (j = 0; j < n; j++) {
			x[i][j] = 0; // 왜?
			for (k = 0; k < c; k++)
				x[i][k] += (a[i][j] * b[j][k]);
		}
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

	int** A, ** C;
	int** X;
	int aRow, aCol;
	int cRow, cCol;
	int i, j;

	printf("Enter 행렬 A의 행과 열의 개수: ");
	scanf("%d %d", &aRow, &aCol);
	printf("Enter 행렬 C의 행과 열의 개수<C의 행은 4여야>: ");
	scanf("%d %d", &cRow, &cCol);

	A = (int**)malloc(sizeof(int*) * aRow);
	for (i = 0; i < aRow; i++)
		A[i] = (int*)malloc(sizeof(int) * aCol);

	C = (int**)malloc(sizeof(int*) * cRow);
	for (i = 0; i < cRow; i++)
		C[i] = (int*)malloc(sizeof(int) * cCol);

	X = (int**)malloc(sizeof(int*) * aRow);
	for (i = 0; i < aRow; i++)
		X[i] = (int*)malloc(sizeof(int) * cCol);

	printf("<%d * %d> 행렬 A 입력:\n", aRow, aCol);
	readMatrix(A, aRow, aCol);

	printf("\n<%d * %d> 행렬 C 입력:\n", cRow, cCol);
	readMatrix(C, cRow, cCol);


	printf("행렬곱:\n");
	matrixAdd(A, C, X, aRow, cCol, aCol);
	printMatrix(X, aRow, cCol);
	printf("\n전치행렬:\n");
	turnMatrix(A, aRow, aCol);

	free(A);
	free(C);
	free(X);
	return 0;
}