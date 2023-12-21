/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String inicial;
        String acumulador = "";
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                inicial = estudiantes[f][c].substring(0,1);
                inicial = inicial.toLowerCase();
                if (inicial.equals("s") || inicial.equals("p")
                        || inicial.equals("t")) {
                    acumulador += estudiantes[f][c] + "\n";
                }
            }
            
        }
        System.out.println(acumulador);
    }
}
