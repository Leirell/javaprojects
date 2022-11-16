package tema8;

import java.util.Scanner;

public class bucles7 {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        int primerNumeroEntrada;
        int segundoNumeroEntrada;

        System.out.println("Escribe el primer número");
        primerNumeroEntrada = readInput.nextInt();

        System.out.println("Escribe el segundo número");
        segundoNumeroEntrada = readInput.nextInt();

        if(primerNumeroEntrada < segundoNumeroEntrada){
            while(primerNumeroEntrada <= segundoNumeroEntrada){
                if (primerNumeroEntrada % 4 == 0 && primerNumeroEntrada % 5 != 0){
                    System.out.println(primerNumeroEntrada);
                }
                primerNumeroEntrada++;
            }
        }
        else {System.out.println("Orden no válido");}
        readInput.close();
    }
}
