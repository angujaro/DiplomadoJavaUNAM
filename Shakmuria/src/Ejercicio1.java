import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] ventas = new double[5];
        int k = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita los números para llenar el arreglo: ");

        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = teclado.nextDouble();

            if (ventas[i] > 2000) {
                k++;
            }
        }

        double[] mostrar = new double[k];
        int indiceMostrar = 0;

        for (int j = 0; j < ventas.length; j++) {
            if (ventas[j] > 2000) {
                mostrar[indiceMostrar] = ventas[j];
                indiceMostrar++;
            }
        }

        System.out.println("Arreglo original: " + Arrays.toString(ventas));
        System.out.println("Ventas mayores a 2000: " + Arrays.toString(mostrar));
    }
}