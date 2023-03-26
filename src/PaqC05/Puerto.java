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

    public void apilar(int numHub, Contenedor C){
        for(int k = 0; k < P.length; k++){
            if(numHub == this.P[k].getNumHub()){
                int miprioridad = C.getPrioridad();
                if((miprioridad==1 && P[k].getM(0,0) == null)||(miprioridad==2 && P[k].getM(0,1)==null) || miprioridad==3) {
                    if(miprioridad==1) {
                        //no hay contenido
                        for (int i=9;i>=0;i--) {
                            if (P[k].getM(i,0) == null) {
                                P[k].setM(i,0, C);
                                break;
                            }
                        }
                    }else if(miprioridad==2){
                        //no hay contenido
                        for (int i=9;i>=0;i--) {
                            if (P[k].getM(i,1) == null) {
                                P[k].setM(i,1, C);
                                break;
                            }
                        }
                    }else{
                        for (int i=2;i<=11;i++) {
                            for(int j=9;j>=0;j--) {
                                if (P[k].getM(j,i) == null) {
                                    P[k].setM(j,i, C);
                                    i = 11;
                                    break;
                                }
                            }
                        }
                    }
                }
                if((P[k].getM(0,0) != null) && (P[k].getM(0,1) != null) && (P[k].getM(0,11) != null)){
                    for(int p = 0; p < 3; p++){
                        if(P[p].getNumHub() == numHub){
                            espacio[p] = true;
                        }
                    }
                }
            }
            break;
        }
    }

    public Hub desapilar(int numHub, int columna) {
        for(int k = 0; k < P.length; k++){
            if(numHub == this.P[k].getNumHub()){
                for(int i = 0; i < 10; i++){
                    if(P[k].getM(i, columna) != null){
                        P[k].setM(i, columna, null);
                        espacio[k] = false;
                        return P[k];
                    }
                }
            }
        }
        return null;
    }
}
