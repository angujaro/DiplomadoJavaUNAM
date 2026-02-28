import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   // 2
        double primera;
        double segunda;
        double tercera;
        double suma;
        double promedio;

        System.out.print("Primer calificación: ");
        primera = teclado.nextDouble();

        System.out.print("Segunda calificación: ");
        segunda = teclado.nextDouble();

        System.out.print("Tercera calificación: ");
        tercera = teclado.nextDouble();

        suma = primera + segunda + tercera;
        promedio = suma / 3;

        System.out.println("El promedio de la calificación es: " +promedio);

        teclado.close();
    }
}
