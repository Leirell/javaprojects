package tema9;

import java.util.Scanner;

public class metodos6 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numeroPrimo;

        System.out.println("Introduzca un número");
        numeroPrimo = readInput.nextInt();

        if (comprobarPrimo(numeroPrimo)){
            System.out.println("El número es primo");
        }
        else {
            System.out.println("El número no es primo");
        }
        readInput.close();
    }

    private static boolean comprobarPrimo (int numero){
        boolean primo = true;

        for (int i = 1; i <= numero; i++){
            if (((numero % i) == 0) && (i != 1) && (i != numero)){
                primo = false;
            }
        }

        return primo;
    }
}

