// kruscal 최소비용 신장트리, 인접행렬로
#include <stdio.h>
#define MAX_VERTICES 100
#define INF 1000L
typedef struct GraphType {
	int n;
	int adj_mat[MAX_VERTICES][MAX_VERTICES];
}GraphType;
void graph_init(GraphType* g){
	int r, c;
	g->n = 0;
	for (r = 0; r < MAX_VERTICES; r++)
		for (c = 0; c < MAX_VERTICES; c++)
			g->adj_mat[r][c] = INF;
}
void insert_edge(GraphType* g, int start, int end) { // 간선 삽입
	if (start >= g->n || end >= g->n) {
		fprintf(stderr, "그래프 정점 번호 오류");
		return;
	}
	g->adj_mat[start][end] = 1;
	g->adj_mat[end][start] = 1;
}
void swap(int* a, int* b) {
	int temp = *a;
	*a = *b;
	*b = temp;
}

void kruscal(GraphType* g, GraphType* t) { // 입력그래프 g, 출력그래프 t
	int edge_accepted = 0; // 현재까지 선택된 간선의 수
	int uset, vset;

	set_init(g->n);
	// 간선을 오름차순으로 정렬
	
	// 정점 u의 집합 번호
	// v의 집합 번호
	// 서로 속한 집합이 다르면
	// 선택
	// 두개의 집합을 합친다.

}
void readGraph(GraphType *g, char *filename) {
	int numOfVer, start, end, weight;
	FILE* fp = fopen(filename, "r");
	if (fp == NULL) {
		fprintf(stderr, "파일 %s를 열 수 없음\n", filename);
		return;
	}
	fscanf(fp, "%d", &numOfVer);
	g->n = numOfVer;

	while (fscanf(fp, "%d %d %d", &start, &end, &weight) != EOF)
		insert_edge(g, start, end, weight);

	fclose(fp);
}
main()
{
	GraphType g, t; // 입력 그래프, 결과 트리 
	graph_init(&g);
	read_graph(&g, "input.txt");
	graph_init(&t);
	t.n = g.n;
	kruskal(&g, &t);
	printf("파일로 출력:\n");
	write_graph(&t, "output.txt");
	write_graph(&t, NULL); // to stdout 
}
