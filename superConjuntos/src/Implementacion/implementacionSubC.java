package Implementacion;
import Interfaz.*;
import java.util.Arrays;
public class implementacionSubC implements interfazSubC{
    NodoSubC cabeza;

    @Override
    public void inicializarConjunto() {
        cabeza = null;
    }

    @Override
    public boolean agregar(int x) {
        if(!pertenece(x)){
            NodoSubC nuevo = new NodoSubC();
            nuevo.info=x;
            nuevo.sig = cabeza;
            cabeza = nuevo;
            return true;
        }
        return false; //La clave ya se encuentra en el conjunto
    }

    @Override
    public boolean sacar(int x) {
        NodoSubC actual = cabeza;
        // Caso especial para el primer nodo
        if (actual != null && actual.info == x) {
            cabeza = actual.sig;
            return true;
        }
        // Recorre la lista para encontrar el nodo a eliminar
        while (actual != null && actual.sig != null && actual.sig.info != x) {
            actual = actual.sig;
        }

        if (actual != null && actual.sig != null) {
            actual.sig = actual.sig.sig;
            return true; // Nodo eliminado
        }
        return false; // Nodo no encontrado
    }

    @Override
    public boolean pertenece(int x) {
        NodoSubC actual = cabeza;
        while(actual != null){
            if(actual.info == x){
                return true;
            }
            actual = actual.sig;
        }
        return false; //No se encontro el valor
    }
    public int[] elementos(){
        NodoSubC actual= cabeza;
        int inx=0;
        while (actual!=null){
            inx++;
            actual=actual.sig;
        }
        actual=cabeza;
        int[] arr = new int[inx];
        inx=0;
        while(actual!=null){
            arr[inx]=actual.info;
            inx++;
            actual=actual.sig;
        }
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos());
    }
}
