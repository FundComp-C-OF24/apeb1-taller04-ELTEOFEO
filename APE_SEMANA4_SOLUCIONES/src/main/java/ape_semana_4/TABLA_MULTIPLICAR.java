package ape_semana_4;

import java.util.Scanner;

public class TABLA_MULTIPLICAR {

    public static void main(String[] args) {
        double numusu, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12;
        boolean esVerdadero = true, esFalso = false, esVerdadero2 = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO EN CUESTION");
        numusu = teclado.nextDouble();
        esVerdadero = (numusu == 2) || (numusu == 6);

        if (esVerdadero) {
            System.out.println("SE PROCEDERA A CALCULAR SU TABLA DE MULTIPLICAR:");
            num1 = numusu * 1;
            System.out.println(num1);
            num2 = numusu * 2;
            System.out.println(num2);
            num3 = numusu * 3;
            System.out.println(num3);
            num4 = numusu * 4;
            System.out.println(num4);
            num5 = numusu * 5;
            System.out.println(num5);
            num6 = numusu * 6;
            System.out.println(num6);
            num7 = numusu * 7;
            System.out.println(num7);
            num8 = numusu * 8;
            System.out.println(num8);
            num9 = numusu * 9;
            System.out.println(num9);
            num10 = numusu * 10;
            System.out.println(num10);
            num11 = numusu * 11;
            System.out.println(num11);
            num12 = numusu * 12;
            System.out.println(num12);

        } else {
            System.out.println("NO ES POSIBLE CALCULAR");
        }

    }

}
