public class Estudiante {
    private String nombre;
    private double calificacion;

    // constructor
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    //metodo setCalif
    public void setCalificacion(double nuevaCalif) {
        this.calificacion = nuevaCalif;
    }

    //get nombre

    //metodo haAprobado
    public boolean haAprovado() {
        return this.calificacion >= 6.0;
    }

    //mostrar info
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Ha aprovado?: " + (haAprovado() ? "Si" : "No"));
        System.out.println("--------------------------");

    }

}
