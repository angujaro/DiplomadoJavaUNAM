public class Empresa extends Cuentahabiente{
    private String razonSocial;
    private String apoderadoLegal;

    public Empresa() {
        this.razonSocial = "XXXX";
        this.apoderadoLegal = "XXXXX";
    }

    public Empresa(String domicilio, String rfc, Cuenta[] cuentas, String razonSocial, String apoderadoLegal) {
        super(domicilio, rfc, cuentas);
        this.razonSocial = razonSocial;
        this.apoderadoLegal = apoderadoLegal;
    }
}

