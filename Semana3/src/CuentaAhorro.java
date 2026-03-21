public class CuentaAhorro extends Cuenta{
    private double interes;

    public CuentaAhorro() {
        super();
        this.interes = 0;
    }

    public CuentaAhorro(double saldo, int numeroCuenta, String clabe, double interes) {
        super(saldo, numeroCuenta, clabe);
        this.interes = interes;
    }
}
