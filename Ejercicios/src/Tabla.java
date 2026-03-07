import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n=0;
        System.out.println("Ingresa un número n: ");
        n = teclado.nextInt();
        tabla(n);
    }

    public static void tabla(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
}
