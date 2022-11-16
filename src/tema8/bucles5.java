package tema8;

import java.util.Scanner;

public class bucles5 {
    public static void main(String [] args){
        Scanner readInput = new Scanner(System.in);

        double precioFinal = 0;
        int numeroUnidades;
        double precioUnidad;
        double iva;
        boolean salir = true;
        String comprobar;

        do {

            System.out.println("Introduzca el número de unidades");
            numeroUnidades = readInput.nextInt();
            System.out.println("Introduca el precio de la unidad");
            precioUnidad = readInput.nextDouble();
            System.out.println("Indique el % el iva");
            iva = readInput.nextDouble();

            precioFinal += (numeroUnidades * precioUnidad) * (iva / 100);
            System.out.println("El precio fina es " + precioFinal);

            System.out.println("¿Quiere iniciar otra operación?");
            comprobar = readInput.next();

            if (comprobar.equals("No")){
                salir = false;
            }
        } while (!salir);
        readInput.close();
    }
}
