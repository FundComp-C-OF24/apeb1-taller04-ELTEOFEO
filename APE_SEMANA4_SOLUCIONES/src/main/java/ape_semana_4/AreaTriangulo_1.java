/*
Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos 
al usuario.
 */
package ape_semana_4;

import java.util.Scanner;

public class AreaTriangulo_1 {

    public static void main(String[] args) {
        double htriang;
        double btriang;
        double atriang;
        Scanner teclado = new Scanner(System.in);//DECLANDARO E INICIALIZAR
        System.out.println("INGRESE LA ALTURA DEL TRIANGULO");
        htriang = teclado.nextDouble();
        System.out.println("INGRESE LA BASE DEL TRIANGULO");
        btriang = teclado.nextDouble();
        atriang = (btriang + htriang) / 2;
        System.out.println("==========================================================================================================================================================================");
        System.out.println("ESTA ES SU AREA: " + atriang);

    }
}
