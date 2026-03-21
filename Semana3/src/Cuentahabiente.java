public class Cuentahabiente {
    private String domicilio;
    private String rfc;
    private Cuenta[] cuentas;

    public Cuentahabiente(){
        this.domicilio = "XXXX";
        this.rfc = "XXX";
        Cuenta cuenta = new Cuenta();
        this.cuentas = new Cuenta[]{cuenta};
    }
    public Cuentahabiente(String domicilio, String rfc, Cuenta[] cuentas) {
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.cuentas = cuentas;
    }
}
