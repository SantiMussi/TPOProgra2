package Implementaciones;

import java.util.*;
public class grafos {

    public ImplementacionCjtos grafosConexos;

    //Hacemos un getter para obtener los Implementaciones.grafos conexos
    public ImplementacionCjtos getGrafosConexos() {
        return grafosConexos;
    }
    public boolean processGraph(Object graph) {
        if (graph instanceof GrafoDirigido) { //Verificamos si graph es del tipo o de una subclase de Implementaciones.GrafoDirigido
            GrafoDirigido grafoDirigido = (GrafoDirigido) graph; //Convertimos el objeto en un objeto de tipo Implementaciones.GrafoDirigido
            if (esFuertementeConexo(grafoDirigido)) {
                return true;
            } else {
                System.out.println("El grafo dirigido no es fuertemente conexo.");
                return false;
            }
        } else {
            //No hace nada si el grafo no es dirigido
            System.out.println("El grafo no es dirigido, no se procesa.");
            return false;
        }
    }

    private boolean esFuertementeConexo(GrafoDirigido grafo) {
        int numVertices = grafo.getVertices();
        boolean[] visitados = new boolean[numVertices];
        Stack<Integer> pila = new Stack<>();

        //Realizamos un recorrido DFS en el grafo original y almacenamos los vértices en una pila
        for (int i = 0; i < numVertices; i++) {
            if (!visitados[i]) {
                dfs(grafo, i, visitados, pila);
            }
        }

        //Creamos un grafo transpuesto (invertir direcciones de las aristas)
        GrafoDirigido grafoTraspuesto = getGrafoTranspuesto(grafo);

        //Realizamos un recorrido DFS en el grafo traspuesto, empezando desde los vértices en la pila
        boolean[] visitadosTraspuesto = new boolean[numVertices];
        while (!pila.isEmpty()) {
            int vertex = pila.pop();
            if (!visitadosTraspuesto[vertex]) {
                if (!dfs(grafoTraspuesto, vertex, visitadosTraspuesto, new Stack<>())) {
                    return false; // No es fuertemente conexo
                }
            }
        }

        grafosConexos.agregar(grafo);
        return true; // Es fuertemente conexo
    }

    private boolean dfs(GrafoDirigido grafo, int vertice, boolean[] visitados, Stack<Integer> pila) {
        visitados[vertice] = true;
        for (int neighbor : grafo.getVecinos(vertice)) {
            if (!visitados[neighbor]) {
                if (!dfs(grafo, neighbor, visitados, pila)) {
                    return false;
                }
            }
        }
        pila.push(vertice);
        return true;
    }

    private GrafoDirigido getGrafoTranspuesto(GrafoDirigido grafo) {
        GrafoDirigido grafoTraspuesto = new GrafoDirigido(grafo.getVertices());
        for (int i = 0; i < grafo.getVertices(); i++) {
            for (int neighbor : grafo.getVecinos(i)) {
                grafoTraspuesto.addEdge(neighbor, i);
            }
        }
        return grafoTraspuesto;
    }


}