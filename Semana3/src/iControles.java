public interface iControles {
    // Atributos estáticos finales
    public static final int VOLUMEN_MAX = 100;
    public static final int VOLUMEN_MINIMO = 0;

    // Métodos abstractos //Clases que implementen esta interfaz se verán obligados a usar estos
    public void subeVolumen();
    public void bajaVolumen();


}
