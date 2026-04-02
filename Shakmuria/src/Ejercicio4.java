//Ejercicio 2 Java.- Saber cuál es el mayor de un arreglo.
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[5];
        int numero = 0;
        System.out.print("Digita los valores del arreglo: ");
        for (int i=0; i<arreglo.length; i++){
            arreglo[i] = teclado.nextInt();

            if(arreglo[i]>numero){
                numero = arreglo[i];
            }
        }

        System.out.println(Arrays.toString(arreglo));
        System.out.println(numero);
    }
}
