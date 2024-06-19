package Implementaciones;
import Interfaces.*;
public class ImplementacionCjtos implements interfazCjtos {
    private Nodo inicio;

    public ImplementacionCjtos() {
        inicio = null;
    }

    @Override
    public void inicializarConjunto() {
        inicio = null;
    }

    @Override
    public boolean agregar(GrafoDirigido x) {
        if (!pertenece(x)) {
            Nodo nuevo = new Nodo(x);
            nuevo.sig = inicio;
            inicio = nuevo;
            return true; //Elemento agregado
        }
        return false; //No se pudo agregar el elemento al conjunto
    }

    @Override
    public boolean sacar(GrafoDirigido x) {
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual != null && actual.info != x) {
            anterior = actual;
            actual = actual.sig;
        }
        if (actual != null) { //Si se encontró el nodoa ser eliminado
            if (anterior == null) {
                inicio = actual.sig; //El nodo a eliminar es el primero
            } else {
                anterior.sig = actual.sig; //Eliminamos el nodo del medio o del final
            }
            return true; //El nodo se eliminó satisfactoriamente
        }
        return false; //No se pudo eliminar el nodo
    }

    @Override
    public boolean pertenece(GrafoDirigido x) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.info == x) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }
}
