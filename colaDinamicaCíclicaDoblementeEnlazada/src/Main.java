import Implementacion.Implementacion;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Implementacion cola=new Implementacion();
        cola.InicializarCola();
        Random rand=new Random();
        for (int i=0;i<=10;i++){
            int x=rand.nextInt(1,100);
            cola.Acolar(x);
        }
        while (!cola.isEmpty()){
            System.out.println("Primero "+cola.primero());
            System.out.println("Ultimo "+cola.anterior());
            System.out.println("Proximo en desacolar "+cola.siguiente());
            cola.Desacolar();
        }
    }
}
