package ABB;

import AB.AB;

import java.util.ArrayList;
import java.util.List;

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






       /* if(raiz.getIzq() == null && raiz.getDer() == null){
            System.out.println(raiz.getDato());
        } else if(raiz.getIzq() != null && raiz.getDer() == null) {
                AscendenteAux(raiz.getIzq());
            System.out.println(raiz.getIzq().getDato());
        } else if (raiz.getDer() != null && raiz.getIzq() == null) {
                AscendenteAux(raiz.getDer());
            System.out.println(raiz.getDer().getDato());
        } else {
            AscendenteAux(raiz.getIzq());
            AscendenteAux(raiz.getDer());
            System.out.println(raiz.getIzq().getDato());
            System.out.println(raiz.getDato());

            System.out.println(raiz.getDer().getDato());
        }*/





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


        /*if(nodo != null) {

            if(nodo.getIzq() != null){
                Ascendente2Aux(nodo.getIzq());
                System.out.println(nodo.getIzq().getDato());
            }

           System.out.println(nodo.getDato());


            if(nodo.getDer() != null){
                Ascendente2Aux(nodo.getDer());
                System.out.println(nodo.getDer().getDato());
            }

        }*/

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

    public boolean Pertenece2Eficiente(int k){
        return PerteneceAux2(this.raiz, k);
    }

    private boolean PerteneceAux2(NodoABB raiz, int k) {

        if(raiz == null ) {
            return  false;
        } else{
            if(raiz.getDato() == k){
                return true;
            } else if(k < raiz.getDato()){
              return  PerteneceAux2(raiz.getIzq(),k) ;
            } else{
              return  PerteneceAux2(raiz.getDer(),k);
            }
        }

    }

    public void Ascendente3(){
        Ascendente3Aux(this.raiz);
    }

    private void Ascendente3Aux(NodoABB raiz) {

        if(raiz != null){
            Ascendente3Aux(raiz.getIzq());
            System.out.println(raiz.getDato());
            Ascendente3Aux(raiz.getDer());
        }
    }

    public void Descendente3(){
        Descendente3Aux(this.raiz);
    }

    private void Descendente3Aux(NodoABB raiz) {

        if(raiz != null){
            Descendente3Aux(raiz.getDer());
            System.out.println(raiz.getDato());
            Descendente3Aux(raiz.getIzq());
        }
    }

    public int BorrarMinimo(){
        if(this.raiz.getIzq() == null){
            this.raiz = raiz.getDer();
            return raiz.getDato();
        } else {
          return  BorrarMinimoAux(this.raiz.getIzq());
        }
    }

    private int BorrarMinimoAux(NodoABB raiz) {

        int min;
            if(raiz.getIzq().getIzq() == null){
                min = raiz.getIzq().getDato();
                raiz.setIzq(raiz.getIzq().getDer());

                return min;
            } else {
                return BorrarMinimoAux(raiz.getIzq());
            }






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

    public int CantidadMayores(int k){
        return CantidadMayoresAux(this.raiz,k);
    }

    private int CantidadMayoresAux(NodoABB raiz, int k) {

        if(raiz != null){
            if(k < raiz.getDato()){
                return 1 + CantidadMayoresAux(raiz.getIzq(),k) +
                        CantidadMayoresAux(raiz.getDer(),k);
            } else {
                return CantidadMayoresAux(raiz.getIzq(),k) +
                        CantidadMayoresAux(raiz.getDer(),k);
            }


        } else {
            return 0;
        }



    }

     /* Desarrolle un algoritmo que retorne una lista con sus elementos ordenados de forma
        ascendente.*/

    public List<Integer> Ordenados(){
        return OrdenadosRec(this.raiz, new ArrayList<Integer>());
    }


    private List<Integer> OrdenadosRec(NodoABB raiz, ArrayList<Integer> l) {

        if(raiz != null){

            OrdenadosRec(raiz.getIzq(),l);
            l.add(raiz.getDato());
            OrdenadosRec(raiz.getDer(),l);
            return l;

        } else {
            return null;
        }
    }

    /*Desarrolle un algoritmo que, recibiendo un valor entero k, retorne una lista con los elementos
    que son mayores a k.*/
    public List<Integer> MayoresK(int k){
        return MayoresKAux(this.raiz,k, new ArrayList<Integer>());
    }

    private List<Integer> MayoresKAux(NodoABB raiz, int k, List<Integer> l) {

        if(raiz != null){
            if(raiz.getDato() > k){
                MayoresKAux(raiz.getIzq(),k,l);
                MayoresKAux(raiz.getDer(),k,l);
                l.add(raiz.getDato());
            } else {
                MayoresKAux(raiz.getDer(),k,l);
            }
            return l;
        } else{
            return null;
        }
    }
/*
    Desarrolle un algoritmo que, recibiendo un valor entero, retorne el nivel en que se encuentra
    dicho valor o -1 si no se encuentra.*/

    public int Nivel (int k){
        return NivelRec(this.raiz, k, 0);
    }

    private int NivelRec(NodoABB raiz, int k, int lvl) {

        if(raiz != null){
            if(raiz.getDato() != k){

                lvl ++;
                return Math.max(NivelRec(raiz.getIzq(),k, lvl),
                        NivelRec(raiz.getDer(),k, lvl)  );

            } else {
              return lvl;
            }

        } else {
            return -1;
        }
    }

    /*Desarrolle un algoritmo que, recibiendo un valor entero k, imprima los elementos del nivel k.*/

     public void ElementosEnK(int k){
         ElementosEnKRec(this.raiz,k, 0);
     }

    private void ElementosEnKRec(NodoABB raiz, int k, int paso) {
         if(raiz != null){

             if(paso == k){
                 System.out.print(raiz.getDato() + " ");
             } else {
                 paso++;
                 ElementosEnKRec(raiz.getIzq(),k,paso);
                 ElementosEnKRec(raiz.getDer(),k,paso);
             }
         }
    }

    /*Desarrolle un algoritmo que imprima el ABB en orden por niveles.*/

    public void AbbPorNivel(){
        AbbPorNivelAux(this.raiz,0);
    }

    private void AbbPorNivelAux(NodoABB raiz, int paso) {

        if(raiz != null){

           ElementosEnK(paso);
            System.out.println();
            AbbPorNivelAux(raiz.getIzq(),++paso);


        }
    }

    /*Desarrolle un algoritmo que retorne una lista de tuplas con todos los elementos del ABB y el
    número del nivel en el que se encuentra cada uno.*/

    public List<String> AbbPorNivel2(){
       return AbbPorNivelAux(this.raiz,0, new ArrayList<String>());
    }

    private List<String> AbbPorNivelAux(NodoABB raiz, int paso, ArrayList<String> l) {

        if(raiz != null){

            String add = "Nivel: "+ paso + " Valores: "+raiz.getDato();

            paso ++;
            AbbPorNivelAux(raiz.getIzq(), paso, l);
            AbbPorNivelAux(raiz.getDer(), paso, l);
            l.add(add);



        }
        return l;
        }

    /*Desarrolle un algoritmo que, recibiendo un valor entero k, imprima la cantidad de elementos del
    nivel k.*/
    
    
    public int CantidadElementosEnNivel(int k){
       return CantidadElementosEnNivelRec(this.raiz,k);
    }

    private int CantidadElementosEnNivelRec(NodoABB raiz, int k) {
        if(raiz != null){
            if(k != 0){
                k --;
                return CantidadElementosEnNivelRec(raiz.getIzq(),k) +
                        CantidadElementosEnNivelRec(raiz.getDer(),k);
            } else {
               return 1;
            }
        }
        return 0;
    }


    public int CantidadEnK(int k){
        return CantidadEnKRec(this.raiz, k, 0);
    }

    private int CantidadEnKRec(NodoABB raiz, int k, int paso) {

        if(raiz != null){

            if(k == paso){
             return 1;
            } else {
                paso ++;
                return CantidadEnKRec(raiz.getIzq(),k,paso)+
                        CantidadEnKRec(raiz.getDer(),k,paso)   ;

            }

        } else {
            return 0;
        }


    }


}



