import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        System.out.println("*** Lista enlazada con LinkedList ***");

        LinkedList<String> lista = new LinkedList<>();
        lista.push("Hugo");
        lista.push("Paco");
        lista.push("Luis");
        lista.push("Daisy");
        System.out.println(lista);
        System.out.println("Primer elemento (0): " + lista.get(0));

        System.out.println("Pop(): "+lista.pop());
        System.out.println("Lista después del pop(): " + lista);

        System.out.println("Peek(): "+lista.peek());
        System.out.println("Lista después del peek(): " + lista);
    }
}
