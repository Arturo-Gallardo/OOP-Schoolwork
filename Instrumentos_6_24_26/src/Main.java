public class Main {
    public static void main(String[] args) {

        Instrumentos[] orquesta = {
                new Guitarra("Fender Stratocaster", 1200.0),
                new Bateria("Yamaha Stage Custom", 2500.0),
        };

        System.out.println("=== DEMOSTRACION DE ABSTRACCION BASICA === ");
        for (Instrumentos i : orquesta) {
            i.tocar();
            System.out.println();
        }

    }
}
