package tema11;

import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int opcion, posicion;
        String palabra; String palabra2;

        System.out.println("Elija una opcion: \n1: Poner una palabra en mayúsculas. \n2: Comparar palabras. \n3: Mostrar el caracter que está en una determinada posición de una palabra. \n4: Mostrar el tamaño de una palabra. \n5: Salir");
        opcion = readInput.nextInt();

        switch (opcion){
            case 1: System.out.println("Escriba una palabra");
                palabra = readInput.next();
                System.out.println(ponerMayusculas(palabra));
                break;
            case 2: System.out.println("Escriba una palabra");
                palabra = readInput.next();
                System.out.println("Escriba una palabra");
                palabra2 = readInput.next();
                System.out.println("Diferencia en " + compararPalabras(palabra, palabra2) + " letras");
                break;
            case 3: System.out.println("Escriba una palabra");
                palabra = readInput.next();
                System.out.println("Escriba la posición de la letra");
                posicion = readInput.nextInt();
                System.out.println("La letra es " + mostrarCaracter(palabra, posicion));
                break;
            case 4: System.out.println("Escriba una palabra");
                palabra = readInput.next();
                System.out.println("El tamaño de la palabra es de " + calcularTamano(palabra) + " letras");
                break;
            case 5: System.out.println("Saliendo...");
                break;
            default: System.out.println("Error");
        }
        readInput.close();
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
    private static int calcularTamano(String palabraDada){
        int tamano;
        tamano = palabraDada.length();
        return tamano;
    }
}
