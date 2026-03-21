public class Telefono implements iControles{
    // Atributos
    private int numero;
    private int nivelVolumen;

    //Constructor
    public Telefono(){
        this.numero = 0;
        this.nivelVolumen = 0;
    }

    @Override
    public void subeVolumen() {
        this.nivelVolumen++;
    }

    @Override
    public void bajaVolumen() {
        this.nivelVolumen--;
    }

    // Métodos
    public void llamar(int aQuien){
        // Hacemos la llamada al número indicado

    }


    //Setters y Getters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNivelVolumen() {
        return nivelVolumen;
    }

    public void setNivelVolumen(int nivelVolumen) {
        this.nivelVolumen = nivelVolumen;
    }


    // toString
    @Override
    public String toString() {
        return "Telefono{" +
                "numero=" + numero +
                ", nivelVolumen=" + nivelVolumen +
                '}';
    }
}
