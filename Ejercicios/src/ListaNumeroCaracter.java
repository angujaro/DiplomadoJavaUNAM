public class ListaNumeroCaracter {
    public static void main(String[] args) {
        desplegar();
    }

    public static void desplegar(){
        for(int i=1; i<=80; i++){
            System.out.println(i + " " + (char)i);
        }
    }
}
