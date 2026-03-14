import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones {
    public static void main(String[] args) {
        System.out.println("*** Excepciones ***");
        int variable;
        int[] numeros = {9, -4, 0, 8, 10, 22};
        //               0   1   2  3  4   5
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        try{
            try {
                variable = teclado.nextInt();
            } catch (InputMismatchException e){
                System.out.println("El dato no corresponde a un entero");
                variable = 1; //valor por default
            }
            if (variable == 13) {
                MiExcepcion objeto = new MiExcepcion("Es de mala suerte usar el 13");
                throw objeto; // dispara o lanza el objeto de tipo MiExcepcion
            }
            System.out.println("Valor capturado: "+variable);
            System.out.println("1000/"+variable+"="+1000/variable);
            System.out.println("En el arreglo esa posición corresponde al "+ numeros[variable]);
            System.out.println("1000/"+numeros[variable] + " = "+ (1000/numeros[variable]));
        }
       catch (ArithmeticException e){
           System.out.println("---------------ArithmeticException--------------");
           System.out.println("Sucedió un problema con una operación aritmética");
           System.out.println("Vuelve a intentarlo más tarde");
       }
        catch (InputMismatchException b){
            System.out.println("---------------InputMismatchException--------------");
            System.out.println("Solo se permiten valores enteros");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("---------------ArrayIndexOutOfBoundsException--------------");
            System.out.println("Índice fuera de rango [0,5]");
            System.out.println("Prueba con un valor dentro del rango permitido");
        }
        catch (MiExcepcion e){
            System.out.println("Atrapé mi propia excepción");
        }
        catch (Exception e){
            System.out.println("Sucedió algo inesperado. Error 9845T");
            System.out.println("Contactar al Administrador");
            System.out.println(e);
        }
        finally { //Siempre se ejecuta (cuando sucede una excepción y cuando no
            System.out.println("¿Cuando sale este texto?");
            teclado.close();
        }
        System.out.println("-----------------Fin del programa-------------------");
        System.out.println("Fin del programa");

    }
}
