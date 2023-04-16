package PaqC05;

import java.util.Objects;

public class Hub {
    private Contenedor[][] M;

    public Hub() {
        M = new Contenedor[10][12];
    }

    public Contenedor getM(int i, int j) {
        return M[i][j];
    }

    public void setM(int i, int j, Contenedor c) {
        this.M[i][j] = c;
    }

    public String toString() {
        String cadena = "--PLANO DEL HUB--\n";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (M[i][j] == null) {
                    if (j != 11) {
                        cadena = cadena + "N" + "\t";
                    } else {
                        cadena = cadena + "N" + "\n";
                    }
                } else {
                    if (j != 11) {
                        cadena = cadena + M[i][j].getId() + "\t";
                    } else {
                        cadena = cadena + M[i][j].getId() + "\n";
                    }
                }
            }
        }
        return cadena;
    }
    public boolean apilar(Contenedor C){
        int miprioridad=C.getPrioridad();
        //primera col de prioridad 1, segunda columna prioridad 2, el resto del tres
        if((miprioridad==1 && M[0][0]==null)||(miprioridad==2 && M[0][1]==null) || miprioridad==3) {
            if(miprioridad==1) {
                //no hay contenido
                for (int i=9;i>=0;i--) {
                    if (M[i][0] == null) {
                        M[i][0] = C;
                        return true;
                    }
                }
            }else if(miprioridad==2){
                //no hay contenido
                for (int i=9;i>=0;i--) {
                    if (M[i][1] == null) {
                        M[i][1] = C;
                        return true;
                    }
                }
            }else{
                for (int i=2;i<=11;i++) {
                    for(int j=9;j>=0;j--) {
                        if (M[j][i] == null) {
                            M[j][i] = C;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean desapilar(int columna) {
        for(int i = 0; i < 10; i++){
            if(M[i][columna] != null){
                M[i][columna] = null;
                return true;
            }
        }
        return false;
    }
    public Contenedor mostrarDatos(int numID){
        for(int i=0; i<10; i++){
            for(int j=0; j<12; j++){
                if(M[i][j]!=null){
                    if(M[i][j].getId()==numID){
                        return M[i][j];
                    }
                }
            }
        }
        return null;
    }

    public int cont_pais(String pais){
        int total=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (M[i][j]!=null) {
                    if (Objects.equals(M[i][j].getPais(), pais)) {
                        total = total + 1;
                    }
                }
            }
        }
        return total;
    }
}

