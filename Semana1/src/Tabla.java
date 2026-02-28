import java.util.Scanner;
public class Tabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int numero2 = 1;
        System.out.println("Escribe un número del 1 al 10 y te entregaré su tabla de multiplicar: ");
        numero = teclado.nextInt();
        while( numero2<=10){
            System.out.println(numero +" x "+  numero2 +" = " + numero*numero2);
            numero2++;
        }
    }
}
