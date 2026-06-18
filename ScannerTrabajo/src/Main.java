import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa nombre: ");
        String nombreCapturado = teclado.nextLine();
        System.out.println("Ingresa edad: ");
        int edadCapturado = teclado.nextInt();
        System.out.println();

        Usuario usuario1 = new Usuario(nombreCapturado, edadCapturado);
        usuario1.mostrarDatos();

    }

}
