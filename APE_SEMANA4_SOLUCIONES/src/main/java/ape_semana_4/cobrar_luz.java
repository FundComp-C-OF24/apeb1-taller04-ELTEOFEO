package ape_semana_4;

import java.util.Scanner;

public class cobrar_luz {
    public static void main(String[] args) {
        double cl, lc, dsc, añ, vt, vT;
        boolean esv=true, esf=false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL VALOR DE LA LUZ EN KILOVALTIOS/HORA:");
        cl = teclado.nextDouble();
     System.out.println("CUANTO DE LUZ A CONSUMIDO EN EL MES, INGRESE EN KILOVALTIOS:");
        lc = teclado.nextDouble();
        vt=cl*lc;
        System.out.println("INFRESE SU EDAD: ");
            añ = teclado.nextDouble();
            esv= (añ>65);
            esf=(añ<65);
            if (esv) {
    System.out.println("USTED RECIVE UN DESCUENTO DEL 10%");
    dsc = (vt*10)/100;
    vT=vt-dsc;
                System.out.println("EL TOTAL A PAGAR ES: "+vT);
    
  } else {
    System.out.println("EL TOTAL A PAGAR ES: "+vt);
  }

    }

}
