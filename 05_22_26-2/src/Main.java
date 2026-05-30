public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Juan", 5000);

        System.out.println(c1.getSaldo());
        c1.depositar(2000);
        System.out.println(c1.getSaldo());
        c1.retirar(1000);
        System.out.println(c1.getSaldo());

    }
}
