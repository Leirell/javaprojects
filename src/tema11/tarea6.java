package tema11;

import java.util.Scanner;

public class tarea6 {
    public static void main(String[] args) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        int posicion;
        Scanner readInput = new Scanner(System.in);

        do {
            System.out.println("\n Indique el tamaño a dividir");
            posicion = readInput.nextInt();
            dividirEnBloques(posicion, abecedario);
        }while(posicion != 0);
        readInput.close();
    }
    private static void dividirEnBloques(int tamanoBloque, String texto){
        int tamanoTexto, numeroASumar = tamanoBloque;
        tamanoBloque = 0;
        tamanoTexto = texto.length();
        while (tamanoBloque < tamanoTexto) {
            if (tamanoBloque + numeroASumar > tamanoTexto){
                System.out.print(texto.substring(tamanoBloque));
            }
            else {
                System.out.print(texto.substring(tamanoBloque, tamanoBloque + numeroASumar) + " ");
            }
            tamanoBloque = tamanoBloque + numeroASumar;
        }
    }
}
