public class Bateria extends Instrumentos{

    public Bateria(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + " suena:");
        System.out.println("Golpe con palos... Budum Psssss");
        System.out.println("Precio: $" + getPrecio());
    }
}
