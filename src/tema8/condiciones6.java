package tema8;

import java.util.Scanner;

public class condiciones6 {
    public static void main(String [] args){
        double firstNumber;
        double secondNumber;
        String symbol;
        double result;
        boolean error = false;

        Scanner readInput = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        firstNumber = readInput.nextDouble();

        System.out.println("Introduzca el símbolo");
        symbol = readInput.next();

        System.out.println("Introduzca el segundo número");
        secondNumber = readInput.nextDouble();

        switch (symbol)
        {
            case "+": result = firstNumber + secondNumber;
            break;
            case "-": result = firstNumber - secondNumber;
            break;
            case "*": result = firstNumber * secondNumber;
            break;
            case "/": result = firstNumber / secondNumber;
            break;
            default: result = 00000;
                    error = true;
        }
        if (error) {
            System.out.println("Error de sintaxis");
        }
        else {
            System.out.println(result);
        }

        readInput.close();
    }
}
