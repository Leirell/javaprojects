package tema8;

import java.util.Scanner;

public class condiciones2 {
    public static void main(String [] args){
    double firstInputNumber;
    double secondInputNumber;

    Scanner readInput = new Scanner(System.in);
    System.out.println("Introduzca el primer número");
    firstInputNumber = readInput.nextDouble();
    System.out.println("Introduzca el segundo número");
    secondInputNumber = readInput.nextDouble();

    if (firstInputNumber > secondInputNumber){
        System.out.println(firstInputNumber + " Es mayor que " + secondInputNumber);
        }
    else if (secondInputNumber > firstInputNumber){
        System.out.println(secondInputNumber + " Es mayor que " + firstInputNumber);
        }
    else {
        System.out.println(firstInputNumber + " Es igual que " + secondInputNumber);
        }
    readInput.close();
    }
}
