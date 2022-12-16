package tema11;

import java.util.Scanner;

public class tarea3 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int numeroDNI;

        System.out.println("Escriba su DNI");
        numeroDNI = readInput.nextInt();

        System.out.println("Su DNI completo es " + numeroDNI + calcularLetra(numeroDNI));

    }
    private static char calcularLetra(int numeroDNI){
        char letra;
        String codigoDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        numeroDNI = numeroDNI % 23;
        letra =  codigoDNI.charAt(numeroDNI);

        return letra;
    }
}
