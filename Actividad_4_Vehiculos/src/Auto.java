public class Auto extends Vehiculo{

    private int numbPuertas;


    public Auto(String marca, String modelo, double costoBase, int numbPuertas) {
        super(marca, modelo, costoBase);
        this.numbPuertas = numbPuertas;
    }

    @Override
    public double calcularCosto() {
        return costoBase + (numbPuertas * 100);
    }
}
