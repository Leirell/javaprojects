package tema9;

import java.util.Scanner;

public class metodos235 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int valorY;
        String simbolo;

        System.out.println("Escriba el simbolo a usar");
        simbolo = readInput.next();

        System.out.println("Escriba el valor Y");
        valorY = readInput.nextInt();

        for (int i = 0; i < valorY; i++){
            realizarFila(i, simbolo);
            System.out.println();

        }
        for (int i = 0; i < valorY; i++){
            realizarFilaBocaAbajo(i, valorY, simbolo);
            System.out.println();
        }

    }

    private static void realizarFila (int num_veces,String resultado) {

        for (int i = 0; i <= num_veces; i++) {
            System.out.print(resultado);
        }
    }

    private static void realizarFilaBocaAbajo(int num_veces,int num_columnas, String resultado){

        for (int i = num_columnas; i > num_veces; i--){
            System.out.print(resultado);
        }
    }

}

