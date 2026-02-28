public class Procedimientos {
        //Estrictamente hablando los procedimientos son métodos
       //Los procedimientos por definición no regresan valro (son de tipo void)

       //Definición o declaración del procedimiento
    public static void saluda(){
        System.out.println("Hola");
        int numero = 10;
        numero +=5;
    }
    public static void bienvenidad(String nombre){
        System.out.println("Bienvenida/o "+nombre);
    }

    public static void despedida(int veces, String nombre){
        for(int n=1; n<=veces;n++){
            System.out.println("Adios "+nombre);
        }
    }

    public static void main (String[] args){
            System.out.println("*** Procedimientos ***");
            //Uso/Llamado/ejecución de un procedimieno
            saluda();
            for(int i=0; i<5; i++)
                saluda();
            bienvenidad("Hugo");
            bienvenidad("Paco");
            despedida(3,"Andrea");
    }
}
