package tema8;

import java.util.Scanner;

public class bucles8 {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        String valorX = "*" ;
        int valorY;
        int t;

        System.out.println("Escriba el valor de X");
        t = readInput.nextInt();

        System.out.println("Escriba el valor de Y");
        valorY = readInput.nextInt();

        for (int i = 0; i < valorY; i++){
            System.out.println(valorX.repeat(t));
        }
        readInput.close();
    }
}
