public class CuentaDebito extends Cuenta{
    private String numeroTarjeta;

    public CuentaDebito() {
        this.numeroTarjeta = "XXXXX";
    }

    public CuentaDebito(double saldo, int numeroCuenta, String clabe, String numeroTarjeta) {
        super(saldo, numeroCuenta, clabe);
        this.numeroTarjeta = numeroTarjeta;
    }
}
