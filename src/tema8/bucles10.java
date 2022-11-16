package tema8;

import java.util.Scanner;

public class bucles10 {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        int valorY = 0;
        int filas, columnas, espacio;

        System.out.println("Escriba el valor de Y");
        valorY = readInput.nextInt();

        int espacio2 = valorY * 2;

        for (columnas = 1; columnas <= valorY; columnas++){
            for (filas = 1; filas <= columnas; filas++){
                System.out.print("*");
            }
            for (espacio = 1; espacio <= valorY; espacio++ ){
                System.out.print(" ");
            }
            for (filas = valorY - 1; filas >= columnas; filas--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (columnas = 1; columnas < valorY; columnas++){
            for (filas = valorY - 1; filas >= columnas; filas--){
                System.out.print("*");
            }
            System.out.println();
        }
        readInput.close();
    }
}

