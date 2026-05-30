public class Main {
    public static void main(String[] args) {


        Auto carro = new Auto("Toyota", "S56", 10000, 4);
        Moto moto = new Moto("Kawasaki", "Versys", 5000, 3);

        System.out.println("Costo de " + carro.marca + " " + carro.modelo + " : " + carro.calcularCosto());
        System.out.println("Costo de " + moto.marca + " " + moto.modelo + " : " + moto.calcularCosto());


    }
}
