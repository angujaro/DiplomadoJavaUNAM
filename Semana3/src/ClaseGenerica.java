public class ClaseGenerica <T, V extends Persona, R extends Number> {
    // Al instanciar ClaseGenerica se recibirá como parámetro de entrada
    // el Tipo de la edad
    public String nombre;
    public double promedio;
    public T edad;

    public ClaseGenerica(){
        this.nombre = "Sin definir";
        this.promedio = -1;
        this.edad = null;
    }
    public ClaseGenerica(String nombre, double promedio, T edad){
        this.nombre = nombre;
        this.promedio = promedio;
        this.edad = edad;
    }
    public void imprimir(V valor){
        T otro;
        System.out.println("Estudiante: "+this.nombre);
        System.out.println("Tienes promedio de: "+this.promedio);
        System.out.println("Con edad: "+this.edad);
        System.out.println("Y valor de: "+valor);
    }

    @Override
    public String toString(){
        String resultado = this.nombre + ". Promedio: "+ this.promedio;
        resultado+= ". Edad = " + this.edad;
        return resultado;
    }

    public void metodo(V objeto){
        objeto.setNombre (this.nombre);
        //objeto.setEdad (this.edad);

    }
}
