package Implementacion;

import Interfaz.Cola_dinamica_dE;

public class Implementacion implements Cola_dinamica_dE {

    Nodo_doblemente_enlazado primero;
    Nodo_doblemente_enlazado ultimo;

    public Implementacion(){
        primero=null;
        ultimo=null;
    }

    @Override
    public void InicializarCola() {
        primero=null;
        ultimo=null;
    }

    @Override
    public void Acolar(int x) {
        Nodo_doblemente_enlazado nuevo = new Nodo_doblemente_enlazado();
        nuevo.info = x;
        if (isEmpty()) {
            // Si la cola está vacía, asignamos nuevo a primero y ultimo
            nuevo.sig = nuevo;
            nuevo.anterior = nuevo;
            primero = nuevo;
            ultimo = nuevo;
        } else {
            // Si la cola no está vacía, el nuevo nodo se coloca al final de la cola,
            // actualizando las referencias del último nodo y del primero.
            nuevo.sig = primero;
            nuevo.anterior = ultimo;
            ultimo.sig = nuevo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }

    @Override
    public boolean Desacolar() {
        if (!isEmpty()) {
            // Si la cola no está vacía y contiene más de un elemento,
            // el primer nodo se desplaza al siguiente en la cola
            if (primero.sig != primero) {
                primero = primero.sig;
                primero.anterior = ultimo;
                ultimo.sig = primero;
            } else {
                //Si solo tiene un elemento, se vacía
                primero = null;
                ultimo = null;
            }
            return true;
        }
        return false;
    }

    @Override
    public int primero() {
        if(!isEmpty()) {
            return primero.info;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {return primero==null;}

    @Override
    public int siguiente() {
        if (!isEmpty()) {
            return primero.sig.info;
        }
        return -1;
    }

    @Override
    public int anterior() {
        if (!isEmpty()) {
            return ultimo.info;
        }
        return -1;
    }

}
