package Interfaz;
import Implementacion.Nodo;
public interface interfazConjuntos {
    void inicializarConjunto();
    boolean agregar(int x);
    boolean sacar(int x);
    Nodo pertenece(int x);
}
