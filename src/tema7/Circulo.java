package tema7;

import java.util.Scanner;

public class Circulo {
    public static void main(String [] args){
        double radioCircunferencia;
        double longitudCircunferencia;
        double areaCircunferencia;
        final double PI = 3.1416;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia");

        radioCircunferencia = teclado.nextDouble();

        longitudCircunferencia = 2 * radioCircunferencia;
        areaCircunferencia = PI * (radioCircunferencia * radioCircunferencia);

        System.out.println("La longitud es" + longitudCircunferencia + "El area es" + areaCircunferencia);
    }
}
