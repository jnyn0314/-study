#include<stdio.h>
void func(int* a) { // 주소 return 하려면 pointer 써야 됨
	*a = 2;
}
int main(void) {
	int b = 0;

	func(&b);
	printf("%d\n", b); // -> b의 값 x 주소가 return
	return 0;
}