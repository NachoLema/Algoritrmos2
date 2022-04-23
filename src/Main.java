import AB.AB;
import AB.NodoAB;

public class Main{
public static void main(String[]args){

        NodoAB subIzq=new NodoAB(6,new NodoAB(4,null,null),new NodoAB(9,null,null));
        NodoAB subDer=new NodoAB(18,new NodoAB(15,null,null),new NodoAB(21,null,null));
        NodoAB raiz=new NodoAB(10,subIzq,subDer);

        AB arbol=new AB(raiz);


        AB.printArbol(arbol);
        System.out.println("---------");

        AB.printArbol(AB.espejo(new AB(raiz)));




}
}