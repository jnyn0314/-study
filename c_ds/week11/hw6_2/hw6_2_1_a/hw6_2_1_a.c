// hw6_2_1_a 깊이 우선 탐색, 인접 행렬 이용
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
// #include "queue.h"
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
void dfs_mat(GraphType* g, int v) {
	int w;
	visited[v] = TRUE;

	for (w = 0; w < g->n; w++)
		if (g->adj_mat[v][w] && !visited[w]){
			printf("<%d %d>\n", v, w);
			dfs_mat(g, w);
		}
}
void read_graph(GraphType* g, char* filename) {
	int numOfVer, start, end, vertex;
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
int main(void) {
	GraphType g;
	int vertex;
	graph_init(&g);
	printf("Enter 정점: ");
	scanf("%d", &vertex);
	read_graph(&g, "input.txt");
	
	dfs_mat(&g, vertex);
		
	return 0;
}