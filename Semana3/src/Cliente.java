public class Cliente extends Persona{
    //Cliente ES Persona
    // Atributos
    private int telefono;
    private String usuario;
    private String metodoDePagoPreferido;


    // Metodos y Constructores

    public Cliente() {
        // Constructor "por default" SIN parámetros de entrada
        // Ejecuta el constructor de la SUPER clase (Persona)
        super(); //Explicitamente ejecuta el constructor de la SUPER clase
        this.telefono = 5555;
        this.usuario = "ninguno";
    }
    public void generaCFDI(){

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
}
