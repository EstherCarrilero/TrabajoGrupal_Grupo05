package PaqC05;

public class Puerto{
    private Hub[] P;
    private boolean[] espacio;

    Puerto(){
        P = new Hub [3];
        espacio = new boolean [3];
        P[0] = new Hub();
        P[1] = new Hub();
        P[2] = new Hub();
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

    public int apilar(Contenedor C){
        for(int k = 0; k < P.length; k++){
            boolean resultado = P[k].apilar(C);
            if(resultado) {
                if ((P[k].getM(0, 0) != null) && (P[k].getM(0, 1) != null) && (P[k].getM(0, 11) != null)) {
                    espacio[k] = true;
                }
                return k;
            }
        }
        return -1;
    }

    public int desapilar(int columna) {
        for(int k = 0; k < P.length; k++){
            boolean resultado = P[k].desapilar(columna);
            if(resultado){
                espacio[k] = false;
                return k;
            }
        }
        return -1;
    }

    public int totalPaisPuerto(String pais){
        int total=0;
        for (int i=0;i<P.length;i++){
            total+=P[i].cont_pais(pais);
        }
        return total;
    }

    public Contenedor mostrarDatos_puerto(int numID){
        for(int i=0; i<3; i++){
            Contenedor datos = P[i].mostrarDatos(numID);
            if(datos != null){
                return datos;
            }
        }
        return null;
    }
}