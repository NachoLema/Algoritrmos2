import AB.AB;
import AB.NodoAB;
import ABB.ABB;
import ABB.NodoABB;

public class Main{
public static void main(String[]args){

        NodoABB subIzq=new NodoABB(5,new NodoABB(2,null,null),new NodoABB(8,new NodoABB(7,null,null),new NodoABB(9,null,null)));
        NodoABB subDer=new NodoABB(12,new NodoABB(11,null,null),new NodoABB(14,null,null));
        NodoABB raiz=new NodoABB(10,subIzq,subDer);

        ABB arbol=new ABB(raiz);
        ABB.printArbol(arbol);
        System.out.println("--------------------");

        System.out.println("Numero borrado :  " + arbol.BorrarMinimo());

        ABB.printArbol(arbol);




}
}