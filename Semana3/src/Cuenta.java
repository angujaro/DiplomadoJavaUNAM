public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private String clabe;

    public Cuenta() {
        this.saldo = 0;
        this.numeroCuenta = 0000;
        this.clabe = "XXXX";
    }
    public Cuenta(double saldo, int numeroCuenta, String clabe) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.clabe = clabe;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", clabe='" + clabe + '\'' +
                '}';
    }
}
