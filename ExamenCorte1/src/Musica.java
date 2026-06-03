public class Musica extends ServicioSubscripcion{

    private Calidad calidad;

    public Musica(String nombre, double costoBase, int meses, Calidad calidad) {
        super(nombre, costoBase, meses);
        this.calidad = calidad;
    }

    @Override
    public double calcularCosto() {
        double costo = 0;

        switch (calidad) {

            case baja:
                costo = costoBase + (50 * meses);
                break;
            case media:
                costo = costoBase + (100 * meses);
                break;
            case alta:
                costo = costoBase + (150 * meses);
                break;
            case premium:
                costo = costoBase + (200 * meses);
                break;
        }
        return costo;
    }
}
