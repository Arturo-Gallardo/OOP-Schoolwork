public class Main {
    public static void main(String[] args) {

        ServicioSubscripcion subscripcion = new ServicioSubscripcion("Subscripcion basica", 100, 2);
        ServicioEmpresarial empresarial = new ServicioEmpresarial("Servicio empresarial", 500, 10);
        Streaming streaming = new Streaming("Netflix", 200, 2, 2, true);
        Musica musica = new Musica("Spotify", 150, 2, Calidad.alta);
        Cloud cloud = new Cloud("Icloud", 300, 30, TipoEmpresa.Corporativo);

        Servicio[] servicios = {subscripcion, empresarial, streaming, musica, cloud};

//      por cada servicio de la clase Servicio en la lista servicios, corre el codigo
        for (Servicio servicio : servicios) {
            System.out.println(servicio.nombre + ": $" + servicio.calcularCosto());
        }

    }
}
