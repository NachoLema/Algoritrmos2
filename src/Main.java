public class Main{
public static void main(String[]args){

        NodoAB subIzq=new NodoAB(2,null,null);
        NodoAB subDer=new NodoAB(3,null,null);
        NodoAB raiz=new NodoAB(1,subIzq,subDer);


        AB arbol=new AB(raiz);


        NodoAB subIzq1 = new NodoAB(6, new NodoAB(4, null,null), new NodoAB(9,null,null) );
        NodoAB subDer2 = new NodoAB(18, new NodoAB(15,null,null), new NodoAB(21,null,null));
        NodoAB raiz1 = new NodoAB(10, subIzq1, subDer2);

        AB.printArbol(new AB(raiz1));
        System.out.println("---------");

        AB.printArbol(AB.espejo(new AB(raiz1)));



}
}