public class Cliente {
    // Atributos
    int idCliente;
    String nombreCompleto;
    String apellidoP;
    String apellidoM;
    char genero;
    int edad;
    double estatura;
    String email;

    public Cliente(){
        this.idCliente = 0;
        this.nombreCompleto = "Sin nombre";
        this.apellidoP = "Sin apellidoP";
        this.apellidoM = "Sin apellidoM";
        this.genero = 'N';
        this.edad = 0;
        this.estatura = 0.0;
    }

    public Cliente (int id){
        this(); //Cliente ()
        // En la base de datos se ejecutará un SELECT * FROM clientes WHERE id = idEntrada
        this.idCliente = 98;
        this.nombreCompleto = "Ninguno";
        this.genero = 'M';
        this.edad = 20;
        this.email = "angujaro@gmail.com";
    }

    public Cliente (String nombreEntrada){
        this();
        // Se ejecuta SELECT * FROM clientes WHERE nombreCompleto = nombreEntrada
        this.idCliente = 65;
        this.nombreCompleto = "Paco";
        this.genero = 'H';
    }

    public String toString(){ //se manda a llamar en instanciación porque es un string y al ser concatenado en ese programa, se dispara
        String resultado = "Soy un producto ";
        resultado += "llamado " + this.nombreCompleto;
        resultado += " de edad " + this.edad;
        resultado += " con correo electronico " + this.email;
        return resultado;
    }


}
