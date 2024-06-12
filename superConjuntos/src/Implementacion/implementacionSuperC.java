package Implementacion;
import Interfaz.*;

import java.util.Arrays;

public class implementacionSuperC implements interfazSuperC{

    NodoSuperC primero;
    NodoSuperC copia;

    @Override
    public void inicializarSuperConjunto() {primero=null;}

    @Override
    public boolean agregar(implementacionSubC x) {
        if(!pertenece(x)){
            NodoSuperC nuevo = new NodoSuperC();
            nuevo.subConjunto = x;
            nuevo.sig = primero;
            primero = nuevo;
            return true; //Se agregó el conjunto
        }
        return false; //No se pudo agregar el conjunto
    }

    @Override
    public boolean sacar(implementacionSubC x) {
        if(pertenece(x)){
            NodoSuperC actual = primero;
            if(actual != null && actual.subConjunto == x){
                primero = actual.sig;
                return true;
            }
            while(actual!= null && actual.sig != null && actual.sig.subConjunto != x){
                actual = actual.sig;
            }

            if(actual != null && actual.sig != null){
                actual.sig = actual.sig.sig;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean pertenece(implementacionSubC x) {
        NodoSuperC actual = primero;
        while(actual != null){
            if(actual.subConjunto == x){
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }

    @Override
    public NodoSuperC complemento(implementacionSubC x) {
        copia = null;
        NodoSuperC actual=primero;
        while(actual != null){
            if(actual.subConjunto != x){
                agregarCopia(actual.subConjunto);
            }
            actual = actual.sig;
        }
        return copia;
    }

    private boolean agregarCopia(implementacionSubC x) {
        if(!pertenece(x)){
            NodoSuperC nuevo = new NodoSuperC();
            nuevo.subConjunto = x;
            nuevo.sig = copia;
            copia = nuevo;
            return true; //Se agregó el conjunto
        }
        return false; //No se pudo agregar el conjunto
    }

    public String elementosSuperC(){
        NodoSuperC actual=primero;
        int inx=0;
        while(actual!=null){
            inx++;
            actual=actual.sig;
        }
        int[][] arr= new int[inx][];
        actual=primero;
       for(int i=0;i<inx;i++){
            arr[i]= actual.subConjunto.elementos();
            actual=actual.sig;
       }
       return Arrays.deepToString(arr);
    }
}
