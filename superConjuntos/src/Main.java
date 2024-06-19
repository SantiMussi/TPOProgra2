import Implementacion.*;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        implementacionSubC subConjunto = new implementacionSubC();
        implementacionSubC subConjunto2 = new implementacionSubC();
        implementacionSubC subConjunto3 = new implementacionSubC();
        implementacionSuperC superConjunto = new implementacionSuperC();

        // Agregamos valores a los subconjuntos.
        for (int i = 0; i < 5; i++) {
            int j = rand.nextInt(10);
            System.out.println("Se agregará el elemento " + j + " al subconjunto 1.");
            if (!subConjunto.agregar(j)) {
                System.out.println("Error, el elemento ya existe.");
            }

            j = rand.nextInt(10);
            System.out.println("Se agregará el elemento " + j + " al subconjunto 2.");
            if (!subConjunto2.agregar(j)) {
                System.out.println("Error, el elemento ya existe.");
            }

            j = rand.nextInt(10);
            System.out.println("Se agregará el elemento " + j + " al subconjunto 3.");
            if (!subConjunto3.agregar(j)) {
                System.out.println("Error, el elemento ya existe.");
            }
        }

        // Sacamos unos valores de los subconjuntos.
        for (int i = 0; i < 2; i++) {
            int j = rand.nextInt(10);
            if (subConjunto.pertenece(j)) {
                System.out.println("Se eliminó el elemento " + j + " del subconjunto 1.");
                subConjunto.sacar(j);
            }

            j = rand.nextInt(10);
            if (subConjunto2.pertenece(j)) {
                System.out.println("Se eliminó el elemento " + j + " del subconjunto 2.");
                subConjunto2.sacar(j);
            }

            j = rand.nextInt(10);
            if (subConjunto3.pertenece(j)) {
                System.out.println("Se eliminó el elemento " + j + " del subconjunto 3.");
                subConjunto3.sacar(j);
            }
        }

        // Agregamos los subconjuntos al superconjunto.
        System.out.println("Se añade el subconjunto " + Arrays.toString(subConjunto.elementos()) + " al superconjunto.");
        superConjunto.agregar(subConjunto);

        System.out.println("Se añade el subconjunto " + Arrays.toString(subConjunto2.elementos()) + " al superconjunto.");
        superConjunto.agregar(subConjunto2);

        System.out.println("Se añade el subconjunto " + Arrays.toString(subConjunto3.elementos()) + " al superconjunto.");
        superConjunto.agregar(subConjunto3);

        System.out.println("El superconjunto queda: " + superConjunto.elementosSuperC());

        // Comprobamos que funcione el método Complemento.
        System.out.println("El complemento del subconjunto " + Arrays.toString(subConjunto.elementos()) + " es " + superConjunto.imprimirComplemento(subConjunto));

    }
}
