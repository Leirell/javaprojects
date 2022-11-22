package tema9;

import java.util.Scanner;

public class metodos7 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int cantidadPrimos;
        int numeroProbar = 0;

        System.out.println("¿Cuantos numeros primos desea ver?");
        cantidadPrimos = readInput.nextInt();

        for (int i = 1; i <= cantidadPrimos;){
            numeroProbar++;
            if (sacarPrimos(numeroProbar)){
                System.out.println(numeroProbar);
                i++;
            }
        }
    }
    private static boolean sacarPrimos(int prueba){
        boolean primo = true;

        for (int i = 1; i <= prueba; i++){
            if (((prueba % i) == 0) && (i != 1) && (i != prueba)){
                primo = false;
            }
        }
        return primo;
    }
}
