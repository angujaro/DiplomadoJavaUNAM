import java.beans.ConstructorProperties;
import java.util.ArrayDeque;

public class EjemploCola {
    public static void main(String[] args) {
        System.out.println("*** Colas en Java (FIFO) ***");
        ArrayDeque<String> personas = new ArrayDeque<>();
        // Queue<String> personas = new ArrayDeque<>();

        // Agregamos con offer
        personas.offer("Bryan");
        personas.offer("Aaron");
        personas.offer("Andrea");
        personas.offer("Andres");
        //personas.addLast("Axel); //addLast ya no opera como FIFO

        System.out.println("Personas: "+personas);

        // Extraemos
        System.out.println("Poll(): "+personas.poll());
        System.out.println("Poll(): "+personas.poll());



    }
}
