package PaqC05;

public class Hub {
    private Contenedor[][] M;

    Hub() {
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
    public void apilar(Contenedor C){
        int miprioridad=C.getPrioridad();
        int prioridad=0;
        //primera col de prioridad 1, segunda columna prioridad 2, el resto del tres
        if((miprioridad==1 && M[0][0]==null)||(miprioridad==2 && M[0][1]==null) || miprioridad==3) {
            if(miprioridad==1) {
                //no hay contenido
                for (int i=9;i>=0;i--) {
                    if (M[i][0] == null) {
                        M[i][0] = C;
                        break;
                    }
                }
            }else if(miprioridad==2){
                //no hay contenido
                for (int i=9;i>=0;i--) {
                    if (M[i][1] == null) {
                        M[i][1] = C;
                        break;
                    }
                }
            }else{
                for (int i=2;i<=11;i++) {
                    for(int j=9;j>=0;j--) {
                        if (M[j][i] == null) {
                            M[j][i] = C;
                            i = 11;
                            break;
                        }
                    }
                }
            }
        }

    }
    public void desapilar(int columna) {
        for(int i = 0; i < 10; i++){
            if(M[i][columna] != null){
                M[i][columna] = null;
                break;
            }
        }
    }
    public int cont_pais(String pais){
        int total=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (M[i][j]!=null) {
                    if (M[i][j].getPais() == pais) {
                        total = total + 1;
                    }
                }
            }
        }
        return total;
    }
}

