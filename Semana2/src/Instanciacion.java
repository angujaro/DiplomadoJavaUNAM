import java.util.Scanner;
public class Instanciacion {

    public static void despliega(Producto x){
        System.out.println("Producto: "+x);
        System.out.println("\tNombre: "+x.nombre);
        System.out.println("\tCódigo de barras: "+x.codigoDeBarras);
        System.out.println("\tTalla: "+x.talla);
        System.out.println("\tPrecio: "+x.precio);
    }


    public static void main (String [] args){
        System.out.println("*** Ejemplo de Instanciación de clases (Creación de objetos) ***");
        //Clase objeto = new constructor();

        Cliente uno = new Cliente();
        System.out.println("Primer cliente: "+uno);

        Cliente dos = new Cliente(98);
        System.out.println("Primer cliente: "+dos);

        Cliente tres = new Cliente("Andrea");
        System.out.println("Primer cliente: "+tres);


        //Prueba de constructor que recibe un int
        System.out.println("Prueba de constructor que recibe un int");
        Producto objeto3 = new Producto(1234);
        despliega(objeto3);



        Producto objeto1 = new Producto();

        // Referencia a los atributos de un objeto:
        // objeto.atributo;
        //objeto1.nombre = "Jeans de hombre";
        objeto1.codigoDeBarras = 12345;
        objeto1.talla = 'C';
        objeto1.marca = "Levis";
        objeto1.color = "Azul";
        objeto1.precio = 1000;

        System.out.println(objeto1);
        System.out.println("\tNombre: "+objeto1.nombre);
        System.out.println("\tCódigo de barras: "+objeto1.codigoDeBarras);
        System.out.println("\tTalla: "+objeto1.talla);
        System.out.println("\tPrecio: "+objeto1.precio);


        System.out.println("Objeto 2");
        Producto objeto2 = new Producto();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame los datos del nuevo producto: ");
        System.out.print("\tNombre:");
        objeto2.nombre = teclado.nextLine();
        System.out.print("\tCódgio de Barras:");
        objeto2.codigoDeBarras = teclado.nextInt();
        System.out.print("\tPrecio: $");
        objeto2.precio = teclado.nextDouble();
        System.out.print("\t"+objeto2.marca);
        objeto2.precio = teclado.nextDouble();

    }
}
