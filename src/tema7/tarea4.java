package tema7;

import java.util.Scanner;

public class tarea4 {
    public static void main(String [] args){
        double gradosCelsius;
        double gradosFahrenheit;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame la temperatura en Grados Celsius");

        gradosCelsius = teclado.nextDouble();

        gradosFahrenheit = (gradosCelsius * (9.0 / 5) + 32);

        System.out.println("La temperatura es " + gradosFahrenheit + "º Fahrenheit");


    }
}
