import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        ArrayList<Integer> arreglo2 = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int paro = 0;

        while(true){
            System.out.print("Ingresa una venta: ");
            paro = teclado.nextInt();
            if(paro == 0) break;
            arreglo.add(paro);
        }

        for (Integer venta: arreglo){
            if(venta > 2000)
                arreglo2.add(venta);
        }
        System.out.println(arreglo);
        System.out.println(arreglo2);
        System.out.println("Numero de elementos: "+arreglo2.size());

    }
}
