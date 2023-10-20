#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_STRING 100
typedef char element;
typedef struct CharNode {
    element data;
    struct CharNode* link;
} CharNode;
typedef struct LinkedStackType {
    CharNode* top;
} LinkedStackType;
void init(LinkedStackType* s) {
    s->top = NULL;
}
int is_empty(LinkedStackType* s) {
    return s->top == NULL;
}
void push(LinkedStackType* s, element data) {
    CharNode* newNode = (CharNode*)malloc(sizeof(CharNode));
    if (newNode == NULL) {
        fprintf(stderr, "메모리 할당 에러\n");
        return;
    }
    newNode->data = data;
    newNode->link = s->top;
    s->top = newNode;
}
element pop(LinkedStackType* s) {
    if (is_empty(s)) {
        fprintf(stderr, "스택이 비어있음\n");
        exit(1);
    }
    CharNode* temp = s->top;
    element item = temp->data;
    s->top = s->top->link;
    free(temp);
    return item;
}
int is_palindrome(LinkedStackType* s) {
    // Create an empty stack to store the reversed string
    LinkedStackType reverseStack;
    init(&reverseStack);

    // Push the characters from the original stack to the reverse stack
    CharNode* current = s->top;
    while (current != NULL) {
        push(&reverseStack, current->data);
        current = current->link;
    }

    // Compare the characters from the original stack with the reverse stack
    current = s->top;
    while (current != NULL) {
        if (current->data != pop(&reverseStack)) {
            // If characters do not match, it's not a palindrome
            return 0;
        }
        current = current->link;
    }

    // If all characters match, it's a palindrome
    return 1;
}

int main(void) {
    char word[MAX_STRING];
    printf("Enter a word to check for palindrome: ");
    scanf("%s", word);

    LinkedStackType stack;
    init(&stack);

    // Push each character of the input word onto the stack
    for (int i = 0; i < strlen(word); i++) {
        push(&stack, word[i]);
    }

    if (is_palindrome(&stack)) {
        printf("Palindrome 입니다.\n");
    }
    else {
        printf("Palindrome 이 아닙니다.\n");
    }

    return 0;
}