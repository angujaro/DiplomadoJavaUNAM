public abstract class Persona implements Icrud{
    // Atributos
    private String nombre;
    private String rfc;
    private String correo;
    private double calificacion;
    private int edad;

    // Metodos

    public Persona() {
        // Constructor SIN parámetros de entrada que será utilizado
        // cuando instanciemos la clase usando un new Persona();
        this.nombre = "Sin nombre";
        this.rfc = "XXXXX";
        this.calificacion = 0;
        this.edad = 0;
    }

    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public final void setCalificacion(double calificacion) {
        if(calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18) this.edad = edad;
    }

    // toString

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", calificacion=" + calificacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public abstract void generaCFDI(); //Todas las personas deberan generar CFDI afuerza
}
