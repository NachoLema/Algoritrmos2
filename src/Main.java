import AB.AB;
import AB.NodoAB;
import ABB.ABB;
import ABB.NodoABB;

public class Main{
public static void main(String[]args){

        NodoABB subIzq=new NodoABB(6,new NodoABB(4,null,null),new NodoABB(9,null,null));
        NodoABB subDer=new NodoABB(18,new NodoABB(15,null,null),new NodoABB(21,null,null));
        NodoABB raiz=new NodoABB(10,subIzq,subDer);

        ABB arbol=new ABB(raiz);

        System.out.println(arbol.Pertenece2(15));
        System.out.println("-------------------------");
        System.out.println(arbol.Pertenece(15));



}
}