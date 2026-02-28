public class Funciones {
    public static void main(String[] args) {
        System.out.println("*** Funciones ***");
        mensaje(); //Se puede ejecutar como procedimiento pero "perdemos" el valor de retorno
        String texto1;
        texto1 = mensaje();
        System.out.println(texto1);
        System.out.println(mensaje());

        //Función que recibe dos enteros y regresa un double
        System.out.println(suma(8, 9));
        byte vByte = 10;
        long vLong = 20;
        double vDouble = 30.3;
        // System.out.println(resultado); //En este lugar ya no existe resultado
        System.out.println(suma(vByte, 500));
        System.out.println(suma(vByte, (int) vLong));
        System.out.println(suma(100.9, 200)); //Se "pierde" la parte decimal


        //Procedimiento ----- sobrecargado
        System.out.println();
        System.out.println("Sumatoria");
        System.out.println(sumatoria(5,9));
        System.out.println(sumatoria(9));
        System.out.println(sumatoriaRecursiva(9));
        System.out.println("Factorial");
        System.out.println(factorial(3));

    }

    public static int sumatoria(int valorInicial, int valorFinal) {
        int resultado = 0;
        for (int i = valorInicial; i <= valorFinal; i++) {
                resultado = resultado + i;
        }
        return resultado;
        //Regresar la sumatoria de los enteros en [valorInicial, valorFinal]
        //p. ej sumatoria (5,9) --> 5+6+7+8+9 = 35
    }

    public static int sumatoria(int valorFinal) {
        // Regresa la sumatoria de los enteros en el intervalo de valor inicial a valor final
        int resultado = 0;
        for (int i = 1; i <= valorFinal; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static double sumatoriaRecursiva (int valorFinal){
        double resultado;
        if(valorFinal > 0) {
            resultado = valorFinal + sumatoriaRecursiva(valorFinal - 1);
        } else {
            resultado = 0;
        } return resultado;
    }

    public static double factorial  ( int numero){
        double resultado;
        if( numero > 0){
            resultado = numero * factorial(numero - 1);
        } else {
            resultado = 1;
        } return resultado;

    }

    public static String mensaje() {
        System.out.println("Estoy dentro de la función mensaje");
        return "Hola"; //Lo que regresa a quien la ejecuta
    }

    public static double suma(int primerNumero, int segundoNumero) {
        double resultado;
        resultado = primerNumero + segundoNumero;
        return resultado;
    }

    public static double suma(double primerNumero, double segundoNumero) {
        double resultado;
        resultado = primerNumero + segundoNumero;
        return resultado;
    }
}
