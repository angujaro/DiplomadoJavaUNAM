public class Cuenta {
    // Atributos
    int id;
    String cliente;
    double saldo;


    // Metodos



    // Constructores
    public Cuenta(){
        this.id=0;
        this.cliente = "Indefinido";
        this.saldo = 0;
    }

    public Cuenta (int idEntrada){
        this.id = idEntrada; //id es el parámetro, this.id es el atributo de la clase
        switch (idEntrada){
            case 111:
                this.id = idEntrada;
                this.cliente = "Rachel";
                this.saldo = 1000;
                break;
            case 222:
                this.id = idEntrada;
                this.cliente = "Ross";
                this.saldo = 2000;
                break;
            case 333:
                this.id = idEntrada;
                this.cliente = "Mónica";
                this.saldo = 3000;
                break;
        }
    }

    // toString();
    @Override
    public String toString(){
        return "Cuenta "+this.id + " de " + this.cliente + " con saldo de $ " + this.saldo;
    }

    // Métodos para manejo de cuenta
    // Depósito a la cuenta. Recibirá el monto a incrementar y afectará el saldo

    public boolean depositar (double monto){
        boolean resultado = false;
        if(monto > 0){
            this.saldo += monto;
            resultado = true;
        }
        // Se registra en la BD el cambio en el saldo y se genera una póliza
        return resultado;
    }
}
