
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

        System.out.println("Retiro a la cuenta de Ross");
        System.out.println("Dame el número de cuenta: 222");
        System.out.println("Cuanto retira?: $8000");

        cuentaBancaria = 222;
        monto = 80000;
        //Si monto se cambia a private, ya no se puede modificar el valor desde aqui
        Cuenta cuentaRoss = new Cuenta (cuentaBancaria);
        System.out.println("Tienes la cuenta numero: "+cuentaRoss.getId());
        System.out.println("Cuenta original: "+cuentaRoss);
        if(cuentaRoss.retirar(monto)){
            System.out.println("Retiro realizado");
            System.out.println(cuentaRoss);
        } else {
            System.out.println("ERROR P45F");
        }

        Cuenta cuentaNueva = new Cuenta();
        System.out.println("Cuenta nueva: "+ cuentaNueva);
        cuentaNueva.setId(8000);
        System.out.println("Cuenta modificada: "+cuentaNueva);

        System.out.println("** Transferencia de $5000 de Rachel a Ross**");
        monto = 500;

        // Forma 1 (Reutilizando)
        if(cuentaR.retirar(monto) && cuentaRoss.depositar(monto)) {
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Transacción rechazada");
        }

        System.out.println("La cuenta de Rachel quedó con $"+cuentaR.getSaldo());
        System.out.println("La cuenta de Ross quedó con $"+cuentaRoss.getSaldo());

        // Froma 2 (implementar el metodo transferir)
        //Transferir un monto ($) de una cuenta origen a otra destino
        monto = 33000;
        System.out.println(cuentaR.transferirA(cuentaRoss, monto));



    }
}
