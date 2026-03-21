enum Suscripcion {ORO, PLATA, BRONCE}
public class Enumeraciones {
    public static void main(String[] args) {
        System.out.println("*** Enumeraciones ***");

        Suscripcion miSuscrripcion = Suscripcion.ORO;
        Suscripcion tuSuscripcion = Suscripcion.PLATA;
        System.out.println("Mi suscripcion esd de tipo: " + miSuscrripcion);
        tuSuscripcion = Suscripcion.BRONCE;
        tuSuscripcion = Suscripcion.valueOf("ORO");
        System.out.println("Tu suscripcion es de tipo: " + tuSuscripcion.ordinal());

        System.out.println("*** Enumeraciones con atributos ***");

        Nivel miNivel = Nivel.ORO;
        Nivel tuNivel = Nivel.PLATA;
        Nivel suNivel = Nivel.GRATUITO;

        System.out.println("Mi nivel: "+miNivel+ " de $"+miNivel.getAnualidad() + " y "+miNivel.getDescuento()+"%");
        System.out.println("Tu nivel: "+tuNivel+ " de $"+tuNivel.getAnualidad() + " y "+tuNivel.getDescuento()+"%");
        System.out.println("Tu nivel: "+suNivel+ " de $"+suNivel.getAnualidad() + " y "+suNivel.getDescuento()+"%");





    }
}
