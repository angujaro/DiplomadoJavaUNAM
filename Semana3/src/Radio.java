import java.util.Objects;

public class Radio implements iControles , Icrud{
    // Atributos
    private int volumen;
    private boolean encendido;
    private double frecuencia;

    //Constructor
    public Radio(){
        this.encendido = false;
        this.frecuencia = 87.1;
        this.volumen = 30;
    }

    // Metodos de la interfaz Icrud
    public boolean create() // INSERT
    {
        // Aqui va el INSERT a la tabla radio
        return true;
    }

    public  boolean read(){
        // Implementa el SELECT a radio
        return true;
    }
    public  boolean update(){
        // Implementa el UPDATE a radio
        return true;
    }

    public  boolean delete(){
        // Implementa el DELETE a radio
        return true;
    }

    @Override
    public void subeVolumen() {
        this.volumen+=5;
        if (this.volumen > VOLUMEN_MAX)
                this.volumen = VOLUMEN_MAX;
    }

    @Override
    public void bajaVolumen() {
        this.volumen-=5;
    }

    //Setters y Getters
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "volumen=" + volumen +
                ", encendido=" + encendido +
                ", frecuencia=" + frecuencia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Radio radio = (Radio) o;
        return volumen == radio.volumen && Double.compare(frecuencia, radio.frecuencia) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumen, frecuencia);
    }
}
