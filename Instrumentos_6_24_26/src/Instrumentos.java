abstract class Instrumentos {

    private String nombre;
    private double precio;

    public Instrumentos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void tocar();

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}
