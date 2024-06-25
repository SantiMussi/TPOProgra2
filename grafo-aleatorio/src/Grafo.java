import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Grafo {

    private int Vertices; // Número de vértices
    private LinkedList<HashMap<Integer, Double>> adj; // Listas de adyacencia con probabilidades

    public Grafo(int Vertices) {
        this.Vertices = Vertices;
        adj = new LinkedList<>();
        int i = 0;
        while (i < Vertices) {
             adj.add(new HashMap<>());
             i++;
         }
    }

    // Método para añadir una arista al grafo con una probabilidad
    public void addEdge(int v, int w, double probabilidad) {
        adj.get(v).put(w, probabilidad); // Añadir w con la probabilidad a la lista de v
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (int i = 0; i < Vertices; i++) {
            System.out.print(i + ": ");
            for (Map.Entry<Integer, Double> entry : adj.get(i).entrySet()) {
                System.out.print("(" + entry.getKey() + ", " + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}
