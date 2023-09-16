#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h> 

#define MAX_STACK_SIZE 3
#define MAX_STRING 100

typedef int element;

typedef struct {
    element data[MAX_STACK_SIZE];
    char name[MAX_STACK_SIZE][MAX_STRING]; 
    int top;
} StackType;

void init_stack(StackType* s) {
    s->top = -1;
}

int is_empty(StackType* s) {
    return (s->top == -1);
}

int is_full(StackType* s) {
    return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element item, char* name) { 
    if (is_full(s)) {
        fprintf(stderr, "스택 포화 에러\n");
        return;
    }
    else {
        s->data[++(s->top)] = item;
        strcpy(s->name[s->top], name); // 이미 위에서 top이 하나 증가했음
    }
}

element pop(StackType* s) {
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    return s->data[s->top--];
}

element peek(StackType* s) {
    if (is_empty(s)) {
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }
    return s->data[s->top];
}

void stack_print(StackType* s) {
    if (is_empty(s)) {
        printf("<empty>\n--\n");
        return;
    }
    else {
        for (int i = s->top; i >= 0; i--) {
            if (i == s->top) {
                printf("[%d %s] <- top\n", s->data[i], s->name[i]);
            }
            else
                printf("%d %s\n", s->data[i], s->name[i]);
        }
        printf("--\n");
    }
    return;
}

int main(void) {
    StackType s; // 스택을 정적으로 생성

    init_stack(&s);
    stack_print(&s);

    push(&s, 10, "ten");
    stack_print(&s);

    push(&s, 20, "twenty");
    stack_print(&s);

    push(&s, 30, "thirty");
    stack_print(&s);

    push(&s, 40, "fourty");
    stack_print(&s);

    pop(&s);
    stack_print(&s);

    push(&s, 50, "fifty");
    stack_print(&s);

    pop(&s);
    stack_print(&s);

    pop(&s);
    stack_print(&s);

    pop(&s);
    stack_print(&s);

    return 0;
}
