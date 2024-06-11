# TPOProgra2
### public class Men{}
#### Integrantes: 
- Matías Masucci
- Nicolás Szafranko
- Santiago Mussi
- Nicolás Sciaraffia
- Joaquín Gallea

## Índice
1. [Pila dinámica con capacidad limitada](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#pila-din%C3%A1mica-con-capacidad-limitada)
2. [Superconjunto](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#superconjunto)
3. [Cola dinámica cíclica doblemente enlazada](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#cola-din%C3%A1mica-c%C3%ADclica-doblemente-enlazada)
4. [Conjunto con repetidos](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#conjunto-con-repetidos)
5. [Grafo aleatorio](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#grafo-aleatorio)
6. [Grafos](https://github.com/SantiMussi/TPOProgra2?tab=readme-ov-file#grafos)

# 1. Modificación a los TDAs

## A. Pila dinámica con capacidad limitada

Se realiza una pila dinámica normal la cual se le ingresa mediante un método constructor la capacidad máxima, los métodos a utilizar en la interfaz serán los mismos que la pila dinámica.

- Al momento de apilar, se verificará si la pila ya ha alcanzado su índice máximo o si aún tiene espacio.
- Errores a manejar:
  - Intento de apilar un entero negativo.
  - Intento de apilar en una pila llena.
  - Intento de desapilar en una pila vacía.
  - Intento de encontrar el tope en una pila vacía.

>[!CAUTION]
> Se trabajará únicamente con enteros positivos.

## B. Superconjunto

Es un conjunto que tiene subconjuntos, se utilizarán las operaciones del conjunto normal y contará además con un método el cual reciba una instancia del Set y devuelva true si es subconjunto.
Además contará con un método que permita calcular el complemento de un conjunto ingresado por parámetro.
>[!WARNING]
> No se puede calcular un complemento de un conjunto que no es subconjunto del superconjunto.

## C. Cola dinámica cíclica doblemente enlazada

Cola que guarda el valor del anterior y el siguiente, el primero y el último también se encuentran conectados entre sí. Es lo mismo que una cola dinámica pero el Nodo en vez de tener únicamente el siguiente, también guarda la referencia del Nodo anterior.
> [!CAUTION]
> Se agregará a la interfaz un método que devolverá el siguiente al elemento primero (último) y otro que devuelva el anterior.

## D. Conjunto con repetidos

Se realizará una implementación dinámica de conjuntos, el nodo tendrá el valor del elemento y la cantidad, además se referirá al nodo siguiente.
> La cantidad se incrementará cada vez que se agregue el valor.
> Para decrementar la cantidad se utilizará el método sacar(int x), en caso de que la cantidad llegue a 0, se eliminará el Nodo.

>[!WARNING]
> Debe existir el elemento para que se pueda eliminar.

## E. Grafo aleatorio

En lugar de utilizar simplemente una lista de adyacencia que contenga enteros, se utilizará una lista de adyacencia que contiene objetos que representan aristas con probabilidades.
- La clase Grafo contendrá metodos para añadir aristas y recorrer el grafo en preorden y postorden. 
- La clase interna Arista representará una arista en el grafo con un destino y una probabilidad.
- Con los métodos de preorden y postorden se podrá explorar el grafo a partir de un vértice dado.
>[!WARNING]
> El método para agregar una arista deberá aceptar una probabilidad y crear una nueva arista con esa probabilidad.
> - Parámetros para agregar una arista: destino, probabilidad 

# 2. Grafos

Se realizará un método que espera recibir un objeto tipo grafo dirigido como parámetro.
- Dentro de ese método se verificará mediante un algoritmo de búsqueda en profundidad (DFS) para ver si el grafo es fuertemente conexo, de ser verdadero, se agregará a un conjunto de grafos dirigidos fuertemente conexo previamente creado.
> [!CAUTION]
> En caso de recibir un grafo no dirigido, el concepto de fuertemente conexo no aplica, por lo tanto, no se agregará al conjunto de grafos dirigidos fuertemente conexos.
