package tema11;

import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        String textoEntrada;
        char letra;
        int numero = 0;
        boolean letraIgual = false;

        System.out.println("Introduzca cualquier texto");
        textoEntrada = readInput.nextLine();

        System.out.println("Introduzca una letra en la que parar");
        letra = readInput.next().charAt(0);
//Para comparar Strings NO se usa == se usa .equals
// num = (int)(10 * math.random()); "Esto fuerza el double del random a transformarse en un int"
        while(!letraIgual){
            letraIgual = textoEntrada.charAt(numero) == letra;
            if (!letraIgual) {
                System.out.print(textoEntrada.charAt(numero));
            }
            numero++;
        }
    }
}
