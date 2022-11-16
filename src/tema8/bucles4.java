package tema8;

import java.util.Scanner;

public class bucles4 {
    public static void main(String [] args){

        Scanner readInput = new Scanner(System.in);

        int numero = 1;
        int sumaPares = 0;
        int sumaImpares = 0;

        while((numero != 0) && (numero != -1)) {
            System.out.println("Introduzca un número");
            numero = readInput.nextInt();
            if (numero % 2 == 0){
                sumaPares += numero;
            }
            else{
                sumaImpares += numero;
            }

        }
        System.out.println("La suma de los pares es = " + sumaPares + " La suma de los impares es " + sumaImpares);
        readInput.close();
    }
}
