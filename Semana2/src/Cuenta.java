public class Cuenta {
    // Atributos
    private int id;
    private String cliente;
    private double saldo;


    // Metodos
    // Constructores
    public Cuenta(){
        this.id=0;
        this.cliente = "Indefinido";
        this.saldo = 0;
    }

    public Cuenta (int idEntrada){
        this(); // Ejecuta el constructor Cuenta();
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

    public boolean retirar (double monto){
        boolean resultado = false;
        if(monto > 0 && this.saldo >= monto){
            this.saldo -= monto;
            resultado = true;
        }
        // Se registra en la BD el cambio en el saldo y se genera una póliza
        return resultado;
    }

    //Get para  ver un atributo
    //Set para modificar

    // Permite sl que instancia "ver" el atributo
    public String getId(){
        String resultado = String.valueOf(this.id);
        return "***"+resultado;
    }

    public String getCliente(){
        return this.cliente.toUpperCase();
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setcliente(String cliente){
        this.cliente = cliente;
    }

    // Permite a quien instancia, "modificar" el valor del atributo
    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
    }

    public int transferirA (Cuenta destino, double monto){
        // El origen es this
        // 1. Retiramos dinero del origen
        int resultado = 0;
        if(this.retirar(monto)){
            if(destino.depositar(monto)){
                resultado = 100; // OK
            } else {
                resultado = -30; // Retiro OK, pero nopudo depositar
            }
        } else {
            resultado = -45; //No pudo retirar
        }

        return resultado;

        // 2. Depositamos al destino
    }


}
