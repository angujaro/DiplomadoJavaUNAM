public class Polimorfismo {

    public static void metodo(Persona o){
        System.out.println( "objeto de tipo persona: " + o);
    }

    public static void metodo2(Icrud o){
        System.out.println("Objeto que implementa Icrud: "+o);
    }

    public static void main(String[] args) {

        // Clase objeto = new Constructor(parámetros); el constructor se llama igual que la clase
        Cliente o1 = new Cliente();
        o1.setEdad(20); // o1 se comporta  como Persona
        o1.setNombre("Carlos"); // o1 se comporta  como Persona
        o1.setMetodoDePagoPreferido("TDC"); // o1 se comporta como Cliente
        metodo2(o1);


        Asociado o2 = new Asociado();
        o2.setEdad(20); // o2 se comporta como Asociado
        o2.setNombre("Eligio"); // o1 se comporta  como Persona
        metodo2(o2);


        Cliente o3 = new ClienteVIP();
        metodo(o3);
        System.out.println(o3);

        Cliente[] fila = new Cliente[3]; // Fila de 3 clientes
        fila[0] = o1;  // Cliente
        fila[1] = o3;  // Cliente VIP
        fila[2] = new Cliente(); //Cliente


        Persona[] personas = new Persona[3]; // Fila de 3 personas
        personas[0] = new Cliente();
        personas[1] = new Asociado();
        personas[2] = new ClienteVIP();

        for (int i=0; i < personas.length; i++){
            System.out.println("Persona "+(i+1) + " " + personas[i]);
        }

        Radio o4 = new Radio();
        metodo2(o4);

        Icrud[] objetos = new Icrud[3];
        objetos[0] = new Cliente();
        objetos[1] = new Asociado();
        objetos[2] = new Radio();
        for (int i=0; i < objetos.length; i++){
            System.out.println("Objeto "+(i+1) + " " + objetos[i]);
        }

        System.out.println(o4.revisarConexion()); //o4 es radio
        System.out.println(o1.revisarConexion()); //o1 es cliente







    }

}
