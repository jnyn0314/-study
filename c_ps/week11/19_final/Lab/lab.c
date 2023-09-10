#include<stdio.h>
void func(int* a) {
	*a = 2;
}
int main() {
	int b = 0;

	func(&b);
	printf("%d\n", b);
	return 0;
} // main의 변수가 공유하도록
// pointer의 