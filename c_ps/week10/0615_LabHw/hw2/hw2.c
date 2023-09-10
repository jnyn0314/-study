
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
/*
int matrixPath(int** m, int r, int c, int i, int j, int** M, int**M1)
{
    if (M1[i][j] != 0) 
        return M[i][j];

    if (i == 0 && j == 0) 
        return m[i][j];
    else if (i == 0) {
        if (M1[0][j - 1] == 0) {
            M[0][j] = matrixPath(m, r, c, 0, j - 1, M, M1) + m[i][j];
            M1[0][j - 1] = 1;
        }
        return M[i - 1][0] + M[i][j];
    }
    else if (j == 0) {
        if (M1[i - 1][j] == 0) {
            M[i][0] = matrixPath(m, r, c, i - 1, 0, M, M1) + m[i][j];
            M1[i - 1][0] = 1;
        }
        return M[0][j - 1] + M[i][j];
    }
    else
    {
        int a, b;
        a = matrixPath(m, r, c, i - 1, j, M, M1);
        b = matrixPath(m, r, c, i, j - 1, M, M1);
        M[i][j] = ((a < b) ? a : b) + m[i][j];
        return M[i][j];
    }
}

int main(void)
{
    int** m, ** M, ** M1; // M은 메모, M1은 계산 여부를 저장
    int i, j, r, c;
    r = c = 4; // 4x4 matrix
    m = (int**)malloc(sizeof(int*) * r);
    M = (int**)malloc(sizeof(int*) * r);
    M1 = (int**)malloc(sizeof(int*) * r);
    for (i = 0; i < r; i++) {
        m[i] = (int*)malloc(sizeof(int) * c);
        M[i] = (int*)malloc(sizeof(int) * c);
        M1[i] = (int*)malloc(sizeof(int) * c);
    }
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++) {
            scanf("%d", &m[i][j]);
            M1[i][j] = 0; //메모 초기화 
        }
    printf("%d\n", matrixPath(m, r, c, 3, 3, M, M1));
}

#include <stdio.h>
#include <stdlib.h>
 */
int matrixPath(int **m, int r, int c, int i, int j, int **M, int **N)
{
    if (i == 0 && j == 0)
        return m[i][j];
   
    else if (i == 0)
    {
        if (N[0][j] == 0)
        {
            M[0][j] = matrixPath(m, r, c, 0, j - 1, M, N) + m[i][j];
            N[0][j] = 1;
        }
        return M[0][j];
    }
    else if (j == 0)
    {
        if (N[i][0] == 0)
        {
            M[i][0] = matrixPath(m, r, c, i - 1, 0, M, N) + m[i][j];
            N[i][0] = 1;
 
        }
        return M[i][0];
    }
    else
    {
        int a, b;
        if (N[i - 1][j] == 0)
        {
            M[i - 1][j] = matrixPath(m, r, c, i - 1, j, M, N);
            N[i - 1][j] = 1;
        }
        if (N[i][j - 1] == 0)
        {
            M[i][j - 1] = matrixPath(m, r, c, i, j - 1, M, N);
            N[i][j - 1] = 1;
        }
        a = M[i - 1][j];
        b = M[i][j - 1];
        return ((a < b) ? a : b) + m[i][j];
    }
}
int main(void)
{
 
    int i, j, r, c;
    int **M;
    int **N;
    int **m;
    printf("enter row and column\n");
    printf("number of row:");
    scanf("%d", &r);
    printf("number of column:");
    scanf("%d", &c);
    m = (int**)malloc(sizeof(int*) * r);
    M = (int**)malloc(sizeof(int*) * r);
    N = (int**)malloc(sizeof(int*) * r);
    for (i = 0; i < r; i++)
    {
        m[i] = (int*)malloc(sizeof(int) * c);
        M[i] = (int*)malloc(sizeof(int) * c);
        N[i] = (int*)malloc(sizeof(int) * c);
    }
   
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
        {
            M[i][j] = 0;
            N[i][j] = 0;
        }
    printf("%d x %d 행렬의 값을 입력하세요:\n", r, c);
   
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
            scanf("%d", &m[i][j]);
 
    printf("%d\n", matrixPath(m, r, c, r - 1, c - 1, M, N));
    for (i = 0; i < r; i++)
    {
        free(m[i]);
        free(M[i]);
        free(N[i]);
    }
 
    free(m);
    free(M);
    free(N);
}