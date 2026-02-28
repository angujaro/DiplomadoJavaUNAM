import java.util.Scanner;
public class Intercambia2Variables {
    public static void main(String[] args) {
        int una;
        int otra;
        Scanner teclado = new Scanner(System.in);   // 2
        System.out.print("Valor de una: ");
        una = teclado.nextInt();  // 3
        System.out.print("Valor de otra: ");
        otra = teclado.nextInt();  // 3

        System.out.println ("Valor originales:");
        System.out.println("\tuna = " + una);
        System.out.println("\totra = " + otra);

        int otra2 = una;
        una = otra;
        otra = otra2;


        System.out.println ("Valor finales:");
        System.out.println("\tuna = " + una);
        System.out.println("\totra = " + otra);
    }
}
