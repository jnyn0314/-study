#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void bubbleSort(int a[], int n) {
	int temp = 0;
	for (int i = 0; i < n - 1; i++) {
		for(int j = 0; j < n - 1 - i; j++){
			if (a[j] > a[j + 1]) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
}
int main(void) {
	int a[1000];
	int n = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	bubbleSort(a, n);
	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}
}