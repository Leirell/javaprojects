package tema8;

import java.util.Scanner;

public class binario {
    public static void main(String[] args) {
        int dec;

        Scanner readInput = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        dec = readInput.nextInt();

        String binario = Integer.toBinaryString(dec);
        System.out.println(binario);

    }
}