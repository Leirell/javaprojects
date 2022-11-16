package tema7;

import java.util.Scanner;

public class EntradaSalida {

    public static void main(String [] args){
        String nombre;
        int edad;

        Scanner lectorEntrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre");

        nombre = lectorEntrada.next();

        System.out.println(nombre);

        System.out.println("Escribe tu edad");

        edad = lectorEntrada.nextInt();

        System.out.println(edad);

        System.out.println("Hola " + nombre + " tienes " + edad + " años");

    }
}
