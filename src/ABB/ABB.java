package ABB;

public class ABB {
    private NodoAB raiz;

    public NodoAB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAB raiz) {
        this.raiz = raiz;
    }

    public void insertar(int e){
        if(raiz == null){
            raiz = new NodoAB(e);
        }else{
            insertarRec(this.raiz,e);
        }

    }

    private void insertarRec(NodoAB n, int e) {

        if(e < n.getDato()){
            if(n.getIzq() == null){
                n.setIzq(new NodoAB(e));
            } else {
                insertarRec(n.getIzq(),e);
            }
        } else {
            if(n.getDer() == null){
                n.setDer(new NodoAB(e));
            } else {
                insertarRec(n.getDer(),e);
            }
        }

    }

    public String Ascendente(){
        return AscendenteAux(raiz, new String(""));
    }

    private String AscendenteAux(NodoAB raiz, String st) {
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

    private void Ascendente2Aux(NodoAB nodo) {


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

    private void DescendenteAux(NodoAB n) {

        if(n != null){

            DescendenteAux(n.getDer());
            System.out.println(n.getDato());
            DescendenteAux(n.getIzq());

        }
    }

    public boolean Pertenece(int e){
        return PerteneceAux(this.raiz, e);
    }

    private boolean PerteneceAux(NodoAB raiz, int e) {
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
}
