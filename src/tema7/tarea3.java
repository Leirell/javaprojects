package tema7;

import java.util.Scanner;

public class tarea3 {
    public static void main(String [] args){
        int firstNumber;
        int secondNumber;
        int suma;
        int resta;
        int mult;
        int div;
        int modu;
        int incremento;
        int decremento;
        int lastDigits;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca primer número");

        firstNumber = teclado.nextInt();

        System.out.println("Introduzca segundo número");

        secondNumber = teclado.nextInt();

        suma = firstNumber + secondNumber;
        resta = firstNumber - secondNumber;
        mult = firstNumber * secondNumber;
        div = firstNumber / secondNumber;
        modu = firstNumber % secondNumber;
        lastDigits = firstNumber % 100;
        incremento = ++firstNumber;
        decremento = --secondNumber;



        System.out.println("Suma = " + suma + " Resta = " + resta + " Multiplación = " + mult + " División = " + div + " Módulo = " + modu + " Incremento = " + incremento + " Decremento = " + decremento + " Últimos dos dígitos = " + lastDigits );
    }
}