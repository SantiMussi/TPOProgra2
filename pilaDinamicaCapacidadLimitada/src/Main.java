import Implementacion.pilaDinamica;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        int max = 5;
        pilaDinamica pila = new pilaDinamica(max);

        //Añadimos elementos hasta que supere el límite de la pila.
        for (int i=0; i<6; i++) {
            int j = rand.nextInt(1, 100);
            System.out.println("Elemento a apilar: " + j + ".");
            boolean k = pila.apilar(j);
            if (!k) {
                System.out.println("Error, no se pudo apilar el elemento ya que supera la capacidad máxima.");
            }
            System.out.println("Tope: " + pila.tope() + ".");
            if (pila.pilaVacia()) {
                System.out.println("La pila está vacía.");
            } else {
                System.out.println("La pila no está vacía.");
            }
        }

        //Desapilamos un par de elementos para corroborar de que funcina el índice.
        for (int i=0; i<2; i++){
            int j = pila.tope();
            if (j != -1){
                System.out.println("Elemento a desapilar: " + j + ".");
            }
            pila.desapilar();
            if(pila.pilaVacia()){
                System.out.println("La pila está vacía.");
            }
            else{
                System.out.println("Tope: " + pila.tope() + ".");
                System.out.println("La pila no está vacía.");
            }
        }

        //Apilamos nuevamente para corroborar que funciona el límite de la pila.
        for (int i=0; i<3; i++){
            int j = rand.nextInt(1, 100);
            System.out.println("Elemento a apilar: " + j + ".");
            boolean k = pila.apilar(j);
            if (!k){
                System.out.println("Error, no se pudo apilar el elemento ya que supera la capacidad máxima.");
            }
            if(pila.pilaVacia()) {
                System.out.println("La pila está vacía.");
            }
            else{
                System.out.println("Tope: " + pila.tope() + ".");
                System.out.println("La pila no está vacía.");
            }
        }

        //Desapilamos hasta vaciar la pila para corroborar que funciona el método pilaVacia
        for (int i=0; i<6; i++){
            int j = pila.tope();
            if (j != -1){
                System.out.println("Elemento a desapilar: " + j + ".");
            }
            boolean k = pila.desapilar();
            if(k){
                if(pila.pilaVacia()){
                    System.out.println("La pila está vacía.");
                }
                else{
                    System.out.println("Tope: " + pila.tope() + ".");
                    System.out.println("La pila no está vacía.");
                }
            }
            else{
                System.out.println("Error, no se pudo desapilar ya que la pila ya está vacía.");
            }
        }
    }
}
