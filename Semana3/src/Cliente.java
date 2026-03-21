import java.util.Objects;

public class Cliente extends Persona implements Comparable<Cliente>{
    //Cliente ES Persona
    // Atributos
    private int telefono;
    private String usuario;
    private String metodoDePagoPreferido;
    public static  double bono;

    // Metodos y Constructores

    public Cliente() {
        // Constructor "por default" SIN parámetros de entrada
        // Ejecuta el constructor de la SUPER clase (Persona)
        super(); //Explicitamente ejecuta el constructor de la SUPER clase
        this.telefono = 5555;
        this.usuario = "ninguno";
    }
    // Métodos

    public static int totalDeClientes(){
        // Consulta la BBDD y regresa el número de clientres registrados
        return (765);
    }
    public void generaCFDI(){

    }

    // Metodos de la interfaz Icrud
    public boolean create() // INSERT
    {
        // Aqui va el INSERT a la tabla clientes
        return true;
    }

    public  boolean read(){
        // Implementa el SELECT a clientes
        return true;
    }
    public  boolean update(){
        // Implementa el UPDATE a clientes
        return true;
    }
    public  boolean delete(){
        // Implementa el DELETE a clientes
        return true;
    }

    // Setters y Getters

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMetodoDePagoPreferido() {
        return metodoDePagoPreferido;
    }

    public void setMetodoDePagoPreferido(String metodoDePagoPreferido) {
        this.metodoDePagoPreferido = metodoDePagoPreferido;
    }


    // toString

    @Override
    public String toString() {
        return "Cliente{(" + super.toString() + ".) " +
                "telefono=" + this.telefono +
                ", usuario='" + this.usuario + '\'' +
                '}';
    }


    public boolean equals(Object otro) {
        // Define cuando dos objetos son "iguales"
        if (!(otro instanceof Cliente cliente)) return false;
        // Dos clientes son iguales si sus usuarios son iguales
        return Objects.equals(this.getUsuario(), cliente.getUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(usuario);
    }

    public int compareTo(Cliente otro){
        // Regresará 0 si this y otro son iguales
        // Regresará >0 si this > otro
        // Regresará <= si this < otro

        int regreso = 0; // Por default son iguales
        if (! this.equals(otro)){ // Son diferentes
            regreso = (this.getUsuario().compareTo(otro.getUsuario()));
        }
        return regreso;
    }
}
