#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

#define MAX_STRING 100
#define MAX_STACK_SIZE 100

typedef char element;

typedef struct {
	int top;
	element word[MAX_STRING];
}StackType;

void init_stack(StackType* s) {
	s->top = -1;
}

int is_empty(StackType* s) {
    return (s->top == -1);
}

int is_full(StackType* s) {
    return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element word) {
    if (is_full(s)) {
        fprintf(stderr, "스택 포화 에러\n");
        return;
    }
    else {
        s->word[++(s->top)] = word;
    }
}

element pop(StackType* s) {
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    return s->word[s->top--];
}

element peek(StackType* s) {
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    return s->word[s->top];
}

int palindrome(char str[]) {
	StackType s;	
    init_stack(&s);

    int count = 0, i, j;

    //str의 문자열을 스택에 넣기
    for (i = 0; str[i] != '\0'; i++) {
        push(&s, str[i]);
        count++;
    }

    // 스택에서 하나씩 빼면서 문자들과 차례로 비교
    for (j = 0; j < count / 2; j++) {
        if (str[j] == pop(&s))
            continue;
        else
            return 0;
    }
    return 1;
}
int main(void) {

    char word[MAX_STRING];

	printf("Enter a word to check palindrome:");
	scanf("%s", word);

	if (palindrome(word))
		printf("palindrome 입니다.\n");
	else
		printf("palindrome이 아닙니다.\n");
	
	return 0;
}