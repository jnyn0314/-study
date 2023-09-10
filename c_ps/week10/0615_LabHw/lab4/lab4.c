#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int comb(int n, int r) {
	printf("comb(%d, %d)\n", n, r);
	if (r == 0)
		return 1;
	else if (r == n)
		return 1;
	else {
		return comb(n - 1, r - 1) + comb(n - 1, r);
	}
}
int main(void) {

	int C;
	C = comb(4, 2); // 4C2
	// C Ãâ·Â 
	printf("%d", C);

	return 0;
}