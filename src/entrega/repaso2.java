package entrega;

import java.util.Scanner;
public class repaso2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        int numeroCaracteres;
        String caracter;

        System.out.println("¿Cuántos caracteres quiere escribir?");
        numeroCaracteres = readInput.nextInt();

        for (int i = 1; i <= numeroCaracteres; i++){
            if ((i % 2 == 0) || (i % 3 == 0)){
                caracter = "€";
            }
            else{
                caracter = "$";
            }
            System.out.println(i + " - " + caracter);
        }
        readInput.close();
    }
}
