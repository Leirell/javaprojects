package tema11;

import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {
        String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
        String resultado;
        Scanner readInput = new Scanner(System.in);
        int posicionInicial, posicionFinal;

        do {
            System.out.println(texto);
            System.out.println("Indique la posición inicial");
            posicionInicial = readInput.nextInt();
            System.out.println("Indique la posición final");
            posicionFinal = readInput.nextInt();
            resultado = obtenerSubcadena(posicionInicial, posicionFinal, texto);
            System.out.println(resultado);
        }while (!resultado.equals("Mancha") && (!resultado.equals("quiero")));

        readInput.close();
    }
    private static String obtenerSubcadena(int inicio, int fin, String texto){
        return texto.substring(inicio, fin);
    }
}
