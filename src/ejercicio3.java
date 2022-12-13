import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int numeroProductos;
        int precioRebajado; int precioNormal; String nombre; int rebaja; int mayorRebaja = 0; String productoMasRebajado = null; int mediaRebaja = 0;

        System.out.println("¿Cuantos productos va a comprar?");
        numeroProductos = readInput.nextInt();

        for (int i = 0; i < numeroProductos; i++){
            System.out.println("Nombre del producto");
            nombre = readInput.next();
            System.out.println("Precio normal");
            precioNormal = readInput.nextInt();
            System.out.println("Precio rebajado");
            precioRebajado = readInput.nextInt();

            rebaja = precioNormal - precioRebajado;

            mediaRebaja +=rebaja;

            if(mayorRebaja < rebaja){
                mayorRebaja = rebaja;
                productoMasRebajado = nombre;
            }
        }
        System.out.println("La media de las rebajas es " + mediaRebaja / numeroProductos);
        System.out.println("El producto con mayor rebaja es " + productoMasRebajado);
        readInput.close();

    }
}
