import AB.AB;
import AB.NodoAB;
import ABB.ABB;
import ABB.NodoABB;



public class Main{
public static void main(String[]args){

        NodoABB subIzq=new NodoABB(6,new NodoABB(4,null,null),new NodoABB(9,null,null));
        NodoABB subDer=new NodoABB(18,new NodoABB(15,null,null),new NodoABB(21,null,null));
        NodoABB raiz=new NodoABB(10,subIzq,subDer);

        ABB arbol= new ABB(raiz);


       // AB.printArbol(arbol);


       // AB.printArbol(AB.espejo(new AB(raiz)));

       // System.out.println(arbol.Pertenece2Eficiente(213));
       // arbol.Ascendente3();
       // arbol.Descendente3();

        /*System.out.println(arbol.BorrarMinimo());
        System.out.println("-------");
        ABB.printArbol(arbol);*/

       // System.out.println(arbol.CantidadMayores(18));


       // System.out.println(arbol.Nivel(0));

       // System.out.println(arbol.AbbPorNivel2());
       // System.out.println(arbol.CantidadEnK(2));
       // System.out.println(arbol.CantidadElementosEnNivel(2));
        //System.out.println(arbol.RetNivelK(21));
       // arbol.ImpK(2);


        NodoAB subIzq1=new NodoAB(6,new NodoAB(4,null,null),new NodoAB(9,null,null));
        NodoAB subDer1=new NodoAB(18,new NodoAB(15,null,null),new NodoAB(21,null,null));
        NodoAB raiz1=new NodoAB(10,subIzq1,subDer1);

        AB arbol2= new AB(raiz1);

       // System.out.println(arbol2.altura());
       // System.out.println(arbol.EnElK(1));
        System.out.println(arbol2.ElementosEntre(8, 18));




}
}