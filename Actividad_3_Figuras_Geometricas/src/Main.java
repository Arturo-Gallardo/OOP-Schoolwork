public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(4, 2);
        Circulo circulo = new Circulo(6);
        Triangulo triangulo = new Triangulo(4, 5, 6);

        System.out.printf("Cuadrado Area: %.2f%n", cuadrado.calcularArea());
        System.out.printf("Cuadrado Perimetro: %.2f%n", cuadrado.calcularPerimetro());

        System.out.println();

        System.out.printf("Rectangulo Area: %.2f%n", rectangulo.calcularArea());
        System.out.printf("Rectangulo Perimetro: %.2f%n", rectangulo.calcularPerimetro());

        System.out.println();

        System.out.printf("Circulo Area: %.2f%n", circulo.calcularArea());
        System.out.printf("Circulo Perimetro: %.2f%n", circulo.calcularPerimetro());

        System.out.println();

        System.out.printf("Triangulo Area: %.2f%n", triangulo.calcularArea());
        System.out.printf("Triangulo Perimetro: %.2f%n", triangulo.calcularPerimetro());

    }
}
