public class Animal extends SeresVivos{

    public Animal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " empieza a comer");
    }
}
