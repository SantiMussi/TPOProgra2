package Implementacion;
import Interfaz.interfazConjuntos;
public class implementacionConjuntos implements interfazConjuntos {
    private Nodo inicio;
    @Override
    public void inicializarConjunto() {
        inicio = null;
    }

    @Override
    public boolean agregar(int x) {
        Nodo nuevo = new Nodo();
        if(pertenece(x) == null){
            nuevo.valor = x;
            nuevo.cantidad = 1;
            nuevo.sig = inicio;
            inicio = nuevo;
            return true;
        } else{
            nuevo.cantidad++;
        }
        return false; //No se pudo agregar
    }

    @Override
    public boolean sacar(int x) {
        Nodo actual = pertenece(x);
        if(actual != null){
            actual.cantidad--;
            if(actual.cantidad == 0){
                Nodo inicio1 = inicio;
                Nodo anterior = null;
                while (inicio1 != null && inicio1.valor != x) {
                    anterior = actual;
                    inicio1 = inicio1.sig;
                }
                if (inicio1 != null) { //Si se encontró el nodo a ser eliminado
                    if (anterior == null) {
                        inicio = inicio1.sig; //El nodo a eliminar es el primero
                    } else {
                        anterior.sig = inicio1.sig; //Eliminamos el nodo del medio o del final
                    }
                    return true; //El nodo se eliminó satisfactoriamente
                }
            }
            return true; //La cantidad se decrementó satisfactoriamente
        }
        return false; //No se encontro el nodo
    }

    @Override
    public Nodo pertenece(int x) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.valor == x) {
                return actual;
            }
            actual = actual.sig;
        }
        return null;
    }
}
