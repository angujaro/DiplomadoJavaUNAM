public interface Icrud {
    // Definiremos comportamiento común para las clases que
    // requieren de un CRUD

    // Atributos estáticos finales (constantes estáticas)


    // Metodos abstractos
    public abstract boolean create();
    public abstract boolean read();
    public abstract boolean update();
    public abstract boolean delete();
    //public abstract void reindex();

    // Métdoso default (ya no son abstractos)
    default boolean revisarConexion() {
        // Codigo para revisar que la conexion de BBDD esté disponible
        // ping al servidor
        return true;
    }


}
