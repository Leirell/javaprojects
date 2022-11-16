package tema8;

import java.util.Scanner;

public class bucles1 {
    public static void main(String [] args){

        Scanner readInput = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Introduzca el primer número");
        firstNumber = readInput.nextInt();

        System.out.println("Introduzca el segundo número");
        secondNumber = readInput.nextInt();

        if (secondNumber < firstNumber){
            System.out.println("Se necesita un número mayor al primero");
        }
        else {
            while (firstNumber <= secondNumber)
            {
                System.out.println(firstNumber);
                firstNumber = firstNumber + 1;
            }
        }
        readInput.close();
    }
}
