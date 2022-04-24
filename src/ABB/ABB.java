package ABB;

import AB.AB;

import java.util.ArrayList;

public class ABB {
    private NodoABB raiz;


    public ABB(NodoABB raiz) {
        this.raiz = raiz;
    }

    public NodoABB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoABB raiz) {
        this.raiz = raiz;
    }

    public static void printArbol(ABB a) {
        imprimirNodo(a.raiz);
    }

    private static void imprimirNodo(NodoABB nodo) {
        if (nodo != null) {
            System.out.println(nodo.getDato());
            imprimirNodo(nodo.getIzq());
            imprimirNodo(nodo.getDer());
        }

    }

    public void insertar(int e){
        if(raiz == null){
            raiz = new NodoABB(e);
        }else{
            insertarRec(this.raiz,e);
        }

    }

    private void insertarRec(NodoABB n, int e) {

        if(e < n.getDato()){
            if(n.getIzq() == null){
                n.setIzq(new NodoABB(e));
            } else {
                insertarRec(n.getIzq(),e);
            }
        } else {
            if(n.getDer() == null){
                n.setDer(new NodoABB(e));
            } else {
                insertarRec(n.getDer(),e);
            }
        }

    }


    public String Ascendente(){
        return AscendenteAux(raiz, new String(""));
    }

    private String AscendenteAux(NodoABB raiz, String st) {
        if (raiz == null ){
            return st+="";
        } else {


            if(raiz.getIzq() == null)
            {
                return st += String.valueOf(raiz.getDato());
            } else {

                return st += AscendenteAux(raiz.getIzq(), st) + " " + raiz.getDato() + " " + AscendenteAux(raiz.getDer(), st);
            }
        }






    }

    public void Ascendente2 (){
        Ascendente2Aux(raiz);
    }

    private void Ascendente2Aux(NodoABB nodo) {


        if(nodo != null) {
            Ascendente2Aux(nodo.getIzq());
            System.out.println(nodo.getDato()+" ");
            Ascendente2Aux(nodo.getDer());
        }


    }
    public void Descendente(){
        DescendenteAux(raiz);
    }

    private void DescendenteAux(NodoABB n) {

        if(n != null){

            DescendenteAux(n.getDer());
            System.out.println(n.getDato());
            DescendenteAux(n.getIzq());

        }
    }

    public boolean Pertenece(int e){
        return PerteneceAux(this.raiz, e);
    }

    private boolean PerteneceAux(NodoABB raiz, int e) {
        if(raiz != null){
            if(raiz.getDato() == e){
                return true;
            }else {
                return PerteneceAux(raiz.getIzq(),e) || PerteneceAux(raiz.getDer(),e);
            }
        } else {
            return false;
        }






    }

    public boolean Pertenece2(int e){
        return PerteneceAux2(this.raiz, e);
    }

    private boolean PerteneceAux2(NodoABB raiz, int e) {

        if(raiz != null){
            if(raiz.getDato() == e){
                return true;
            }else if(raiz.getDato() > e) {
                return PerteneceAux2(raiz.getIzq(),e);
            }else{
               return   PerteneceAux2(raiz.getDer(),e);

            }
        } else {
            return false;

        }

    }


    public int BorrarMinimo(){

         return BorrarMinimoAux(this.raiz);
    }


    private int BorrarMinimoAux(NodoABB raiz) {

        int aBorrar = Integer.MIN_VALUE;

        if(raiz != null) {

            if (raiz.getIzq().getIzq() != null) {

                return BorrarMinimoAux(raiz.getIzq());

            }else{

                aBorrar = raiz.getIzq().getDato();
                raiz.setIzq(raiz.getIzq().getDer());

                return aBorrar;
            }

        }

        return aBorrar;

    }

    public ArrayList<Integer> devolverValoresMayores(int valor){

        return devolverValoresMayoresAux(valor , raiz , new ArrayList<Integer>());

    }

    private ArrayList<Integer> devolverValoresMayoresAux(int valor , NodoABB nodo , ArrayList<Integer> valores) {

        if(nodo !=null){
            if( nodo.getDato() > valor){
                devolverValoresMayoresAux(valor , nodo.getIzq() , valores);
                devolverValoresMayoresAux(valor , nodo.getDer() , valores);

                valores.add(nodo.getDato());


            }else{

                devolverValoresMayoresAux(valor , nodo.getDer() , valores);


            }


            return valores;





        }
        return null;


    }






    public int evaluarValor(int valor) {
        return evaluarValorAux(raiz , valor , 0);
    }

    public int evaluarValorAux(NodoABB nodo , int valor , int c) {

        if (nodo != null) {
            if(nodo.getDato() > valor){

                c++;
            }
            return evaluarValorAux(nodo.getIzq() , valor , c)
                    + evaluarValorAux(nodo.getDer() , valor , 0);

        }else{

            return c;
        }




    }





    public int retonarNivel(int valor) {
        return retonarNivelAux(raiz , valor , 0);
    }

    public int retonarNivelAux(NodoABB nodo , int valor , int pasada) {

        if(nodo !=null){

            if (nodo.getDato() == valor){

                return pasada;

            }else{
                pasada++;
                int nivelIz = retonarNivelAux(nodo.getIzq(), valor , pasada);
                int nivelDer =retonarNivelAux(nodo.getDer(), valor , pasada);
                return Math.max(nivelDer,nivelIz);
            }



        }
        return -1;



    }

    public void elementosNivel(int nivel) {
        elementoNivelAux(raiz , nivel , 0);
    }

    public  void elementoNivelAux(NodoABB nodo , int nivel , int pasada) {

        if(nodo !=null){

           if(pasada == nivel){

               System.out.println(nodo.getDato());

           }else{
               pasada ++;

               elementoNivelAux(nodo.getIzq() , nivel , pasada);
               elementoNivelAux(nodo.getDer() , nivel , pasada);


           }


        }




    }

    public void elementosPorNivel() {
        elementosPorNivelAux(raiz  , 0);
    }

    public  void elementosPorNivelAux(NodoABB nodo ,int pasada) {

        if (nodo != null) {
            System.out.println("nivel : "+pasada);
            elementosNivel(pasada);
            pasada++;
            elementosPorNivelAux( nodo.getIzq() , pasada);

        }


    }




}
