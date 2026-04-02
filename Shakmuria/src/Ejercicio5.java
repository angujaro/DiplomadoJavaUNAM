//Ejercicio 2 Java.- Saber cuál es el mayor de un arreglo.

import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int paro = 0;
        int numero = 0;

        System.out.println("Digita los valores de tu arreglo: ");
        while(true){
         paro = teclado.nextInt();
         if(paro == 0) break;
         arreglo.add(paro);
        }

        for(Integer arr: arreglo){
            if(arr > numero){
                numero = arr;
            }
        }
        System.out.println("El número más grande es: "+numero);
    }
}
