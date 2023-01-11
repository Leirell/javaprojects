package tema11;

import  java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        String palabra;
        Scanner readInput = new Scanner(System.in);

        System.out.println("Introduzca una palabra para ver si es un palíndromo");
        palabra = readInput.nextLine();

        if (detectarPalindromos(palabra)){
            System.out.println("Esta palabra es un palíndromo");
        }
        else {
            System.out.println("Esta palabra no es un palíndromo");
        }

    }
    private static boolean detectarPalindromos(String palabraDada){
        int tamanoPalabra = palabraDada.length(), numeroIzquierda = 0;
        char comprobarIzquierda, comprobarDerecha;
        boolean igual = true;

        while ((tamanoPalabra > 1) && igual){
            comprobarIzquierda = palabraDada.charAt(numeroIzquierda);
            comprobarDerecha = palabraDada.charAt(tamanoPalabra);
            if (comprobarIzquierda == (comprobarDerecha)){
                numeroIzquierda++; tamanoPalabra--;
            }
            else {
                igual = false;
            }
            return igual;
        }
    }
}
