import org.w3c.dom.ls.LSOutput;

public class Herencia {
    public static void main(String[] args) {
        System.out.println("*** Herencia ***");


        System.out.println("Métodos estáticos");
        System.out.println(Cliente.totalDeClientes());
        System.out.println("** Atributos estáticos **");
        System.out.println(Cliente.bono);
        Cliente.bono = 0.07;
        System.out.println("---------------- Clase Persona ---------------");
        // Clase Persona
        // Instanciar la clase Persona
      /*  Persona o1 = new Persona(); //No se puede instanciar porque fue definida como abstract
        // Para modificar la edad de o1
        o1.setEdad(19);
        o1.setNombre("Andrea");
        System.out.println("Persona -> "+o1);
      */
        // Instanciar la subclase Asociado
        System.out.println("---------------- Clase Asociados ---------------");
        Asociado o2 = new Asociado();
        o2.setEdad(19); // Un asociado tiene edad porque ES Persona
        o2.setNombre("Curtis");
        o2.setPlacas("ABC123"); // Un asociado tiene placas porque ES Asociado
        System.out.println("Asociado -> "+o2); // Se ejecuta el toString() de Asociado
        System.out.println("Edad del asociado: "+o2.getEdad());
        // Instanciar la subclase Cliente
        System.out.println("---------------- subclase Cliente ---------------");
        Cliente o3 = new Cliente();
        //o3.setNombre("Lucía");
        o3.setEdad(19);
        o3.setUsuario("lucia123");
        System.out.println("Cliente -> "+o3);
        System.out.println(o3.totalDeClientes());
        System.out.println(o3.bono);

        System.out.println("---------------- Cliente VIP ---------------");
        ClienteVIP o4 = new ClienteVIP();
        System.out.println(o4);

        //Palabra reservada final
        System.out.println("---------------- Final ---------------");
        final int EDAD = 50;
        // edad = 99; // No se puede alterar el contenido porque es una constante
        System.out.println(EDAD);

    } // Fin del main

    // 1.- La edad valida de las personas es de 18 años en adelante
    // 2.- Debemos validar que los clientes solo sean mayores de edad
    // 3.- Y que los asociados tengan mas de 20 y 60 años

    // Cliente VIP


} // Fin de la clase
