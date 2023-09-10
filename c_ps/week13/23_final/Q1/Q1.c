#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int binary_search(int arr[], int size, int target) {
    int left = 0;
    int right = size - 1;
    int count = 0;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            count++;
            break;
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }

    return count;
}

int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int M, N;
    scanf("%d", &M);  // 마트에서 팔고 있는 물건의 개수
    int* mart_items = (int*)malloc(M * sizeof(int));
    for (int i = 0; i < M; i++) {
        scanf("%d", &mart_items[i]);  // 마트에서 팔고 있는 물건들의 리스트
    }

    scanf("%d", &N);  // 동덕이가 구입하고자 하는 물건의 개수
    int* dongduk_items = (int*)malloc(N * sizeof(int));
    for (int i = 0; i < N; i++) {
        scanf("%d", &dongduk_items[i]);  // 동덕이가 구입하고자 하는 물건들의 리스트
    }

    qsort(mart_items, M, sizeof(int), compare);  // 이진 탐색을 위해 정렬

    int count = 0;
    for (int i = 0; i < N; i++) {
        count += binary_search(mart_items, M, dongduk_items[i]);
    }

    printf("%d\n", count);  // 마트에서 판매되는 물건 개수 출력

    free(mart_items);
    free(dongduk_items);

    return 0;
}
