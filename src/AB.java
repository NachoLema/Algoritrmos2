public class AB {
    private NodoAB raiz;

    public AB(NodoAB raiz) {
        this.raiz = raiz;
    }

    public int cantNodos() {
        return this.cantNodosAux(this.raiz);
    }

    private int cantNodosAux(NodoAB nodo) {
        return nodo == null ? 0 : 1 + this.cantNodosAux(nodo.getIzq()) + this.cantNodosAux(nodo.getDer());
    }

    public int cantHojas() {
        return this.cantHojasAux(this.raiz);
    }

    private int cantHojasAux(NodoAB raiz) {
        if (raiz != null) {
            if (raiz.getDer() == null && raiz.getIzq() == null) {
                return 1;
            } else {
                int subAizq = this.cantHojasAux(raiz.getIzq());
                int subAder = this.cantHojasAux(raiz.getDer());
                return subAder + subAizq;
            }
        } else {
            return 0;
        }
    }

    public int altura() {
        return this.alturaAux(this.raiz);
    }

    private int alturaAux(NodoAB raiz) {
        if (raiz == null) {
            return -1;
        } else {
            return raiz.getDer() == null && raiz.getIzq() == null ? 0 : 1 + Math.max(this.alturaAux(raiz.getIzq()), this.alturaAux(raiz.getDer()));
        }
    }

    public boolean todosPares() {
        return this.todosParesAux(this.raiz);
    }

    private boolean todosParesAux(NodoAB raiz) {
        if (raiz != null) {
            if (raiz.getDato() % 2 != 0) {
                return false;
            } else {
                return this.todosParesAux(raiz.getIzq()) && this.todosParesAux(raiz.getDer());
            }
        } else {
            return true;
        }
    }

    public static boolean equilibrado(AB a) {
        if (a.altura() <= 1) {
            return true;
        } else {
            int altSubIzq = (new AB(a.raiz.getIzq())).altura();
            int altSubDer = (new AB(a.raiz.getDer())).altura();
            if (Math.abs(altSubIzq - altSubDer) > 1) {
                return false;
            } else {
                return equilibrado(new AB(a.raiz.getIzq())) && equilibrado(new AB(a.raiz.getDer()));
            }
        }
    }




    public static boolean equilibrado2(AB arb) {
        if (arb == null) {
            return true;
        } else if (arb.altura() <= 1) {
            return true;
        } else if ((new AB(arb.raiz.getIzq())).altura() - (new AB(arb.raiz.getDer())).altura() > 1) {
            return false;
        } else {
            return equilibrado2(new AB(arb.raiz.getIzq())) && equilibrado2(new AB(arb.raiz.getDer()));
        }
    }

    public static boolean equilibrado3(AB a) {
        return equilibradoRec(a.raiz);
    }

    private static boolean equilibradoRec(NodoAB raiz) {
        if (raiz.getDer() == null && raiz.getIzq() == null) {
            return true;
        } else {
            return equilibradoRec(raiz.getIzq()) && equilibradoRec(raiz.getDer());
        }
    }

    public static boolean sonIguales(AB a1, AB a2) {
        return sonIgualesAux(a1.raiz, a2.raiz);
    }

    private static boolean sonIgualesAux(NodoAB n1, NodoAB n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 != null && n2 != null) {
            return n1.getDato() == n2.getDato() && sonIgualesAux(n1.getIzq(), n2.getIzq()) && sonIgualesAux(n1.getDer(), n2.getDer());
        } else {
            return false;
        }
    }

    public static AB clon(AB a) {
        return new AB(clonAux(a.raiz));
    }

    private static NodoAB clonAux(NodoAB nodo) {
        NodoAB head = null;
        if (nodo != null) {
            head = new NodoAB(nodo.getDato(), clonAux(nodo.getIzq()), clonAux(nodo.getDer()));
        }

        return head;
    }

    public static void printArbol(AB a) {
        imprimirNodo(a.raiz);
    }

    private static void imprimirNodo(NodoAB nodo) {
        if (nodo != null) {
            System.out.println(nodo.getDato());
            imprimirNodo(nodo.getIzq());
            imprimirNodo(nodo.getDer());
        }

    }

    public static AB clon2(AB a) {
        return new AB(clonAux2(a.raiz));
    }

    private static NodoAB clonAux2(NodoAB raiz) {
        return raiz != null ? new NodoAB(raiz.getDato(), clonAux2(raiz.getIzq()), clonAux2(raiz.getDer())) : null;
    }
}
