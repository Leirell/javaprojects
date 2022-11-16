package tema8;

import java.util.Scanner;

public class binario1 {
    public static void main(String[] args) {
        int numero;
        int binario;
        int cociente;
        String binario2;

        Scanner readInput = new Scanner(System.in);

        System.out.println("Introduzca un número");
        numero = readInput.nextInt();

        do {
            binario = numero % 2;
            cociente = numero / 2;
            numero = cociente;
            System.out.print(binario);

        } while(cociente != 0);
    }
}
