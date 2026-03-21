public final class Asociado extends Persona implements Icrud {
    // Todo Asociado ES Persona
    // Atributos
    private String licencia;
    private String placas;

    // Metodos y Constructores


    // Setters y Getters

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public void generaCFDI(){

    }

    // Metodos de la interfaz Icrud
    public boolean create() // INSERT
    {
        // Aqui va el INSERT a la tabla asociados
        return true;
    }

    public  boolean read(){
        // Implementa el SELECT a asociados
        return true;
    }
    public  boolean update(){
        // Implementa el UPDATE a asociados
        return true;
    }
    public  boolean delete(){
        // Implementa el DELETE a asociados
        return true;
    }

    public void setEdad (int edad){
        // La edad del Asociado debe estar entre 20 y 60 años
        if (edad >= 20 && edad <= 60){ //Es una edad válida
            super.setEdad(edad);
        }
    }

    // toString()

    @Override
    public String toString() {
        return "Asociado{" + getNombre() + ". " +
                "licencia='" + licencia + '\'' +
                ", placas='" + placas + '\'' +
                '}';
    }
}
