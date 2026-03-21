import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de ArrayList");
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Lista inicial: "+lista);

        // Agregar elementos al ArrayList
        // add(elemento)
        lista.add("Spiderman");
        lista.add("Thor");
        lista.add("Batman");
        System.out.println("Lista después de los add(elemento): "+lista);

        lista.add(2, "Ironman");
        System.out.println("Lista después de los add(2,elemento): "+lista);


        primos.add(2);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        System.out.println("Números primos: "+primos);

        clientes.add(new Cliente());
        clientes.add(new ClienteVIP());
        System.out.println("Clientes: "+clientes);

        // Extracción de un elemento
        // get (indice)
        System.out.println("------------");
        System.out.println("Personaje con indice 2: "+lista.get(2));
        System.out.println("Numero con indice 2: "+primos.get(2));
        System.out.println("Cliente con indice 2: "+clientes.get(1));

        System.out.println("------------");
        System.out.println("Personaje con indice 2: "+lista.get(0));
        System.out.println("Numero con indice 2: "+primos.get(2));
        System.out.println("Cliente con indice 2: "+clientes.get(1));

        // size() regresa el número de elemento (tamaño) del ArrayList
        System.out.println("------------");
        System.out.println("Elementos en la lista: "+lista.size());
        System.out.println("Elementos en numeros: "+primos.size());
        System.out.println("Elementos en numeros: "+clientes.size());

        // isEmpty() es boolean para indicar si el ArrayList está vacio
        System.out.println("------------");
        System.out.println("Elementos en la lista: "+lista.isEmpty());
        System.out.println("Elementos en numeros: "+primos.isEmpty());
        System.out.println("Elementos en numeros: "+clientes.isEmpty());

        // Eliminar elementos en una colección
        System.out.println("------------");
        System.out.println(lista.remove("Spiderman"));
        System.out.println(lista.remove("Superman"));
        System.out.println("Lista después de remover a Spiderman y Superman:"+lista);
        System.out.println(primos.remove(2));

        // cambiar contenido de un elemento con un set (indice, valor)
        lista.set(2, "Superman");
        System.out.println("Lista despues del set (2, Superman): " +lista);

        // Esta el 10 en la lista de los numeros primos?
        System.out.println("Esta el 10 en los primos?: "+primos.contains(10));
        System.out.println("Esta el 7 en los primos?: "+primos.contains(7));

        // en que posicion esta el 7?
        System.out.println("El 7 esta en la posicion: "+primos.indexOf(7));
        System.out.println("El 77 esta en la posicion: "+primos.indexOf(77));

        clientes.add(new Cliente());
        System.out.println(clientes.contains(new Cliente()));

        Cliente clienteBuscado = new Cliente();
        System.out.println("Está el cliente "+ clienteBuscado+"?");
        clientes.add(clienteBuscado);
        System.out.println(clientes.contains(new Cliente()));
        clientes.get(1).setUsuario("Spiderman");
        clienteBuscado.setUsuario("Spiderman");
        System.out.println(clientes.contains(new Cliente()));
        System.out.println("Spiderman está en la posición: " + clientes.indexOf(clienteBuscado));

        System.out.println("---------------------");
        // Inicializar un ArrayLsy con valores:
        ArrayList<String> arrayL1 =
                new ArrayList<>(Arrays.asList("Spiderman", "Superman", "Batman"));

        System.out.println("Personajes: "+arrayL1);

        ArrayList<String> arrayL2 =
                new ArrayList<>(List.of("Mujer maravilla", "Blackwidow", "She hulk"));

        System.out.println("Personajes: " + arrayL2);

        // Ordenamiento
        Collections.sort(arrayL1);
        System.out.println("Personajes ordenados: "+arrayL1);
        ArrayList<Integer> desordenados = new ArrayList<>(Arrays.asList(80,20,-10,10,0));
        System.out.println("Numeros desordenados: " + desordenados);
        Collections.sort(desordenados);
        System.out.println("Numeros ordenados: " + desordenados);

        System.out.println(clientes.size());
        clientes.get(0).setUsuario("Sheldon");
        clientes.get(1).setUsuario("Leonard");
        clientes.get(2).setUsuario("Howard");
        Collections.sort(clientes);
        System.out.println("Clientes ordenados: "+clientes);

        ArrayList<Icrud> objetos = new ArrayList<>();
        // ArrayLisy de objetos cuya clase implemente Icurd
        objetos.add(new Radio());
        objetos.add(new Cliente());
        objetos.add(new ClienteVIP());
        objetos.add(new Asociado());
        // objetos.add(new Persona());
        System.out.println("Objetos ICRUD: "+ objetos);

    }
}
