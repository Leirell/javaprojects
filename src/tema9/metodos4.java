package tema9;

import java.util.Scanner;

public class metodos4 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numero = 1;

        while (numero != 0){
        System.out.println("Introduzca un numero");
        numero = readInput.nextInt();

        System.out.println(sumarDigitos(numero));
        }
        readInput.close();
    }

    private static int sumarDigitos(double numeroPedido){
        int sumaTotal = 0;

        do {
            sumaTotal += numeroPedido % 10;
            numeroPedido /= 10;
        }while(numeroPedido >= 1);

        return sumaTotal;
    }

}
