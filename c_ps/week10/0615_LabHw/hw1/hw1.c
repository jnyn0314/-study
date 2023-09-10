
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int comb_memo(int n, int r, int *m) {
	if (r == 0 || r == n) {
		return 1;
	}
	if (n - 1 == r) { 
		if (m[r] == 0)
			m[r] = comb_memo(n - 1, r - 1, m) + comb_memo(n - 1, r, m);
		return m[r];
	}
	return comb_memo(n - 1, r - 1, m) + comb_memo(n - 1, r, m);
}
int main(void) {

	int n, r, i;
	int*m;

	scanf("%d %d", &n, &r);
	
	m = (int*)malloc(sizeof(int) * (r + 1));
	
	for (i = 0; i <= r; i++)
		m[i] = 0;

	int c = comb_memo(n, r, m);

	printf("%d", c);

	free(m);
	return 0;
}
