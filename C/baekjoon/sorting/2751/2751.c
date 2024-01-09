#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void heapify(int arr[], int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest]) {
        largest = left;
    }

    if (right < n && arr[right] > arr[largest]) {
        largest = right;
    }

    if (largest != i) {
        swap(&arr[i], &arr[largest]);
        heapify(arr, n, largest);
    }
}

void heap_sort(int arr[], int n) {
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    for (int i = n - 1; i > 0; i--) {
        swap(&arr[0], &arr[i]);
        heapify(arr, i, 0);
    }
}

int main() {
    int i, number = 0;
    scanf("%d", &number);

    int* arr = (int*)malloc(number * sizeof(int));

    if (arr == NULL) {
        printf("Memory allocation failed\n");
        return 1;  // Exit with an error code
    }

    for (i = 0; i < number; i++) {
        scanf("%d", &arr[i]);
    }

    heap_sort(arr, number);

    for (i = 0; i < number; i++) {
        printf("%d\n", arr[i]);
    }

    free(arr);
    return 0;
}

