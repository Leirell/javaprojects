package entrega;

import java.util.Scanner;
public class repaso1 {
    private static final int LIMITE_INFERIOR = 5;
    private static final int LIMITE_SUPERIOR = 17;
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numero;
        boolean continuar;

        do {
            System.out.println("Introduzca un número dentro del rango");
            numero = readInput.nextInt();

            if ((numero >= LIMITE_INFERIOR) && numero <= LIMITE_SUPERIOR){
                System.out.println("Enhorabuena has acertado !!");
            }
            else{
                System.out.println("Has fallado");
            }

            System.out.println("¿Desea continuar?");
            System.out.println("Sí = true  No = false");
            continuar = readInput.nextBoolean();
        }while (continuar);
        readInput.close();
    }
}

