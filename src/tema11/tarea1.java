package tema11;

public class tarea1 {
    public static void main(String[] args) {
        int numDado = 0;
        int dado1 = 0; int dado2 = 0; int dado3 = 0; int dado4 = 0; int dado5 = 0; int dado6 = 0;

        for (int i = 0; i < 1000; i++ ){
            numDado = tirarDado();
            switch (numDado) {
                case 1:
                    dado1++;
                    break;
                case 2:
                    dado2++;
                    break;
                case 3:
                    dado3++;
                    break;
                case 4:
                    dado4++;
                    break;
                case 5:
                    dado5++;
                    break;
                case 6:
                    dado6++;
                    break;
                default:
                    System.out.println("Error");
            }
        }
        System.out.println("1 = " + dado1 + " veces " + "2 = " + dado2 + " veces " + "3 = " + dado3 + " veces " + "4 = " + dado4 + " veces " + "5 = " + dado5 + " veces " + "6 = " + dado6 + " veces ");
    }
    private static int tirarDado(){
        int dado;
        dado = (int) (1 + (6 * Math.random()));
        return dado;

    }
}

