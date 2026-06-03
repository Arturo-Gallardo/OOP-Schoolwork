public class ServicioSubscripcion extends Servicio{

    protected int meses;


    public ServicioSubscripcion(String nombre, double costoBase, int meses) {
        super(nombre, costoBase);
        this.meses = meses;
    }

    @Override
    public double calcularCosto() {
        return costoBase * meses;
    }
}
