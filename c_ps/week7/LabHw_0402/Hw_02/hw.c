// hw(bubble)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
struct Student
{
	int id;
	int korean;
	int english;
	int math;
}Stu;
void bubbleSortDecendingByKorean(struct Student *s, int n) {

	int i, j;
	struct Student temp;

	for (i = 0; i < n - 1; i++) {
		for (j = 0; j < n - 1 - i; j++) {
			if (s[j].korean < s[j + 1].korean) {
				temp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = temp;
			}
		}
	}
}
void bubbleSortAscendingById(struct Student *s, int n) {
	int i, j;
	struct Student temp;
	
	for (i = 0; i < n - 1; i++) {
		for (j = 0; j < n - 1 - i; j++) {
			if (s[j].id > s[j + 1].id) {
				temp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = temp;
			}
		}
	}
}
int main(void) {

	srand((unsigned)time(NULL));

	int n;

	scanf("%d", &n);

	struct Student* s = malloc(sizeof(Stu) * n);

	if (n <= 0) {
		return 0;
	}
	if (!s) {
		printf("malloc error");
		return 0;
	}

	int i;

	for (i = 0; i < n; i++) {
		s[i].id = rand() % 1000;
		s[i].english = rand() % 101;
		s[i].math = rand() % 101;
		s[i].korean = rand() % 101;
	} // 랜덤 값 지정

	// 두개의 함수 호출, 각각 정렬
	bubbleSortDecendingByKorean(s, n);

	for (int i = 0; i < n; i++) 
		printf("id: %d, korean: %d, english: %d, math: %d\n", s[i].id, s[i].korean, s[i].english, s[i].math);

	printf("\n");

	bubbleSortAscendingById(s, n);

	for (int i = 0; i < n; i++)
		printf("id: %d, korean: %d, english: %d, math: %d\n", s[i].id, s[i].korean, s[i].english, s[i].math);
	
	free(s);
	return 0;
}