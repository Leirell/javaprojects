package tema11;

import java.util.Scanner;

public class tarea6 {
    public static void main(String[] args) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        int numeroDividir;
        Scanner readInput = new Scanner(System.in);

        do {
            System.out.println("\n Indique el tamaño a dividir");
            numeroDividir = readInput.nextInt();
            dividirEnBloques(numeroDividir, abecedario);
        }while(numeroDividir != 0);
        readInput.close();
    }
    private static void dividirEnBloques(int tamanoBloque, String texto){
        int tamanoTexto, posicion = 0;
        tamanoTexto = texto.length();
        while (posicion < tamanoTexto) {
            if (posicion + tamanoBloque > tamanoTexto){
                System.out.print(texto.substring(posicion));
            }
            else {
                System.out.print(texto.substring(posicion, posicion + tamanoBloque) + " ");
            }
            posicion = posicion + tamanoBloque;
        }
    }
}
