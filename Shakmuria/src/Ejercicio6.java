import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        double total = 0;
        double pieza = 5;
        System.out.print("Digita el total de piezas que compraste: ");
        cantidad = teclado.nextInt();
        if(cantidad>100){
            pieza = 4;
            total = cantidad * pieza;
        } else if (cantidad > 50) {
            pieza = 4.5;
            total = cantidad * pieza;
        } else {
            total = cantidad * pieza;
        }
        System.out.println("Cantidad de piezas: "+cantidad);
        System.out.print("Total: "+total);
    }
}
