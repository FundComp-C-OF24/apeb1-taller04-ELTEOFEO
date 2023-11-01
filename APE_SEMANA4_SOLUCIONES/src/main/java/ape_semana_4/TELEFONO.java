
package ape_semana_4;
import java.util.Scanner;

public class TELEFONO {
    public static void main(String[] args) {
        double mgastado, mcosto, tpagar;
        Scanner teclado = new   Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE MINUTOS GASTADOS");
         mgastado = teclado.nextDouble();
         System.out.println("INGRESE ECOSTO");
          mcosto = teclado.nextDouble();
          tpagar = mgastado * mcosto;
          System.out.println("============================================");
          System.out.println("ESTE ES EL TOTAL DE PAGAR: " + tpagar);
          
    }
}
