package tema11;

import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        String textoEntrada;
        String textoComprobar;

        System.out.println("Escribe un texto");
        textoEntrada = readInput.nextLine();

        System.out.println("Escribe un texto más pequeño");
        textoComprobar = readInput.nextLine();

        System.out.println(textoEntrada.contains(textoComprobar));

        int largo = textoEntrada.length();
        System.out.println(textoEntrada + "\n" + largo);

        largo = textoComprobar.length();
        System.out.println(textoComprobar + "\n" + largo);

        readInput.close();

    }





}
