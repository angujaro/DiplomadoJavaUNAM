public class PruebaGenericos {
    public static void main (String[] args){
        System.out.println("*** Genéricos ***");

        // Clase<TIPO> objeto = new Constructor <TIPO> (parámetros de entrada)
        ClaseGenerica<Integer, Cliente, Byte> objeto1 = new ClaseGenerica <Integer, Cliente, Byte>();
        objeto1.nombre = "Peter Parker";
        objeto1.promedio = 9.9;
        objeto1.edad = 19;
        System.out.println("Objeto 1: "+ objeto1);
        objeto1.imprimir(new Cliente());

        System.out.println("----------------");
        ClaseGenerica<Double, Asociado, Short>  objeto2 = new ClaseGenerica<Double, Asociado, Short>();
        System.out.println("Objeto 2: "+objeto2);
        objeto2.nombre = "Thor";
        objeto2.promedio = 8.8;
        objeto2.edad = 1000.8;
        objeto2.imprimir(new Asociado());

        System.out.println("----------------");
        ClaseGenerica<String, Cliente, Float> objeto3 = new ClaseGenerica<>("Bruce Wayne", 7.7, "Mayor de edad");
        System.out.println("Objeto 3: "+objeto3);
        objeto3.imprimir(new Cliente());


        System.out.println("----------------");
        ClaseGenerica<Integer, Cliente, Integer> objeto4 = new ClaseGenerica();
    }
}
