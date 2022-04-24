import ABB.ABB;
import ABB.NodoABB;



public class Main{
public static void main(String[]args){

        NodoABB subIzq=new NodoABB(6,new NodoABB(4,null,null),new NodoABB(9,null,null));
        NodoABB subDer=new NodoABB(18,new NodoABB(15,null,null),new NodoABB(21,null,null));
        NodoABB raiz=new NodoABB(10,subIzq,subDer);

        ABB arbol= new ABB(raiz);


       // AB.printArbol(arbol);
        System.out.println("---------");

       // AB.printArbol(AB.espejo(new AB(raiz)));

       // System.out.println(arbol.Pertenece2Eficiente(213));
       // arbol.Ascendente3();
       // arbol.Descendente3();

        /*System.out.println(arbol.BorrarMinimo());
        System.out.println("-------");
        ABB.printArbol(arbol);*/

       // System.out.println(arbol.CantidadMayores(18));

        for(int i : arbol.MayoresK(15)){
                System.out.println(i);
        }




}
}