package tema9;

import java.util.Scanner;

public class metodos1 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numero;
        int resultado;

        numero = readInput.nextInt();

        System.out.println(hacerFactorial(numero));


    }
    private static int hacerFactorial (int numeroFactorial)
    {
        int resultado = 1;

        for (int i = 0; i < numeroFactorial; i++){
            resultado *= i;
        }
        return resultado;
    }
}
