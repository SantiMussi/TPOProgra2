package Implementacion;

public class NodoSuperC {
    implementacionSubC subConjunto;
    NodoSuperC sig;

    @Override
    public String toString() {
        return subConjunto.toString();
    }

}
