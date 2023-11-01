package ape_semana_4;
import java.util.Scanner;
public class GASTO_HIJO {
    public static void main(String[] args) {
        double ghijo1, ghijo2, ghijo3, gastosTotales;
        Scanner teclado = new   Scanner(System.in);
        System.out.println("INGRESE LOS GASTOS DE LOS HUJOS 1");
        ghijo1 = teclado.nextDouble();
         System.out.println("INGRESE LOS GASTOS DE LOS HUJOS 2");
        ghijo2 = teclado.nextDouble();
        System.out.println("INGRESE LOS GASTOS DE LOS HUJOS 3");
        ghijo3= teclado.nextDouble();
        gastosTotales = ghijo1*ghijo2+ghijo3;
        System.out.println("============================================================================");
        System.out.println("LOS GASTOS TOTALES SÓN: " + gastosTotales);        
    }
}
