public class ClasesEquivalentes {
    public static void metodo (Cliente objeto, String texto, int variable){
        //objeto = new Cliente();
        objeto.setNombre(texto);
        objeto.setEdad(variable);

        texto = "Nuevo texto";

        variable = 99;

    }
    public static void main(String[] args) {


        System.out.println("--- Paso de parámetros ---");
        // En otros lenguajes existe el paso de parámetros
        // Por valor y por referencia

        Cliente o1 = new Cliente();
        o1.setNombre("Ana");
        o1.setEdad(88);
        String texto = "Valor Original";
        int numero = 100;

        System.out.println(o1+"--"+texto+"--"+numero);
        metodo(o1,texto,numero);
        System.out.println(o1+"++"+texto+"++"+numero);

    }
}
