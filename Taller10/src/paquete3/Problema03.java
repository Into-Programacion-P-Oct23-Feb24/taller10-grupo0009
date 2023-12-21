/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
	double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        for (int f = 0; f < notasCuantitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas.length; c++) {
                double nota;
                String cuali="";
                nota = notasCuantitativas[f][c];
                if (nota >= 0 && nota < 3) {
                    cuali = "Insuficiente";
                } else {
                    if (nota >= 3 && nota < 5) {
                        cuali = "Regular";
                    } else {
                        if (nota >5 && nota < 8) {
                            cuali = "Buena";
                        } else {
                            if (nota >=8 && nota < 9.6) {
                                cuali = "Muy buena";
                            } else {
                                if (nota >= 9.6 && nota <= 10) {
                                    cuali = "Sobresaliente";
                                }
                            }
                        }
                    }
                }
                
                notasCualitativas[f][c] = cuali;
                
            }   
        }
        
        for (int f = 0; f < notasCualitativas.length; f++) {
            for (int c = 0; c < notasCualitativas.length; c++) {
                System.out.printf("Nota %.2f es %s\n",
                        notasCuantitativas[f][c],
                        notasCualitativas[f][c]);
                
            }
            
        }
        
    }
    
}
