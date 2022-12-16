package tema11;

import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int primerNumero, segundoNumero, opcion;

        do {
            System.out.println("Escriba un número");
            primerNumero = readInput.nextInt();
            System.out.println("Escriba el segundo número");
            segundoNumero = readInput.nextInt();
            System.out.println("Introduzca la opción deseada: \n1: Calcular el máximo de los dos números. \n2: Calcular la raíz cuadrada del primero. \n3: Mostrar el primer número elevado al segundo. \n4: Mostrar el logaritmo del primero. \n5: Salir.");
            opcion = readInput.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El mayor es " + hacerMaximo(primerNumero, segundoNumero));
                    break;
                case 2:
                    System.out.println("La raíz de " + primerNumero + " es " + calcularRaiz(primerNumero));
                    break;
                case 3:
                    System.out.println(primerNumero + " Elevado a" + segundoNumero + " es " + elevarNumeros(primerNumero, segundoNumero));
                    break;
                case 4:
                    System.out.println("El logaritmo de " + primerNumero + " es " + hacerLogaritmo(primerNumero));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error");
            }
        }while (opcion != 5);
        readInput.close();
    }
    private static int hacerMaximo(int primeroNumero, int segundoNumero){
        int resultado;
        resultado = Math.max(primeroNumero, segundoNumero);
        return resultado;
    }
    private static double calcularRaiz(int numero){
        double resultado;
        resultado = Math.sqrt(numero);
        return resultado;
    }
    private static double elevarNumeros(int base, int exponente){
        double resultado;
        resultado = Math.pow(base, exponente);
        return resultado;
    }
    private static double hacerLogaritmo(int primerNumero){
        double resultado;
        resultado = Math.log10(primerNumero);
        return resultado;
    }
}
