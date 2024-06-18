import java.util.*;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.addEdge(0, 1, 0.5);
        g.addEdge(0, 4, 0.2);
        g.addEdge(1, 2, 0.3);
        g.addEdge(1, 3, 0.6);
        g.addEdge(2, 3, 0.7);
        g.addEdge(3, 4, 0.8);

        g.printGraph();
    }
}

