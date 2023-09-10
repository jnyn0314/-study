#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
struct Student
{
    int id;
    int korean, english, math;
}stu;

int partition(struct Student* A, int p, int r) {
    int i, j;
    struct Student t;

    i = p - 1;

    for (j = p; j < r; j++) {
        if (A[j].korean < A[r].korean) {
            i++;
            //A[i] <-> A[j]
            t = A[i];
            A[i] = A[j];
            A[j] = t;
        }
    }

    i++;
    t = A[i];
    A[i] = A[r];
    A[r] = t;
    return i;
}

void quickSort(struct Student* A, int p, int r) {
    if (p < r) {
        int q = partition(A, p, r);
        quickSort(A, p, q - 1);
        quickSort(A, q + 1, r);
    }
}

int main() {
    int n;
    struct Student* s;
    int i;

    srand(time(NULL));

    scanf("%d", &n);

    s = malloc(sizeof(stu) * n);

    for (i = 0; i < n; i++) {
        s[i].id = i;
        s[i].english = rand() % 100 + 1;
        s[i].korean = rand() % 100 + 1;
        s[i].math = rand() % 100 + 1;
    }

    for (i = 0; i < n; i++)
        printf("%d\t %d %d %d\n", s[i].id, s[i].korean, s[i].english, s[i].math);
    printf("\n");

    quickSort(s, 0, n - 1);

    for (i = 0; i < n; i++)
        printf("%d\t %d %d %d\n", s[i].id, s[i].korean, s[i].english, s[i].math);
    printf("\n");

    free(s);
    return 0;
}