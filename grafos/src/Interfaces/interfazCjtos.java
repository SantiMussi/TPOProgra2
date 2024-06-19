package Interfaces;

import Implementaciones.GrafoDirigido;

public interface interfazCjtos {
    void inicializarConjunto();
    boolean agregar(GrafoDirigido x);
    boolean sacar(GrafoDirigido x);
    boolean pertenece(GrafoDirigido x);
}
