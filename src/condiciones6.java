import java.util.Scanner;

public class condiciones6 {
    public static void main(String [] args){
        double firstNumber;
        double secondNumber;
        String symbol;
        double result;

        System.out.println("Introduzca el primer número");
        Scanner readInput = new Scanner(System.in);
        firstNumber = readInput.nextDouble();

        while (firstNumber == firstNumber ) {
            System.out.println("Introduzca el símbolo");
            symbol = readInput.next();
            System.out.println("Introduzca el segundo número");
            secondNumber = readInput.nextDouble();
            System.out.println(symbol.length());
            if (symbol.equals("+")) {
                firstNumber = firstNumber + secondNumber;
            } else if (symbol.equals("-")) {
                firstNumber = firstNumber - secondNumber;
            } else if (symbol.equals("*")) {
                firstNumber = firstNumber * secondNumber;
            } else {
                firstNumber = firstNumber / secondNumber;
            }
            System.out.println(firstNumber);
        }
        readInput.close();
    }
}
