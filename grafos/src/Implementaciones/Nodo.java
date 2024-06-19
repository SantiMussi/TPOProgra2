package Implementaciones;

public class Nodo {
    GrafoDirigido info;
    Nodo sig;

    public Nodo(GrafoDirigido grafo){
        this.info = grafo;
        this.sig = null;
    }
}
