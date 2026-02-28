import java.util.Scanner; //1
public class Operadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); //2

        System.out.println("*** Operadores ***");
        System.out.println("++");

        int numero = 10;
        System.out.println(numero);

        System.out.println(numero += 3); // numero = numero + 3 // 13

        System.out.println(numero++); //13, pero numero al final vale 14
        System.out.println(numero);

        System.out.println(++numero); //15
        System.out.println(numero); //Sigue valiendo 15

        int edad = 8;
        System.out.print("¿Cuántos años tienes?");
        edad = 55; //teclado.nextInt();
        System.out.println("Eres " + (edad >=18? "mayor de edad" : "menor de edad"));

        System.out.println("*** Operadores a nivel de bit ***");
        numero = 20; //20 está en base 10 //00010100 es base 2
        System.out.println("número original: " + numero);

        //Corrimiento a la derecha con >> // (dividir por 2 cada posición recorrida)
        System.out.println("número>>1: " + (numero>>1)); //correr los bits a la derecha da 10, antes era 20 10 base 10 es 00001010
        System.out.println("número>>2: " + (numero>>2));  //inserta dos ceros a la izquierda y se recorren los ultimos dos 5 base 10 es 00000101

        //Corrimiento a la izquierda con << // (multiplicar por 2 cada posición recorrida //se agregan ceros a la derecha y se pierden los de la izquierda
        System.out.println("número<<1: " + (numero<<1)); // 40 base 10 es  00101000
        System.out.println("número<<2: " + (numero<<2));  // 80 base 10 es 01010000

        /*
         * Operadores Lógicos
         */

        //Lógica de bits
        int hugo = 35; //  01010000 base 2
        int luis = 252; // 11111011 base 2
        //¿Cómo puedo saber si tiene contratado Prime (prime está en la posicion 16 del bit)? (Netflix está en la posición 5 de derecha a izquierda)
        System.out.println("hugo & 00000100 :" + (hugo & 16)); //si regresa 0 no lo t iene contratado (la 4 posición vale 16 porque es 2x2x2x2
        System.out.println("luis & 000001000 : " + (luis & 16)); //si regresa 16 si lo tiene contratado

        //¿Cómo puedo "agregar" Prime al servicio?
        System.out.println("hugo | 00000100 :" + (hugo | 16)); // 51
    }
}

