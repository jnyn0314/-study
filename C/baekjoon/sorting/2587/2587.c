#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void bubbleSort(int num[]) {

	int i, j, temp = 0;

	for (i = 0; i < 4; i++) {
		for (j = 0; j < 4 - i; j++) {
			if (num[j] > num[j + 1]) {
				temp = num[j];
				num[j] = num[j + 1];
				num[j + 1] = temp;
			}
		}
	}
}
int average(int num[]) {
	
	int i, total = 0, avg = 0;

	for (i = 0; i < 5; i++) {
		total += num[i];
	}
	avg = total / 5;

	return avg;
}
int main(void) {

	int i, avg = 0;
	int num[5];

	for (i = 0; i < 5; i++) {
		scanf("%d", &num[i]);
	}

	bubbleSort(num);
	avg = average(num);

	printf("%d\n%d", avg, num[2]);

	return 0;
}