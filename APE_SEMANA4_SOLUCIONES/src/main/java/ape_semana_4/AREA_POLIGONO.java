package ape_semana_4;

import java.util.Scanner;

public class AREA_POLIGONO {

    public static void main(String[] args) {
        double lc, hr, at;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL LADO DEL CUADRADO");
        lc = teclado.nextDouble();
        System.out.println("INGRESE LA ALTURA DEL RECTANGULO");
        hr = teclado.nextDouble();
        at = (lc * lc) + ((lc * hr) / 2) * 5;
        System.out.println("ESTA ES SU AREA: " + at);

    }

}
