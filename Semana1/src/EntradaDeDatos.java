import java.util.Scanner; // 1
public class EntradaDeDatos {
    public static void main(String[] args) {
        System.out.println("*** Entrada de datos ***");
        Scanner teclado = new Scanner (System.in);         //2 Crear objeto de tipo scanner

        // Variables para almacenar los datos de una película
        String nombre;
        int estreno;
        double presupuesto;

        System.out.println("Dame los siguientes datos de la película:");
        System.out.print("\tNombre: ");
        nombre =  teclado.nextLine(); //Captura un String y lo regresa

        System.out.print("\tAño de estreno: ");
        estreno = teclado.nextInt();

        System.out.print("\tPresupuesto (en millones de dólares): ");
        presupuesto = teclado.nextDouble();

        System.out.print(nombre +" se estrenó/estrenará en el "+ estreno);
        System.out.println(" con presupuesto de $"+presupuesto);

        teclado.close();
    }
}
