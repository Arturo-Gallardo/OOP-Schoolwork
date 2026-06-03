public class Streaming extends ServicioSubscripcion{

    private int pantallas;
    private boolean premiumExtra;

    public Streaming(String nombre, double costoBase, int meses, int pantallas, boolean premiumExtra) {
        super(nombre, costoBase, meses);
        this.pantallas = pantallas;
        this.premiumExtra = premiumExtra;
    }

    @Override
    public double calcularCosto() {
        double costo = 0;

        costo = costoBase + (pantallas * 50);

        if (premiumExtra) {
            costo = costo + 100;
        }

        return costo;
    }
}
