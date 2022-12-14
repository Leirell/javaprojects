package tema11;

import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int opcion;
        String palabra; String palabra2;

        System.out.println("Elija una opcion: \n1: Poner una palabra en mayúsculas. \n2: Comparar palabras. \n3: Mostrar el caracter que está en una determinada posición de una palabra. \n4: Mostrar el tamaño de una palabra. \n5: Salir");
        opcion = readInput.nextInt();

        switch (opcion){
            case 1: System.out.println("Escriba una palabra");
                palabra = readInput.nextLine();
                System.out.println(ponerMayusculas(palabra));
                break;
            case 2: System.out.println("Escriba una palabra");
                palabra = readInput.nextLine();
                System.out.println("Escriba una palabra");
                palabra2 = readInput.nextLine();
                System.out.println("Diferencia en " + compararPalabras(palabra, palabra2) + " letras");
                break;
            case 3: System.out.println("Escriba una palabra");
                palabra = readInput.nextLine();
                System.out.println();
                break;
            case 4: System.out.println("Escriba una palabra");
                break;
            case 5: System.out.println("Escriba una palabra");
                break;
            default:;
        }
    }
    private static String ponerMayusculas(String palabraDada){
        palabraDada = palabraDada.toUpperCase();
        return palabraDada;
    }
    private static int compararPalabras(String palabraDada, String palabraDada2){
        int diferencia;
        diferencia = palabraDada.compareTo(palabraDada2);
        return diferencia;
    }
    private static char mostrarCaracter(String palabraDada, int posicion){
        char caracter;
        caracter = palabraDada.charAt(posicion);
        return caracter;
    }
}
