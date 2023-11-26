#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include "minheap.h"
#include "unionfind.h"
#define MAX_VERTICES 100
#define INF 9999
typedef struct GraphType {
	int n;					// 정점의 개수
	int adj_mat[MAX_VERTICES][MAX_VERTICES];
} GraphType;

// 그래프 초기화 
void graph_init(GraphType* g)
{
	// 구현
	g->n = 0;
	for (int i = 0; i < MAX_VERTICES; i++) {
		for (int j = 0; j < MAX_VERTICES; j++) {
			g->adj_mat[i][j] = INF;
		}
	}
}
void insert_edge(GraphType* g, int start, int end, int weight)
{
	if (start >= g->n || end >= g->n) {
		fprintf(stderr, "그래프 : 정점 번호 오류");
		return;
	}
	g->adj_mat[start][end] = weight;
	g->adj_mat[end][start] = weight;
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

/*  */
void write_graph(GraphType* g, char* filename)
{
	// 구현
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
	fprintf(fp, "%d\n", g->n);
	for (int i = 0; i < g->n; i++)
		for (int j = 0; j < g->n; j++) // 대칭이니까 반만 출력하도록
			if (g->adj_mat[i][j] != INF)
				fprintf(fp, "%d %d %d\n", i, j, g->adj_mat[i][j]);

	fclose(fp);
}

// 인접 행렬이나 인접 리스트에서 간선들을 읽어서 최소 히프에 삽입 
// 현재는 예제 그래프의 간선들을 삽입한다.
void insert_all_edges(HeapType* h, GraphType* g)
{
	// 구현

	for (int i = 0; i < g->n; i++) {
		for (int j = i; j < g->n; j++) {
			if (g->adj_mat[i][j] != INF) {
				element e;
				e.u = i;
				e.v = j;
				e.key = g->adj_mat[i][j];
				insert_min_heap(h, e);
			}
		}
	}


}

// kruskal의 최소 비용 신장 트리 프로그램
void kruskal(GraphType* g, GraphType* t)
{
	int edge_accepted = 0;
	int uset, vset;
	HeapType h;
	init(&h);
	insert_all_edges(&h, g);
	set_init(g->n);
	element e; // 힙 요소
	
	while (edge_accepted < (g->n - 1)) {
		e = delete_min_heap(&h);
		uset = set_find(e.u);
		vset = set_find(e.v);
		if (uset != vset) {
			edge_accepted++;
			t->adj_mat[e.u][e.v] = e.key;
			set_union(uset, vset);
		}
	}
}

int main(void)
{
	GraphType g, t;		// 입력 그래프, 결과 트리

	graph_init(&g);
	read_graph(&g, "input2.txt");
	//read_graph(&g, "input.txt");

	graph_init(&t);
	t.n = g.n;

	kruskal(&g, &t);

	printf("파일로 출력:\n");
	write_graph(&t, "output.txt");
	write_graph(&t, NULL);	// to stdout
}
