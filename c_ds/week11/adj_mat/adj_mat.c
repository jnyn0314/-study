// 그래프 추상 타입의 구현(인접 행렬 이용)
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define MAX_VERTICES 50
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
void insert_vertex(GraphType* g) { // 정점 삽입
	if ((g->n) + 1 > MAX_VERTICES) {
		fprintf(stderr, "그래프 정점의 개수 초과");
		return;
	}
	g->n++;
}
void print_adj_mat(GraphType* g) {
	for (int i = 0; i < g->n; i++) {
		for (int j = 0; j < g->n; j++) {
			printf("%2d ", g->adj_mat[i][j]);
		}
		printf("\n");
	}
}
int outDegree(GraphType* g, int vertex) {
	int degree = 0;
	for (int i = 0; i < g->n; i++) {
		degree += g->adj_mat[vertex][i];
	}
	return degree;
}
int inDegree(GraphType* g, int vertex) {
	int degree = 0;
	for (int i = 0; i < g->n; i++) {
		degree += g->adj_mat[i][vertex];
	}
	return degree;
}
int countDegree(GraphType* g) {
	int degree = 0;
	for (int i = 0; i < g->n; i++) {
		for (int j = 0; j < g->n; j++)
		degree += g->adj_mat[i][j];
	}
	return degree;
}
int main(void) {
	GraphType* g;
	g = (GraphType*)malloc(sizeof(GraphType));
	graph_init(g);

	for (int i = 0; i < 4; i++)
		insert_vertex(g, i);
	insert_edge(g, 0, 1);
	insert_edge(g, 0, 2);
	insert_edge(g, 0, 3);
	insert_edge(g, 1, 2);
	insert_edge(g, 2, 3);
	
	print_adj_mat(g);
	free(g);
}