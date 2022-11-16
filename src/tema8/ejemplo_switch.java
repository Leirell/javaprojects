package tema8;

import java.util.Scanner;

public class ejemplo_switch {
    public static void main(String[] args){
    int numDia;
    String textoSalida;

    Scanner lectorEntrada = new Scanner(System.in);

    System.out.println("Introduzca el día de la semana: ");
    numDia= lectorEntrada.nextInt();

        switch (numDia)
        {
            case 1: textoSalida = "Lunes";
                break;
            case 2: textoSalida = "Martes";
                break;
            case 3: textoSalida = "Miércoles";
                break;
            case 4: textoSalida = "Jueves";
                break;
            case 5: textoSalida = "Viernes";
                break;
            case 6: textoSalida = "Sábado";
                break;
            case 7: textoSalida = "Domingo";
                break;
            default: textoSalida = "Día erróneo";
        }
    System.out.println("El día de la semana es " + textoSalida);
        lectorEntrada.close();
    }
}
