/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int i=0;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos.length; c++) {
                System.out.println("Ingrese el valor");
                datos[f][c] = entrada.nextDouble();
                if (datos[f][c] <=1000 || datos[f][c] >= 1199) {
                    datos [f][c] = 10;
                    i++;
                }
                    
            }
        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos.length; c++) {
                System.out.printf("%.2f\n",datos[f][c]);      
            }
        }
        System.out.printf("Valores fuera de rango: %d\n",i);
    }
}
