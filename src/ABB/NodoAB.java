package ABB;

public class NodoAB {
    private int Dato;
    private NodoAB izq, der;


    public NodoAB(int dato) {
        Dato = dato;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }

    public NodoAB getIzq() {
        return izq;
    }

    public void setIzq(NodoAB izq) {
        this.izq = izq;
    }

    public NodoAB getDer() {
        return der;
    }

    public void setDer(NodoAB der) {
        this.der = der;
    }
}
