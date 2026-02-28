import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Ciclos ***");
        System.out.println("*** While ***");
        //Cuando conozco de antemano las vueltas/iteraciones que haré
        int vueltas = 1;
        while( vueltas <= 10){
            System.out.println("Voy en la vuelta "+ vueltas++);
        }

        System.out.println(" ");
        System.out.println("Otro ejercicio");
        //Cuando no conozco el número de vueltas, pero sé cuando parar
        int numero = -99;
        //La persona debe "adivinar" el número secreto (que será el 7)

        while( numero != 7){
            System.out.println("¿En qué número del 1 al 10 estoy pensando?");
            numero = teclado.nextInt();
        }

        System.out.println(" ");
        System.out.println("** Do-while **");
        //Adivinar el número 70
        numero = 70;
        do{
            System.out.println("¿Dime un número del 1 al 100 y te diré si es el que tengo en mente: ");
            numero = teclado.nextInt();
        } while( numero != 70 );

        System.out.println(" ");
        System.out.println("** Ciclos for **");
        numero = 7;
        for(int i=0; i<10;i++){
            System.out.println(i + "x" + numero+"= "+(i*numero));
        }

    }
}
