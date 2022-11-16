package tema8;

import java.util.Scanner;

public class bucles2 {
    public static void main(String [] args){

        Scanner readInput = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Introduzca el número menor");
        firstNumber = readInput.nextInt();

        System.out.println("Introduzca el número mayor");
        secondNumber = readInput.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("Se necesita un número mayor a primero");
        }
        else if (firstNumber % 2 == 0){
            while(firstNumber <= secondNumber){
                System.out.println(firstNumber);
                firstNumber = firstNumber + 2;
            }
        }
        else {
            firstNumber = firstNumber + 1;
            while (firstNumber <= secondNumber){
                System.out.println(firstNumber);
                firstNumber = firstNumber + 2;
            }
        }
        readInput.close();
    }
}
