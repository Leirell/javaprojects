public class ejercicio2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println("Tabla del " + i);
            multiplicarConSegundoNumero(i);
            System.out.println("------------------");
        }
    }
    private static void multiplicarConSegundoNumero(int numeroTabla){
        int resultado;

        for (int i = 1; i <= 10; i++){
            resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }
    }
}
