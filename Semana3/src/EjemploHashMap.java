import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Mapa con HashMap ***");
        // Los mapas guardan pares de llave-valor
        HashMap<Integer, String>  alumnos = new HashMap<Integer, String>();
        System.out.println("Alumnos: " + alumnos);
        alumnos.put(9876, "Lucia");
        alumnos.put(1234, "Luis");
        alumnos.put(987, "Juan");
        alumnos.put(8877, "Eligio");
        System.out.println("Alumnos después de 4 put's: "+alumnos);

        alumnos.put(987, "Carlos"); // alumno existente
        alumnos.put(6633, "Laura"); // alumno inexistente
        System.out.println("Alumnos después de 2 put's: "+alumnos);

        // Se accede a un elemento en especifico con get(llave)
        System.out.println("Valor asociado al 987: "+ alumnos.get(987)); // Alumno existente
        System.out.println("Valor asociado al 666: "+alumnos.get(666)); // Alumno inexistente

        // Se elimina elemento con remove(llave)
        System.out.println("Eliminado al 987: "+alumnos.remove(987)); // Alumno existente
        System.out.println("Eliminado al 666: "+alumnos.remove(666)); // Alumno inexistente
        System.out.println("Alumnos después de remove: "+alumnos);

        HashMap<String, Integer> meses = new HashMap<String,Integer>();
        meses.put("Enero", 31);
        meses.put("Febrero", 28);
        meses.put("Marzo", 30);
        System.out.println("Dias del tercer mes:"+meses.get("Marzo"));
    }
}
