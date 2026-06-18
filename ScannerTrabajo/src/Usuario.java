public class Usuario {

    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Datos del usuario:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

}
