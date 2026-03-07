
//Alumna: Andrea Guadalupe Jaimes Rodríguez
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        //Atributos
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        int materias;
        double promedio;
        int creditos;
        int condicion;

        //Si se desea seguir capturando
        do {
            //Captura de datos
            System.out.print("¿Cuál es tu nombre?: ");
            nombre = teclado.nextLine();
            System.out.print("Cuál es tu edad?: ");
            edad = teclado.nextInt();
            System.out.print("Número de materias cursadas: ");
            materias = teclado.nextInt();
            System.out.print("Promedio final: ");
            promedio = teclado.nextDouble();
            System.out.print("Cantidad de créditos cursados: ");
            creditos = teclado.nextInt();

            evaluarEdad(edad);
            System.out.println(estadoAcademico(promedio, creditos));
            evaluarElegibilidadBeca(promedio, creditos);
            calcularPortencaje(creditos);

            System.out.print("¿Deseas agregar un nuevo estudiante? 1/0: ");
            condicion = teclado.nextInt();
        }while(condicion == 1); //Si se desea parar
            teclado.close();

    }

    //Metodo para evaluar la edad
    public static void evaluarEdad(int edad){
        String resultado = (edad >18) ? "Es mayor de edad": "Es menor de edad";
        System.out.println(resultado);
    }

    //Metodo para evaluar el estado academico
    public static String estadoAcademico(double promedio, int creditos){
        String resultado = (promedio >= 8 && creditos > 20)? "Eres regular" : "No eres regular";
        return resultado;
    }

    //Metodo para evaluar la elegibilidad
    public static void evaluarElegibilidadBeca (double promedio, int creditos){
        String resultado = (promedio >= 9 && creditos >= 30)? "Eres elegible" : "No eres elegible";
        System.out.println(resultado);
    }

    //Metodo para calcular el porcentaje
    public static void calcularPortencaje(int creditos){
        double creditoTotal = 120;
        double porcentaje = 100 - (creditos / creditoTotal) * 100;
        System.out.println("Porcentaje de créditos faltantes: %"+porcentaje);
    }
}
