package tema8;

import java.util.Scanner;

public class bucles9  {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        int valorY;

        System.out.println("Escriba el valor de Y");
        valorY = readInput.nextInt();

        for (int i = 1; i <= valorY; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < valorY; i++){
            for (int j = valorY - 1; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        readInput.close();
    }
}


