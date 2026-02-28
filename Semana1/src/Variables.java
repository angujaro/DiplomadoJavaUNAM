public class Variables {
    public static void main(String[] args) {
        System.out.println("Definicion y uso de variables");
        //Definición de variables
        //tipo nombre
        int edad;

        //Inicialización de variables
        //variable = primer valor;
        edad = 99;

        //Definición e inicialización
        double calificacion = 9.9;
        // definición
        //   inicialización

        //Después de definir e inicializar una variable, la puedo usar
        System.out.println("Contenido de edad: "+edad);
        System.out.println("Contenido de calificación: "+calificacion);

        //Definición de variable con var
        // var nombre = valor inicial;
        var nombre = "Eligio"; // -> nombre será String
        var asistencias = 7; // -> asistencias será int

        int añoDeNacimiento = 2000;
        System.out.println(añoDeNacimiento);

        System.out.print("*** Tipos de datos primitivos ***");
        //boolean (lógicos o booleanos)
        boolean aprobado =true;
        boolean falto=false;

        System.out.println("");
        System.out.println(aprobado);

        //char (UN caracter)
        char inicial = 'E'; //comilla simple para delimitar literal char
        System.out.println(inicial);
        System.out.println(inicial+1);

        //Numéricos enteros: byte, short, int, long
        short estatura = 1_79; //en centímetros
        System.out.println(estatura);

        //Numérico real: float, double
        double temperatura = 36.5; //en centígrados
        System.out.println(temperatura);

        System.out.println( "*** Caracteres de escape ***");
        System.out.println("Universidad \nNacional \n\tAutónoma de Méxic\no");

        System.out.println("*** Clase String ***");
        String institucion = "DGTIC";
        System.out.println(institucion);
        String primerLetra = "E"; //Es diferente a 'E' que es un char

        {
            System.out.println("*** Expresiones ***");
            String domicilio = "Circuito Exterior x/n, CU";
            System.out.println(edad = 10); //variable int = valor int
            //          int
            System.out.println(calificacion = 10); //variable double = valor int
            //          double

            System.out.println("*** Promoción y casting");
            calificacion = 9; //promoción
            // 9.0
            System.out.println(calificacion);
            System.out.println(edad + 1.2); //Promoción
            //                 int  + double
            //              double  + double
            //

            calificacion = edad; //Promoción
            //double       int
            //     promover a double al momento de la compilación, nada de esto sucede en la ejecución
            System.out.println(calificacion);

            //Casting (nuevo tipo de dato) expresión a convertir
            calificacion = 8; //promoción (8.0)
            edad = (int)calificacion;
            //          8.0
        }
    }
}
