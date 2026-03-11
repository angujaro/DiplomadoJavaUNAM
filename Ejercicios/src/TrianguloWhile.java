import java.util.Scanner;
import java.lang.Math;
public class TrianguloWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Dame un número");
        numero = teclado.nextInt();
        triangulo(numero);
    }

    public static void triangulo (int numero){
        String acumulador = "";
        for(int i=0; i<numero; i++){
            acumulador = acumulador + "*";
            System.out.println(acumulador);

        }
    }
}
