public class CuentaCredito extends Cuenta{
    private double limiteCredito;
    private int diaCorte;
    private int mesCorte;
    private String numeroTarjeta;


    public CuentaCredito() {
        this.limiteCredito = 0;
        this.diaCorte = 0;
        this.mesCorte = 0;
        this.numeroTarjeta = "XXXXX";
    }

    public CuentaCredito(double saldo, int numeroCuenta, String clabe, double limiteCredito, int diaCorte, int mesCorte, String numeroTarjeta) {
        super(saldo, numeroCuenta, clabe);
        this.limiteCredito = limiteCredito;
        this.diaCorte = diaCorte;
        this.mesCorte = mesCorte;
        this.numeroTarjeta = numeroTarjeta;
    }
}
