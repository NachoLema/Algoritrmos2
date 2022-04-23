public class Main{
public static void main(String[]args){

        NodoAB subIzq=new NodoAB(2,null,null);
        NodoAB subDer=new NodoAB(3,null,null);
        NodoAB raiz=new NodoAB(1,subIzq,subDer);


        AB arbol=new AB(raiz);

        arbol.cantNodos();



}
}