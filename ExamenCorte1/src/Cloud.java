public class Cloud extends ServicioEmpresarial{

    private int almacenamiento;
    private TipoEmpresa tipoEmpresa;

    public Cloud(String nombre, double costoBase, int empleados, TipoEmpresa tipoEmpresa) {
        super(nombre, costoBase, empleados);
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public double calcularCosto() {
        double costo = 0;

        costo = costoBase + (almacenamiento * 5);

        if (tipoEmpresa == TipoEmpresa.Corporativo) {
            costo = costo + 500;
        }

        return costo;
    }
}
