public enum Nivel {
    // Enumeracion para niveles de un Gym
    PLATINO(1200, 10),
    ORO(1000, 10),
    PLATA(500,3),
    BRONCE(200, 2),
    GRATUITO(0,1);
    // Definir los valores posibles asociándolos con algunos valores

    // Atributo(s) para guardar los valores asociados a cada nivel
    private double anualidad;
    private int descuento;
    // Metodos
    // Constructor  que recibe un parámetros para c/u de los atributos
    Nivel(double anualidad, int descuento){
        this.anualidad = anualidad;
        this.descuento = descuento;
    }

    // get para cada uno de los atributos
    public double getAnualidad(){
        return this.anualidad;
    }

    public int getDescuento(){
        return this.descuento;
    }
}
