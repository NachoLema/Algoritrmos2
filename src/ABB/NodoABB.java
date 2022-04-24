package ABB;

public class NodoABB {
    private int Dato;
    private NodoABB izq, der;

    public NodoABB(int dato, NodoABB izq, NodoABB der) {
        Dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public NodoABB(int dato) {
        Dato = dato;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }

    public NodoABB getIzq() {
        return izq;
    }

    public void setIzq(NodoABB izq) {
        this.izq = izq;
    }

    public NodoABB getDer() {
        return der;
    }

    public void setDer(NodoABB der) {
        this.der = der;
    }
}