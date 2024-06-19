package Implementaciones;

import java.util.LinkedList;

// Clase para representar un grafo dirigido
public class GrafoDirigido {
    int V; // Número de vértices
    LinkedList<Integer>[] adj; // Lista de adyacencia

    // Constructor
    public GrafoDirigido(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Método para agregar una arista dirigida desde v a w
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Método para obtener el número de vértices
    int getVertices() {
        return V;
    }

    // Método para obtener los vecinos de un vértice dado
    LinkedList<Integer> getVecinos(int v) {
        return adj[v];
    }
}
