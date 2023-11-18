#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h> 
#include "queue.h"
#define TRUE 1
#define FALSE 0
#define MAX_VERTICES 50
int visited[MAX_VERTICES]; // 전역변수는 자동 0으로 초기화
typedef struct GraphNode {
    int vertex;
    struct GraphNode* link;
} GraphNode;
typedef struct GraphType {
    int n; // 정점의 개수
    GraphNode* adj_list[MAX_VERTICES];
} GraphType;
void init_graph(GraphType* g) {
    int v;
    g->n = 0;
    for (v = 0; v < MAX_VERTICES; v++)
        g->adj_list[v] = NULL;
}
void insert_vertex(GraphType* g, int v) {
    if ((g->n + 1) > MAX_VERTICES) {
        fprintf(stderr, "그래프 : 정점의 개수 초과");
        return;
    }
    g->n++;
}
void insert_edge(GraphType* g, int u, int v) {
    GraphNode* node;
    if (u >= g->n || v >= g->n) {
        fprintf(stderr, "그래프 : 정점 번호 오류");
        return;
    }
    node = (GraphNode*)malloc(sizeof(GraphNode));
    node->vertex = v;
    node->link = g->adj_list[u];
    g->adj_list[u] = node;
}
GraphType* delete_edge(GraphType* g, int u, int v) {
    if (u >= g->n || v >= g->n) {
        fprintf(stderr, "그래프 : 정점 번호 오류");
        return g;
    }
    GraphNode* prev = NULL;
    GraphNode* current = g->adj_list[u];

    while (current != NULL && current->vertex != v) {
        prev = current;
        current = current->link;
    }
    if (current != NULL) {
        if (prev == NULL)
            g->adj_list[u] = current->link;
        else
            prev->link = current->link;

        free(current);
    }
    return g;
}
void print_adj_list(GraphType* g) {
    for (int i = 0; i < g->n; i++) {
        GraphNode* p = g->adj_list[i];
        printf("정점 %d의 인접 리스트", i);
        while (p != NULL) {
            printf("->%d ", p->vertex);
            p = p->link;
        }
        printf("\n");
    }
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
        GraphNode* p = g->adj_list[i];
        fprintf(fp, "%d : ", i);
        while (p != NULL) {
            fprintf(fp, "%d ->", p->vertex);
            p = p->link;
        }
        fprintf(fp, "\n");
    }
    fclose(fp);
}
int main(void) {
    GraphType* g = (GraphType*)malloc(sizeof(GraphType)); 
    init_graph(g);
    read_graph(g, "input.txt");
    write_graph(g, "output.txt");
    return 0;
}