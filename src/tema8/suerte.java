package tema8;

import java.util.Scanner;

public class suerte {
    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        int primerNumero;
        int segundoNumero;
        int tercerNumero;
        int cuartoNumero;
        int numeroSuerte;
        int total;
        boolean seguir;

        Scanner readInput = new Scanner(System.in);

        do {
        System.out.println("Introduzca el día de nacimiento");
        dia = readInput.nextInt();

        System.out.println("Introduzca el mes de nacimiento");
        mes = readInput.nextInt();

        System.out.println("Introduzca el año de nacimiento");
        anio = readInput.nextInt();

        System.out.println("Su fecha es " + dia + "/" + mes + "/" + anio);

        numeroSuerte = dia + mes + anio;

        primerNumero = (numeroSuerte / 1000);
        segundoNumero = (numeroSuerte / 100) % 10;
        tercerNumero = (numeroSuerte / 10) % 10;
        cuartoNumero = numeroSuerte % 10;

        total = primerNumero + segundoNumero + tercerNumero + cuartoNumero;

        System.out.println("Su número de la suerte es " + total);

        System.out.println("¿Quieres seguir");
        seguir = readInput.nextBoolean();}
        while(seguir);
    }
}
