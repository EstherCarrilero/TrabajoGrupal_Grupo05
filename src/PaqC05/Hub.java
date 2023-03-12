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
}
