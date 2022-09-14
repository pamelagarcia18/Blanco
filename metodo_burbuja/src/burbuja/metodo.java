/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class metodo {

    public static void main(String args[]) {

        int arreglo[] = new int[5];
        int auxiliar = 0;
        Scanner in = new Scanner(System.in);

        //pedimos valores en el teclado
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("INTRODUCE EL VALOS DE LA POSICIÓN " + i + ":");
            arreglo[i] = in.nextInt();
            System.out.println("");

        }

        //aplicamos el metodo de la burbuja
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;

                }
            }
        }

        //mostramos datos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }

}
