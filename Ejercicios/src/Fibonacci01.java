import java.util.Scanner;
public class Fibonacci01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digita un numero: ");
        numero = teclado.nextInt();
    }

    public static int fibo(int numero){
        if(numero-1 == 0){
            return 0;
        } else if (numero-1 == 1) {
            return 1;
        }
        return 3;
    }
}
