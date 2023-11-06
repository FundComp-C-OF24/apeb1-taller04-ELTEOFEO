
package ape_semana_4;
import java.util.Scanner;
public class PAGO_MENSUAL {
    public static void main(String[] args) {
        double mc, inte, tpm;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL  MONTO DE SU PRESTAMO");
         mc = teclado.nextDouble();
        System.out.println("INGRESE EL INTERES MENSUAL");
        inte = teclado.nextDouble();
        tpm= (mc/12)+inte;
        System.out.println("EL TOTAL A PAGAR ES DE: "+tpm);
        
    }
    
}
