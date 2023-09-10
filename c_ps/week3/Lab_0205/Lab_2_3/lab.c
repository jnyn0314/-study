#include<stdio.h>

int functionH(int i);

int functionH(int i) {
	int j, sum = 0;
	if (i == 0 || i == 1) {
		return 1;
	}
	else {
		for (j = 0; j < i; j++) {
			sum += functionH(j) * functionH(i - j - 1);
		}
		return sum;
	}
}
int main(void) {

	int n = 10;

	printf("%d", functionH(n));

	return 0;
}
