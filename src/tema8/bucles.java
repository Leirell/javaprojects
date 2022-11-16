package tema8;

import java.util.Scanner;

public class bucles {
    public static void main(String [] args){

        Scanner readInput = new Scanner(System.in);

        int numeroUsuario = 0;
        int sumaTotal = 0;

        while (numeroUsuario != -1)
        {
        sumaTotal = sumaTotal + numeroUsuario;

        System.out.println("Intro numero: ");

        numeroUsuario = readInput.nextInt();
        }
        System.out.println("La suma total es:" + sumaTotal);

        readInput.close();
    }
}
