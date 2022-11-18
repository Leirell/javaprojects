package tema9;

import java.util.Scanner;

public class metodos4 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numero;

        System.out.println("Introduzca un numero");
        numero = readInput.nextInt();

        System.out.println(sumarDigitos(numero));
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
