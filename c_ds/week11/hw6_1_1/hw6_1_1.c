// 그래프 추상 타입의 구현(인접 행렬 이용)
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include "queue.h"
#define TRUE 1
#define FALSE 0
#define MAX_VERTICES 50
int visited[MAX_VERTICES]; // 전역변수는 자동 0으로 초기화
typedef struct GraphType {
	int n; // 정점의 개수
	int adj_mat[MAX_VERTICES][MAX_VERTICES];
} GraphType;
void graph_init(GraphType* g) {
	int r, c;
	g->n = 0;
	for (r = 0; r < MAX_VERTICES; r++)
		for (c = 0; c < MAX_VERTICES; c++)
			g->adj_mat[r][c] = 0;
}
void insert_edge(GraphType* g, int start, int end) { // 간선 삽입
	if (start >= g->n || end >= g->n) {
		fprintf(stderr, "그래프 정점 번호 오류");
		return;
	}
	g->adj_mat[start][end] = 1;
	g->adj_mat[end][start] = 1;
}
void delete_edge(GraphType* g, int start, int end) { // 간선 삭제
	if (start >= g->n || end >= g->n) {
		fprintf(stderr, "그래프 정점 번호 오류");
		return;
	}
	g->adj_mat[start][end] = 0;
	g->adj_mat[end][start] = 0;
}
void insert_vertex(GraphType* g) { // 정점 삽입
	if ((g->n) + 1 > MAX_VERTICES) {
		fprintf(stderr, "그래프 정점의 개수 초과");
		return;
	}
	g->n++;
}
void dfs_mat(GraphType* g, int v) {
	int w;
	visited[v] = TRUE;
	printf("정점%d ->", v);
	for (w = 0; w < g->n; w++)
		if (g->adj_mat[v][w] && !visited[w])
			dfs_mat(g, w);
}
void bfs_mat(GraphType* g, int v) {
	int w;
	QueueType q;
	init(&q);
	visited[v] = TRUE;
	printf("%d", v);
	enqueue(&q, v);
	while (!is_empty(&q)) {
		v = dequeue(&q);
		for (w = 0; w < g->n; w++)
			if (g->adj_mat[v][w] && !visited[w]) {
				visited[w] = TRUE;
				printf("%d", w);
				enqueue(&q, w);
			}
	}
}
void visited_init() {
	int i;
	for (i = 0; i < MAX_VERTICES; i++)
		visited[i] = 0;
}
void read_graph(GraphType* g, char* filename) {
	int numOfVer, start, end;
	FILE* fp = fopen(filename, "r");
	if (fp == NULL) {
		fprintf(stderr, "파일 %s를 열 수 없음\n", filename);
		return;
	}
	fscanf(fp, "%d", &numOfVer);
	g->n = numOfVer;

	while (fscanf(fp, "%d %d", &start, &end) != EOF) {
		insert_edge(g, start, end);
	}
	fclose(fp);
}
void write_graph(GraphType* g, char* filename) {
	FILE* fp;

	if (filename == NULL)
		fp = stdout;
	else {
		fp = fopen(filename, "w");
		if (fp == NULL) {
			fprintf(stderr, "파일 %s를 열 수 없음\n", filename);
			return;
		}
	}
	for (int i = 0; i < g->n; i++) {
		for (int j = 0; j < g->n; j++)
			fprintf(fp, "%d", g->adj_mat[i][j]);
		fprintf(fp, "\n");
	}
	fclose(fp);
}
void print_adj_mat(GraphType* g) {
	for (int i = 0; i < g->n; i++) {
		for (int j = 0; j < g->n; j++) {
			printf("%d", g->adj_mat[i][j]);
		}
		printf("\n");
	}
}
int main(void) {
	GraphType g;
	graph_init(&g);

	read_graph(&g, "input.txt");
	write_graph(&g, "output.txt");

	return 0;
}
