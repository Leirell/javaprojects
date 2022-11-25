package tema9;

import java.util.Scanner;

public class metodos7 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int primosPedidos;
        int numeroProbar = 0;
        int primosSacados = 1;

        System.out.println("¿Cuantos numeros primos desea ver?");
        primosPedidos = readInput.nextInt();

        while(primosSacados <= primosPedidos){
            numeroProbar++;
            if (sacarPrimos(numeroProbar)){
                System.out.println(numeroProbar);
                primosSacados++;
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
