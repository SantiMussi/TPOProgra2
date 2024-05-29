# TPOProgra2

## Pila dinámica con capacidad limitada

- Se realiza una pila dinámica normal la cual se le ingresa mediante un método constructor la capacidad máxima,
los métodos a utilizar en la interfaz serán los mismos que la pila dinámica.

- Al momento de apilar, se verificará si la pila ya ha alcanzado su índice máximo o si aún tiene espacio.
- Se trabajará únicamente con enteros positivos.
- Errores a manejar:
    - Intento de apilar un entero negativo.
    - Intento de apilar en una pila llena.
    - Intento de desapilar en una pila vacía.
    - Intento de encontrar el tope en una pila vacía
  
Interfaz:
```
public interface PilaDinamica {
    void inicializarPila(int max);
    boolean apilar(int x);
    boolean desapilar();
    int tope();
    boolean pilaVacia();
}
```

## Superconjunto



