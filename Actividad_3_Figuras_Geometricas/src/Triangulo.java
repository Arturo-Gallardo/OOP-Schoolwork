public class Triangulo extends Figura {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // usando la formula de heron

        double s = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(
                s * (s - lado1) * (s - lado2) * (s - lado3)
        );
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}