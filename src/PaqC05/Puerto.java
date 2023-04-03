package PaqC05;

public class Puerto implements Cloneable{
    private Hub[] P;
    private boolean[] espacio;

    Puerto(){
        P = new Hub [3];
        espacio = new boolean [3];
    }

    public Hub getP(int numHub) {
        return P[numHub];
    }

    public void setP(int posicion, Hub p) {
        P[posicion] = p;
    }

    public boolean getEspacio(int numEspacio) {
        return espacio[numEspacio];
    }
    public void setEspacio(boolean bool, int numEspacio) {
        this.espacio[numEspacio] = bool;
    }

    public boolean apilar(int numHub, Contenedor C){
        for(int k = 0; k < P.length; k++){
            if(numHub == this.P[k].getNumHub()){
                P[k].apilar(C);
                if((P[k].getM(0,0) != null) && (P[k].getM(0,1) != null) && (P[k].getM(0,11) != null)){
                    for(int p = 0; p < 3; p++){
                        if(P[p].getNumHub() == numHub){
                            espacio[p] = true;
                            return true;
                        }
                    }
                }
            }
            break;
        }
        return false;
    }


    public Hub desapilar(int numHub, int columna) {
        Hub eliminado;
        for(int k = 0; k < P.length; k++){
            if(numHub == this.P[k].getNumHub()){
               eliminado=P[k];
               P[k].desapilar(columna);
               espacio[k] = false;
               return eliminado;
            }
        }
        return null;
    }
    public int totalPaisPuerto(String pais){
        int total=0;
        for (int i=0;i<P.length;i++){
            total+=P[i].cont_pais(pais);
        }
        return total;
    }
}
