import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Adivina el rango de dígitos válido");
            numero = readInput.nextInt();

            System.out.println("El número de dígitos es " + calcularDigitos(numero));
        }while (calcularDigitos(numero) > 7 || calcularDigitos(numero) < 3);
        readInput.close();
    }

    private static int calcularDigitos (int numeroDado){
        int digitos = 0;

        while (numeroDado >= 10){
            digitos++;
            numeroDado /= 10;
        }
        digitos++;
        return digitos;
    }
}
