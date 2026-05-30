public class Main {
    public static void main(String[] args) {

//        Empleado empleado1 = new Empleado("Angel", 1000);
        EmpleadoVendedor empleado2 = new EmpleadoVendedor("Carlos", 5000, 2000);
        EmpleadoRepartidor empleado3 = new EmpleadoRepartidor("Ana", 4000, 10);

//        System.out.println(empleado1.calcularSalario());
        System.out.println("Salario vendedor: " + empleado2.calcularSalario());
        System.out.println("Salario repartidor: " + empleado3.calcularSalario());

    }
}