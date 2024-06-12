import Implementacion.*;
public class Main {
    public static void main(String[] args) {
        implementacionConjuntos conjunto = new implementacionConjuntos();

        conjunto.agregar(2);
        conjunto.agregar(5);
        conjunto.agregar(2);
        conjunto.agregar(7);
        conjunto.agregar(2);

        //Retorna true si el 2 pertenece
        //Luego devuelve la cantidad de elementos se encuentran en el conjunto
        System.out.println("El 2 pertenece? ");
        System.out.println(conjunto.pertenece(2) != null);
        System.out.println("Cantidad de 2: ");
        System.out.println(conjunto.cantidad(2));

        //Se le resta uno a 2, debería devolver 2 ya que anteriormente devolvió 3
        System.out.println("Restamos uno a 2");
        conjunto.sacar(2);
        System.out.println("Cantidad de 2: ");
        System.out.println(conjunto.cantidad(2));

        //Se verifica si el 5 pertenece, luego devuelve la cantidad
        System.out.println("El 5 pertenece? ");
        System.out.println(conjunto.pertenece(5) != null);
        System.out.println("Cantidad de 5: ");
        System.out.println(conjunto.cantidad(5));

        //Al ser cantidad == 1, al restarle uno se queda en 0
        //Por lo tanto deja de pertenecer al conjunto (se elimina)
        System.out.println("Restamos uno a 5");
        conjunto.sacar(5);
        System.out.println("Cantidad de 5: ");
        System.out.println(conjunto.cantidad(5));
        System.out.println("Pertenece 5? ");
        //Retorna false porque ya no pertenece (cant == 0)
        System.out.println(conjunto.pertenece(5) != null);
    }
}
