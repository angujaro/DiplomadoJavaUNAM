import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FechaHora {
    public static void main(String[] args) {
        System.out.println("*** Fechas ***");
        LocalDate fecha1 = LocalDate.now();
        System.out.println("Fecha 1: "+fecha1);

        LocalDate fecha2 = LocalDate.of(2000,5,30);
        System.out.println("Fecha 2: "+fecha2);

        LocalDate fecha3 = LocalDate.parse("1999-12-31"); // aaaa-mm-dd
        System.out.println("Fecha 3: "+fecha3);

        // Extraer parte de una fecha con:
        System.out.println("Año: "+fecha1.getYear());
        System.out.println("Mes: "+fecha2.getMonth());
        System.out.println("Día: "+fecha2.getDayOfMonth());

        // Cambio del formato de las fechas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate fecha4 = LocalDate.parse("12/07/1999", formato);
        System.out.println("Fecha 4: "+fecha4);
        System.out.println("Fecha 4 formateada: "+fecha4.format(formato));

        System.out.println("\n*** Hora con LocalDate ***");

        LocalTime hora1 = LocalTime.now();
        System.out.println("Fecha 1: "+hora1);

        LocalTime hora2 = LocalTime.of(5,6,7);
        System.out.println("Fecha 2: "+hora2);

        LocalTime hora3 = LocalTime.parse("12:13:14");
        System.out.println("Fecha 3: "+hora3);

        // Extraer partes de la hora con :
        System.out.println("Hora: "+hora1.getHour());
        System.out.println("Minuto: "+hora2.getMinute());
        System.out.println("Segundo: "+hora3.getSecond());

        // Cambio de formato
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora4 = LocalTime.parse("09:56", formatoHora);
        System.out.println("Fecha 4: "+hora4);
        System.out.println("Fecha 4 formateada: "+hora4.format(formatoHora));


        Date fechaDate = new Date();



    }
}
