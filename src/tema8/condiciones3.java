package tema8;

import java.util.Scanner;
public class condiciones3 {
    public static void main(String [] args){
        int inputNumber;

        Scanner readInput = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 10");
        inputNumber = readInput.nextInt();

        if (inputNumber > 5) {
            System.out.println("Progresa adecuadamente");
        }
        else if (inputNumber < 5){
            System.out.println("Necesita mejorar");
        }
        else {
            System.out.println("La nota es regular");
        }
        readInput.close();
    }
}
