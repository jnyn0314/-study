// selection(hw)
// 학생의 성적을 정렬하는 프로그램 작성
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
struct Student {
	int id;
	int korean, english, math;
}Student;
void selectonSort(struct Student* A, int n) {
	int i, j, max, max_idx;
	struct Student temp;

	for (i = 0; i < n - 1; i++) {
		// max = A[0]; // 여기서 오류
		max_idx = 0;

		for (j = 0; j < n - i; j++) {
			/*
			if (max < A[j]) {
				max = A[j];
				max_idx = j;
			}
			*/
			if (A[j].korean > A[max_idx].korean) {
				max_idx = j;
			}
		}
		temp = A[max_idx];
		A[max_idx] = A[n - 1 - i];
		A[n - 1 - i] = temp;
	}
}
int main() {

	srand((unsigned)time(NULL));

	// n 입력 받음
	int n;

	scanf("%d", &n);

	if (n <= 0)
		return 0;
	// Student 구조체 배열을 동적으로 할당
	struct Student* s = malloc(sizeof(Student) * n);

	if (!s)
		return 0;

	// 랜덤 부여
	for (int i = 0; i < n; i++) {
		s[i].id = rand() % 100 + 1;
		s[i].english = rand() % 101;
		s[i].math = rand() % 101;
		s[i].korean = rand() % 101;
	}
	
	selectonSort(s, n);

	for (int i = 0; i < n; i++) {
		printf("%d %d %d %d\n", s[i].korean, s[i].english, s[i].math, s[i].id);
	}

	free(s);
	return 0;
}