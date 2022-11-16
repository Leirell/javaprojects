package tema8;

import java.util.Scanner;

public class bucles3 {
    public static void main(String [] args){

        Scanner readInput = new Scanner(System.in);

        final int hideNumber = 8;
        int inputNumber = 0;


        while(inputNumber != hideNumber) {
            System.out.println("Intenta adivinar el número");
            inputNumber = readInput.nextInt();

            if (inputNumber < hideNumber) {
                System.out.println("El número es a adivinar es mayor");
            }
            else if (inputNumber > hideNumber){
                System.out.println("El número a adivinar es menor");
            }
        }
        System.out.println("¡Has acertado!");
    }
}
