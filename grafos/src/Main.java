import Implementaciones.*;

public class Main {
    public static void main(String[] args) {
        // Crear un grafo dirigido no conexo
        GrafoDirigido grafoNoConexo = new GrafoDirigido(4);
        grafoNoConexo.addEdge(0, 1);
        grafoNoConexo.addEdge(2, 3);

        // Crear un grafo dirigido fuertemente conexo
        GrafoDirigido grafoConexo = new GrafoDirigido(4);
        grafoConexo.addEdge(0, 1);
        grafoConexo.addEdge(1, 2);
        grafoConexo.addEdge(2, 3);
        grafoConexo.addEdge(3, 0);

        // Crear una instancia de la clase grafos
        grafos gestorDeGrafos = new grafos();

        // Inicializar el conjunto de grafos conexos
        gestorDeGrafos.grafosConexos = new ImplementacionCjtos();

        // Procesar el grafo no conexo y verificar componentes fuertemente conexos
        ImplementacionCjtos componentesNoConexos = gestorDeGrafos.encontrarComponentesFuertementeConexos(grafoNoConexo);
        System.out.println("Componentes fuertemente conexos en el grafo no conexo:");
        mostrarComponentes(componentesNoConexos);

        // Procesar el grafo fuertemente conexo y verificar componentes fuertemente conexos
        ImplementacionCjtos componentesConexos = gestorDeGrafos.encontrarComponentesFuertementeConexos(grafoConexo);
        System.out.println("Componentes fuertemente conexos en el grafo conexo:");
        mostrarComponentes(componentesConexos);
    }

    // Método para mostrar los componentes fuertemente conexos
    private static void mostrarComponentes(ImplementacionCjtos componentes) {
        Nodo actual = componentes.inicio;
        int count = 1;
        while (actual != null) {
            System.out.println("Componente " + count + ":");
            GrafoDirigido grafo = actual.info;
            for (int i = 0; i < grafo.getVertices(); i++) {
                System.out.print("Vértice " + i + " conectado a: ");
                for (int vecino : grafo.getVecinos(i)) {
                    System.out.print(vecino + " ");
                }
                System.out.println();
            }
            actual = actual.sig;
            count++;
        }
    }
}