package tema8;

import java.util.Scanner;

public class condiciones1 {
    public static void main (String [] args){
    int inputNumber;

    Scanner lectorInput = new Scanner(System.in);
    System.out.println("Introduzca un número entero");
    inputNumber = lectorInput.nextInt();


    if (inputNumber % 2 == 0){
        System.out.println("El número es par");
        }
    else{
        System.out.println("El número es impar");
        }
    lectorInput.close();
    }
}
