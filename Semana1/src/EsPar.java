import java.util.Scanner;
 class EsPar {
     public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in); //2

         int numero;
         System.out.println("Digita un número: ");
         numero =  teclado.nextInt();

         String espar = (numero%2) == 0 ? "Es par": "Es impar";
         System.out.println("El resultado es: "+espar);
         teclado.close();
     }

}
