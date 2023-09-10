// 순열과 조합
// lab(뽑기 - 공뽑기)
#include<stdio.h>
void pick(int n, int *array, int array_size, int k, char *balls) {
	
	int i, lastIndex, smallest = 0, item;
	
	if (k == 0) {
		for (i = 0; i < array_size; i++) {
			printf("%c ", balls[array[i]]);
		}
		printf("\n");
		return; // 필수!
	}
	
	lastIndex = array_size - k - 1;

	if (array_size == k) {
		smallest = 0;
	}
	else
		smallest = array[lastIndex] + 1;

	for (item = smallest; item < n; item++) {
		array[lastIndex + 1] = item;
		pick(n, array, array_size, k - 1, balls);
	}
}
int main(void) {

	int array[3];
	char balls[7] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	pick(7, array, 3, 3, balls);

	return 0;
}