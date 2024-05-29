package Interface;

public interface PilaDinamica {
    void inicializarPila(int max);
    boolean apilar(int x);
    boolean desapilar();
    int tope();
    boolean pilaVacia();
}
