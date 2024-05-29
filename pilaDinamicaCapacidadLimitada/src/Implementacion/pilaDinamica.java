package Implementacion;

public class pilaDinamica implements Interface.PilaDinamica{
    private Nodo primero;
    private int indice;
    private int max;

    public pilaDinamica(int max) {
        this.primero = null;
        this.indice = 0;
        this.max = max;
    }

    @Override
    public void inicializarPila(int max) {
        this.primero = null;
        this.indice = 0;
        this.max = max;
    }

    @Override
    public boolean apilar(int x) {
        if(indice < max){
            Nodo nuevo = new Nodo();
            nuevo.valor = x;
            nuevo.sig = primero;
            primero = nuevo;
            indice++;
            return true;
        }
        return false;
    }

    @Override
    public boolean desapilar() {
        if(!pilaVacia()){
            primero = primero.sig;
            indice--;
            return true;
        }
        return false;
    }

    @Override
    public int tope() {
        if(!pilaVacia()) {
            return primero.valor;
        }
        return -1;
    }

    @Override
    public boolean pilaVacia() {
        return primero == null;
    }
}
