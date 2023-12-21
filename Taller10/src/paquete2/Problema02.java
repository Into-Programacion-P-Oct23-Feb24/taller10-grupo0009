/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String [] vendedores = {"Jessica Cole", "Robert Wallace"};
        int [][] ventas = new int [2][5];
        int total = 0;
        for (int f = 0; f < vendedores.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                System.out.printf("Ingrese las ventas diarias %d de %s\n",
                        c+1, vendedores[f]);
                ventas[f][c] = entrada.nextInt();
            }
        }
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                total += ventas[f][c];
            }
        }
        for (int f = 0; f < vendedores.length; f++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[f]);
        }
        System.out.printf("Han realizado un total de %d en ventas",
                total);
    }
}
