#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>

#define MAX_QUEUE_SIZE 3

typedef char element;
typedef struct {
	element men[MAX_QUEUE_SIZE];
	element women[MAX_QUEUE_SIZE];

	int front_men, rear_men;
	int front_women, rear_women;
}QueueType;

void error(char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

void init_queue(QueueType* pm, QueueType* pwm) {
	pm->front_men = pm->rear_men = 0;
	pwm->front_women = pwm->rear_women = 0;
}

int is_empty(QueueType* pm, QueueType* pwm) {
	if (pm->front_men == pm->rear_men || pwm->front_women == pwm->rear_women)
		return 1;
	else
		return 0;
}

int is_full(QueueType* pm, QueueType* pwm) {
	if ((pm->rear_men + 1) % MAX_QUEUE_SIZE == pm->front_men || (pwm->rear_women + 1) % MAX_QUEUE_SIZE == pwm->front_women)
		return 1;
	else
		return 0;
}
int main(void) {



	return 0;
}