// hw(bubble2)
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
struct Student
{
	int id;
	int math;
	int korean;
	int english;
}Stu;
bubbleSort(struct Student *s, int n, int standard) {
	int i, j;
	struct Student temp;

	for (i = 0; i < n; i++) {
		for (j = 0; j < n - 1 - i; j++) {
			
			if (standard == 4) {
				if (s[j].id > s[j + 1].id) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
			else if (standard == 1) {
				if (s[j].math < s[j + 1].math) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
			else if (standard == 2) {
				if (s[j].korean < s[j + 1].korean) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
			else if (standard == 3) {
				if (s[j].english < s[j + 1].english) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}
}
/*
void swap(struct Student* s, int n, int standard) {
	
}
*/
int main(void) {

	srand((unsigned)time(NULL));

	int n;
	struct Student* s;
	int standard, i;
	
	printf("학생 수를 입력하세요:");
	scanf("%d", &n);

	s = malloc(sizeof(Stu) * n);

	if (n <= 0)
		return 0;
	if (!s) {
		printf("malloc error");
	}

	for (i = 0; i < n; i++) {
		s[i].id = rand() % 10;
		s[i].math = rand() % 101;
		s[i].korean = rand() % 101;
		s[i].english = rand() % 101;
	} 

	bubbleSort(s, n, 4);

	for (i = 0; i < n; i++) {
		printf("학번 : %d\t영어 : %d\t수학 : %d\t국어: %d\n", s[i].id, s[i].english, s[i].math, s[i].korean);
	}

	do {
		printf("정렬 기준 선택:<1:국어, 2:수학, 3:영어, 4: id(오름차순)>, 0: 끝내기> :");
		scanf("%d", &standard);
		if (standard == 0)
			break;
		bubbleSort(s, n, standard);
		for (i = 0; i < n; i++) {
			printf("학번 : %d\t영어 : %d\t수학 : %d\t국어: %d\n", s[i].id, s[i].english, s[i].math, s[i].korean);
		}

	} while (1);

	free(s);
	return 0;
}