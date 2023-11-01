package ape_semana_4;

import java.util.Scanner;

public class costo_compu {

    public static void main(String[] args) {
        double costCPU, costtec, costpant, costrat, vtotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DE CPU");
        costCPU = teclado.nextDouble();
        System.out.println("INGRESE EL PRECIO DE TECLADO");
        costtec = teclado.nextDouble();
        System.out.println("INGRESE EL PRECIO DE PANTALLA");
        costpant = teclado.nextDouble();
        System.out.println("INGRESE EL PRECIO DEL RATÓN");
        costrat = teclado.nextDouble();
        vtotal = costCPU + costpant + costrat + costtec;
        System.out.println("================================");
        System.out.println("ESTE ES EL VALOR TOTAL: " + vtotal);

    }

}
