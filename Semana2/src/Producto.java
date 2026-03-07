//Clase Producto para una tienda de Ropa
public class Producto {
    // Atributos
    String nombre;
    int codigoDeBarras;
    char talla;
    String marca;
    String color;
    int existencias;
    double precio;
    double precioTotal;
    double precioDeCompra;
    float descuento;

    // Metodos
    //Constructores
    public Producto(){
        super();
        System.out.println("Estoy en el constructor Producto");
        // Asignar valores por default a los atributos
        nombre = "Indefinido"; //Se puede hacer referencia al atributo con su nombre
        this.codigoDeBarras = -1;
        this.talla = 'C';
        this.marca = "Sin marca";
        this.color = "Blanco";
        this.existencias = 300;
        this.precio = 12345;
        this.precioDeCompra = 0;
        this.descuento = 1;
    }

    public Producto(int codigo){
        switch(codigo){
            case 123:
                this.nombre = "Short femenino";
                this.codigoDeBarras = 2;
                this.talla = 'M';
                this.marca = "Patito";
                this.color = "Verde";
                this.existencias = 400;
                this.precio = 125555;
                this.precioDeCompra = 1;
                this.descuento = 0;
                break;
            case 875:
                this.codigoDeBarras = 10;
                this.talla = 'P';
                this.marca = "Marca X";
                this.color = "Amarillo";
                this.existencias = 300;
                this.precio = 12345;
                this.precioDeCompra = 9;
                this.descuento = 10;
                break;
        }
    }

    @Override
    public String toString(){ //se manda a llamar en instanciación porque es un string y al ser concatenado en ese programa, se dispara
        String resultado = "Soy un producto ";
        resultado += "llamado " + this.nombre;
        resultado += " de color " + this.color;
        resultado += " con precio de $  " + this.precio;


        return resultado;
    }

    public boolean alta(){
        //aqui estara el codigo para registrar en la bbdd
        // un nuevio producto
        System.out.println("Registrando en la base de datos un nuevo producto");



        System.out.println("Producto creado satisfactoriamente");
        return true;
    }


}
