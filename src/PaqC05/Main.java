package PaqC05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hub hub1 = new Hub();
        Contenedor[] cont = new Contenedor[15];
        Contenedor[] cont2 = new Contenedor[3];
        Contenedor[] cont3 = new Contenedor[15];

        for (int i = 0; i < 15; i++) {
            cont[i] = new Contenedor(1 + i, i + 100, "US", true, 1, "Contenedor Aliexpress", "Aliexpress send", "correos expres");
            cont3[i] = new Contenedor(3 + i, i + 100, "US", true, 3, "Contenedor Aliexpress", "Aliexpress send", "correos expres");
            hub1.apilar(cont[i]);
            hub1.apilar(cont3[i]);
        }

        for (int i = 0; i < 3; i++) {
            cont2[i] = new Contenedor(2 + i, i + 100, "US", true, 2, "Contenedor Aliexpress", "Aliexpress send", "correos expres");
            hub1.apilar(cont2[i]);

        }

        System.out.println(hub1.toString());
        //hub1.desapilar(2);
        //System.out.println(hub1.toString());
        System.out.println("Introduce el id del contenedor que desees");
        int numID = sc.nextInt();
        System.out.println(hub1.mostrarDatos(numID));

    }
}
