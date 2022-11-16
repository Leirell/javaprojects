package tema8;

import java.util.Scanner;

public class condiciones4 {
    public static void main(String [] args){
        int inputAge;
        int inputProduct;
        double price;
        int unit;

        Scanner readInput = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        inputAge = readInput.nextInt();
        System.out.println("Introduza la cantidad de producto a comprar");
        inputProduct = readInput.nextInt();

        if (inputProduct <= 10){
            unit = 20000;
        }
        else {
            unit = 15000;
        }
        price = inputProduct * unit;
        if (inputAge < 30){
            price = price - (price * 0.10);
        }
        System.out.println("El precio total es " + price + " El precio unitario es " + unit);

        readInput.close();
    }
}
