import java.util.Scanner;
public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos en Java ***");

        // Definición de arreglos
        int[] arreglo1;  //Definicion
        int[] arreglo2 = new int[5]; //Definición e inicialización del arreglo

       // System.out.println("arreglo1": " + arreglo1);  Error porque la variable no ha sido inicializada
        System.out.println("arreglo2: " + arreglo2);

        //Acceso individual a los elementos  arreglo[índice] empieza en 0
        arreglo2[3] = 33;
        arreglo2[1] = 3;
        arreglo2[4] = 44;
        System.out.println("Elemento en la primera posición: "+arreglo2[0]);

        // Usando recorremos el arreglo y desplegamos c/u de sus elementos
        for(int indice=0; indice<arreglo2.length; indice++){
            System.out.println("Posición " +indice + " tiene el valor de: " + arreglo2[indice]);
        }

        System.out.println("a");
       //arreglo1 = new int[4]; Inicializamos con un arreglo nuevo de 4 posiciones
        arreglo1 = arreglo2; //Inicializamos con otro arreglo (arreglo2);
        arreglo2[2] = 222;
        for(int indice=0; indice<arreglo1.length; indice++){
            System.out.println("Posición " +indice + " tiene el valor de: " + arreglo2[indice]);
        }
        System.out.println("___________Ejercicio__________");
        //1. Generar un arreglo de 5 calificaciones
        //2. Llenar cada una de las calificaciones con un double capturado por el usuario/a
        //3. Desplegar el contenido del arreglo

        double[] calificaciones = new double[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa las calificaciones: ");
        for(int i=0; i<calificaciones.length; i++){
            calificaciones[i] = teclado.nextDouble();
        }
        System.out.println("Calificaciones registradas: ");
        for(int i=0; i<calificaciones.length; i++){
            System.out.println("\t"+calificaciones[i]);
        }
        //4. Cual es de las calificaciones, la mayor?
        double numero = 0;
        for(int i=0; i<calificaciones.length;i++){
            if(calificaciones[i] > numero){
                numero = calificaciones[i];
            }

        }
        System.out.println("La calificación mayor es: "+numero);

        System.out.println("*** Arreglos de arreglos");
        //Que estructura de arreglo necesito para guardar las calificaciones de ejercicios, prácticas y proyecto final
        // de cada uno/a de los 20 estudiantes del Diplomado?

        double[][] parciales = new double[20][3]; //20 alumnos x 3 calificaciones de c/u

        //Capturar las 3 calificaciones de c/u de los 20 estudiantes
        for(int alumno=0; alumno <20; alumno++){
            System.out.println("Del alumno " +(alumno+1));
            for(int calificacion=0; calificacion <3; calificacion++){
                System.out.println("\tCalificación: "+ (calificacion+1));
                //nextDouble();
                //llenar la posición correspondiente con lo capturado
            }
        }


        // Se puede obtener el promedio (media aritmética) de los ejercicios?
        // Cuál es el promedio del alumno 14?
    } //Fin del main()
} //Fin de class
