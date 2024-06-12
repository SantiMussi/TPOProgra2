package Interfaz;
import Implementacion.*;
public interface interfazSuperC {
        void inicializarSuperConjunto();
        boolean agregar(implementacionSubC x);
        boolean sacar(implementacionSubC x);
        boolean pertenece(implementacionSubC x);
        NodoSuperC complemento(implementacionSubC x);
}
