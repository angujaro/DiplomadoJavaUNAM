
public class OperacionesBancarias {

    public static void main(String[] args) {
        int cuentaBancara;
        double monto;
        System.out.println("Operaciones bancarias");

        // Clase objeto = new Constructor (parámetros de entrada);



        int cuentaBancaria;
        System.out.println("Depósito a la cuenta de Rachel");
        System.out.println("Dame el número de cuenta: 111");
        cuentaBancaria = 111;
        monto = -200;
        Cuenta cuentaR = new Cuenta(cuentaBancaria);
        System.out.println("Cuenta encontrada: "+cuentaR);
        // Para aumentar el saldo en $100 a la cuenta


       if(cuentaR.depositar(monto)) {
           System.out.println("Operación realizada");
           System.out.println("Cuenta después del depósito: " + cuentaR);
       }else {
           System.out.println("ERROR 98R67");
       }

    }
}
