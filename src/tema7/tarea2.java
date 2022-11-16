package tema7;

import java.util.Scanner;

public class tarea2 {
    public static void main(String [] args){
        double firstNumber;
        double secondNumber;
        double suma;
        double resta;
        double mult;
        double div;
        double modu;
        double incremento;
        double decremento;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca primer número");

        firstNumber = teclado.nextDouble();

        System.out.println("Introduzca segundo número");

        secondNumber = teclado.nextDouble();

        suma = firstNumber + secondNumber;
        resta = firstNumber - secondNumber;
        mult = firstNumber * secondNumber;
        div = firstNumber / secondNumber;
        modu = firstNumber % secondNumber;
        incremento = ++firstNumber;
        decremento = --secondNumber;




        System.out.println("Suma = " + suma + " Resta = " + resta + " Multiplación = " + mult + " División = " + div + " Módulo = " + modu + " Incremento = " + incremento + " Decremento = " + decremento);
    }
}
