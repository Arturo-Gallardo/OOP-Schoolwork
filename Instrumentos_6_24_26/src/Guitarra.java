public class Guitarra extends Instrumentos{

    public Guitarra(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + " suena:");
        System.out.println("Rasgueo de cuerdas... DING DANG!");
        System.out.println("Precio: $" + getPrecio());
    }

}
