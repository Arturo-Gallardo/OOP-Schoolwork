public class Main {
    public static void main(String[] args) {

        double distanciaKm = 1200;

        Camion camion = new Camion("CAM-123");
        AvionCarga avionCarga = new AvionCarga("AVN-456");

        System.out.printf("Camion %s tiempo de viaje: %.2f horas%n",
                camion.getMatricula(),
                camion.calcularTiempoViaje(distanciaKm));

        System.out.printf("Avion de carga %s tiempo de viaje: %.2f horas%n",
                avionCarga.getMatricula(),
                avionCarga.calcularTiempoViaje(distanciaKm));
    }
}
