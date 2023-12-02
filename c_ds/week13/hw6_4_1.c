#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#define TRUE 1 
#define FALSE 0 
#define MAX_VERTICES 100 
#define INF 1000000 /* 무한대 (연결이 없는 경우) */
typedef struct GraphType {
	int n; // 정점의 개수
	int weight[MAX_VERTICES][MAX_VERTICES];
} GraphType;
int distance[MAX_VERTICES];/* 시작정점으로부터의 최단경로 거리 */
int found[MAX_VERTICES]; /* 방문한 정점 표시 */
int previous[MAX_VERTICES]; /* 최단 경로 상에 있는 그 정점의 바로 앞 정점 저장 */
int choose(int distance[], int n, int found[])
{ // 집합 s에 포함되지 않은, distance[]이 가장 작은 정점 반환
	int i, min, minpos;
	min = INT_MAX;
	minpos = -1;
	for (i = 0; i < n; i++) {
		if (distance[i] < min && !found[i]) {
			min = distance[i];
			minpos = i;
		}
	}
	return minpos;
}
void print_path(int start, int end)
{
	int u = end;
	if (start == end) {
		printf("%d ", start);
		return;
	}
	else {
		print_path(start, previous[u]);
		printf("-> %d ", u);
	}
}
void shortest_path(GraphType* g, int start)
{
	int i, u, w;
	for (i = 0; i < g->n; i++) /* 초기화 */
	{
		distance[i] = g->weight[start][i];
		found[i] = FALSE;
		previous[i] = start;
	}
	found[start] = TRUE; /* 시작 정점 방문 표시 */
	distance[start] = 0;
	previous[start] = 0;
	for (i = 0; i < g->n - 1; i++) {
		u = choose(distance, g->n, found);
		found[u] = TRUE;

		for (w = 0; w < g->n; w++)
			if (!found[w])
				if (distance[u] + g->weight[u][w] < distance[w]) {
					distance[w] = distance[u] + g->weight[u][w];
					previous[w] = u;
				}
				
		print_path(start, u);
		printf("<%d>\n", distance[u]);
	}	
}
void insert_edge(GraphType* g, int start, int end, int value)
{
	if (start >= g->n || end >= g->n) {
		fprintf(stderr, "그래프 : 정점 번호 오류");
		return;
	}
	g->weight[start][end] = value;
	g->weight[end][start] = value;
}
void read_graph(GraphType* g, char* filename)
{
	// 구현
	int numOfVer, start, end, weight;
	FILE* fp = fopen(filename, "r");
	if (fp == NULL) {
		fprintf(stderr, "파일 %s를 열 수 없음\n", filename);
		return;
	}
	fscanf(fp, "%d", &numOfVer);
	g->n = numOfVer;

	while (fscanf(fp, "%d %d %d", &start, &end, &weight) != EOF) {
		insert_edge(g, start, end, weight);
	}

	fclose(fp);
}
void graph_init(GraphType* g)
{
	// 구현
	g->n = 0;
	for (int i = 0; i < MAX_VERTICES; i++) {
		for (int j = 0; j < MAX_VERTICES; j++) {
			g->weight[i][j] = INF;
		}
	}
}
int main(void)
{
	GraphType g;

	graph_init(&g);
	
	read_graph(&g, "input.txt");

	shortest_path(&g, 0); // 0이 시작점
}