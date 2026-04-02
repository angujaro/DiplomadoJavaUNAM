import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] ventas = new int[3];
        int[] validar = new int[ventas.length];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita cada una de las ventas: ");
        int numero = 0;
        for(int i = 0; i<ventas.length;i++){
            ventas[i] = teclado.nextInt();
            if(ventas[i] > 2000){
                validar[i] = ventas[i];
            }
        }
        System.out.println(Arrays.toString(validar));





    }
}
