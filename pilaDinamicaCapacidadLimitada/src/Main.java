import Implementacion.pilaDinamica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la capacidad máxima de la pila: ");
        int max = scan.nextInt();
        int resp = 0;
        pilaDinamica pila = new pilaDinamica(max);

        while(resp != 6) {
            System.out.println("\n-----OPCIONES-----"
            + "\n 1. Inicializar la pila nuevamente con una nueva capacidad máxima."
            + "\n 2. Apilar un elemento."
            + "\n 3. Desapilar el último elemento de la pila."
            + "\n 4. Tope de la pila."
            + "\n 5. ¿Pila vacía?"
            + "\n 6. Salir.");
            System.out.print("Ingrese la opción: ");
            resp = scan.nextInt();

            if(resp == 1) {
                System.out.print("Ingrese la nueva capacidad máxima: ");
                max = scan.nextInt();
                pila.inicializarPila(max);
                System.out.println("Pila inicializada");
            }
            if(resp == 2) {
                System.out.print("Ingrese el elemento a apilar: ");
                int elemento = scan.nextInt();
                while(elemento < 0){
                    System.out.println("Error, el elemento no puede ser negativo.");
                    System.out.print("Ingrese el elemento a apilar: ");
                    elemento = scan.nextInt();
                }
                boolean i = pila.apilar(elemento);
                if (i == false) {
                    System.out.println("Error, la pila está llena.");
                } else{
                    System.out.println("Se apiló el elemento: " + elemento + ".");
                }
            }
            if(resp == 3){
                int elemento = pila.tope();
                boolean i = pila.desapilar();
                if(i == false){
                    System.out.println("Error, no se pudo desapilar el elemento, la pila está vacía.");
                } else{
                    System.out.println("Se desapiló el elemento: " + elemento + ".");
                }
            }
            if(resp == 4) {
                if (pila.tope() == -1) {
                    System.out.println("Error, la pila está vacía.");
                } else {
                    System.out.println("Tope de la pila: " + pila.tope() + ".");
                }
            }
            if(resp == 5){
                if(pila.pilaVacia()){
                    System.out.println("La pila se encuentra vacía.");
                } else{
                    System.out.println("La pila no está vacía.");
                }
            }
        }
        scan.close();
    }
}
