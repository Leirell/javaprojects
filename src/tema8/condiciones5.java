package tema8;

import java.util.Scanner;

public class condiciones5 {
    public static void main(String [] args){
        int inputMonth;
        int monthDays;

        System.out.println("Introduzca su mes de nacimiento");
        Scanner readInput = new Scanner(System.in);
        inputMonth = readInput.nextInt();

        if (inputMonth % 2 == 1 || inputMonth == 8){
            monthDays = 31;
        }
        else if (inputMonth != 2 && inputMonth % 2 == 0){
            monthDays = 30;
        }
        else {
            monthDays = 28;
        }
        System.out.println("El mes " + inputMonth + " tiene " + monthDays  + " días ");
        readInput.close();
    }
}
