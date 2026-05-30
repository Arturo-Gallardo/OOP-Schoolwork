public class Rectangulo extends Figura{

    private int height;
    private int width;

    public Rectangulo(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcularArea() {
        return height * width;
    }

    @Override
    public double calcularPerimetro() {
        return (height * 2) + (width * 2);
    }
}
