public class ClienteVIP extends Cliente{
    private int descuento;

    public int getDescuento(){
        return descuento;
    }

    public ClienteVIP(){
        super();
        this.descuento = 5;
    }

    // Metodos de la interfaz Icrud
    public boolean create() // INSERT
    {
        // Aqui va el INSERT a la tabla clientes
        return true;
    }

    public  boolean update(){
        // Implementa el UPDATE a clientes
        return true;
    }

}
