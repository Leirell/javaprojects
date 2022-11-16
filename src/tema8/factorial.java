package tema8;

import java.util.Scanner;

public class factorial {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        int factorial;
        int productoFactor = 1;

        System.out.println("Introduzca el número del que quiere sacar el factorial");
        factorial = readInput.nextInt();

        for (int i = 1; i <= factorial; i++){
            productoFactor = productoFactor * i;
        }
        System.out.println("El factorial de " + factorial + " es " + productoFactor);
        readInput.close();
    }
}
