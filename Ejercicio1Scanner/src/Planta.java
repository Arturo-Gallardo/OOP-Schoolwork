public class Planta extends SeresVivos{

    public Planta(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " empieza fotosintesis");
    }
}
