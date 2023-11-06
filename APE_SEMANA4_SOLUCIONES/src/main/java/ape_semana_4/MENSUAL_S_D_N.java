package ape_semana_4;

import java.util.Scanner;

public class MENSUAL_S_D_N {

    public static void main(String[] args) {
        double vn, vyt, vd, vs, vt, valordescu, ed, vT;
        boolean esVerdadero = true, esFalso = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DE SPOTIFY");
        vs = teclado.nextDouble();
        System.out.println("INGRESE EL VALOR DE YOUTUBE PREMIUM");
        vyt = teclado.nextDouble();
        System.out.println("INGRESE EL VALOR DE DROPBOX");
        vd = teclado.nextDouble();
        System.out.println("INGRESE EL VALOR DE NETFLIX");
        vn = teclado.nextDouble();
        vt = vn + vs + vyt + vd;
        System.out.println("TOTAL A PAGAR: " + vt);
        System.out.println("INGRESE SU EDAD");
        ed = teclado.nextDouble();
        esVerdadero = (ed < 30);
        if (esVerdadero) {
            System.out.println("RECIBE UN DESCUENTO DEL 20%");
            valordescu = (vt * 20) / 100;
            System.out.println("SU DESCUENTO ES: " + valordescu);
            vT = vt - valordescu;
            System.out.println("EL VALOR A PAGAR INCLUIDO EL DESCUENTO ES: " + vT);
        } else {
            System.out.println("UTSED NO RECIVE EL DESCUENTO,NO CUMPLE LOS REQUISITOS, POR LO TANTO SU VALOR ES DE: " + vt);

        }

    }

}
