package tema8;

import java.util.Scanner;

public class bucles6 {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        int numeroVeces = 10;
        int numero = 0;
        int media;


        for (int i = 1; i <= numeroVeces; i++ ){
            System.out.println("Introduce un número");
            numero += readInput.nextInt();
            media = numero / i;
            System.out.println("La media es " + media);
        }
        readInput.close();
    }
}
