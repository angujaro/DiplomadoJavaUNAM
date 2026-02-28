public class Condicionales {
    public static void main(String[] args) {
        System.out.println("*** Condicionales ***");
        System.out.println("*** if/ if-else");
        int edad = 20;
        char genero = 'M';

        System.out.println("Hola, tienes "+edad+ " años y tu genero es: "+genero);
        // if
        if( edad < 18) {
            System.out.println("Felicidades, aún no tienes que pagar impuestos");
            System.out.println("Y además, tienes más tiempo libre");
        }
        System.out.println("Fin del programa");

        //if-else
        System.out.println(" ");
        System.out.println("** if/else **");
        if (edad >= 18) {
            System.out.println("Felicidades, ya puedes votar y ser votado");
            System.out.println("Y te pagan si trabajas");
            if( genero == 'M'){
                System.out.println("Por cierto, tienes que hacer el SMN");
            } else{
                System.out.println("Ademas, no tienes obligación de hacer el SMN");
            }
        }else {
            System.out.println("Felicidades, todavía no tienes que pagar impuestos");
        }

        System.out.println(" ");
        System.out.println("** Switch**");
        edad = 12;
        switch (edad){
            case 4: //¿edad == 4?
                System.out.println("Debes inscribirte al preescolar");
                break;
            case 6: //¿edad == 6?
                System.out.println("Debes ahora inscribirte a la primaria");
                break;
            case 12: //¿edad == 12?
                System.out.println("Ahora debes inscribirte a la secuendaria");
                break;
            default:
                System.out.println("Por lo pronto no debes inscribirte a nada, sigue estudiando");
                break;
        }

        System.out.println(" ");
        System.out.println("** Switch como expresión**");

        String resultado;
        resultado = switch (edad){
            case 4 -> "Kinder";
            case 6 -> "Educación básica (primaria)";
            case 12 -> "Educación básica (secundaria)";
            case 15 -> "Bachillerato";
            default -> "NADA";
        };
        System.out.println("Debes iniciar el trámite para entrar a: "+resultado);

    }}
