package tema9;

import java.util.Scanner;

public class metodos2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int valorY;


        System.out.println("Escriba el valor Y");
        valorY = readInput.nextInt();

        for (int i = 0; i < valorY; i++){
            realizarFila(i);
            System.out.println();

        }
        for (int i = 0; i < valorY; i++){
            realizarFilaBocaAbajo(i, valorY);
            System.out.println();
        }

    }

    private static void realizarFila (int num_veces){
        String resultado = "*";

        for (int j = 0; j <= num_veces; j++){
            System.out.print(resultado);
        }
    }

    private static void realizarFilaBocaAbajo(int num_veces,int num_columnas){
        String resultado = "*";

        for (int j = num_columnas; j > num_veces; j--){
            System.out.print(resultado);
        }
    }

}

