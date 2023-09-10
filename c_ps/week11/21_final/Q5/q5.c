#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
struct Coefficient {
	int F0;
	int F1;
};
struct Coefficient fib(int n, struct Coefficient *memo) {
	struct Coefficient ret;
	
	if (memo[n].F1 != -1)
		return memo[n];

	if (n == 0) {
		ret.F1 = 0;
		ret.F0 = 1;
		return ret;
	}// f1 의 계수 f0의 계수를 각각 만들어서 return 
	else if (n == 1) {
		ret.F0 = 0;
		ret.F1 = 1;
		return ret;
	}
	else {
		struct Coefficient fn_1;
		struct Coefficient fn_2;

		fn_1 = fib(n - 1, memo);
		fn_2 = fib(n - 2, memo);

		ret.F1 = fn_1.F1 + fn_2.F1;
		ret.F0 = fn_1.F0 + fn_2.F0;
		
		return ret;
	}
}
int main(void) {
	int n, i;
	struct Coefficient ret;
	struct Coefficient *memo;
	scanf("%d", &n);

	
	memo = (struct Coefficient*)malloc(sizeof(struct Coefficient) * (n + 1));
	for (i = 0; i < n; i++) {
		memo->F0 = -1;
		memo->F1 = -1; // 아직 계산이 안되어있다. 라는 뜻
	}

	ret = fib(n, memo);
	printf("%d %d\n", ret.F1, ret.F0);

	free(memo);
	return 0;
}