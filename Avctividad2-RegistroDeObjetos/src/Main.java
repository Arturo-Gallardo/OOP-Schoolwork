import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalHombres = 0;
        int totalMujeres = 0;
        int totalMenores = 0;
        int totalAdultos = 0;

        System.out.println("Cuantas personas desea registrar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Persona " + (i + 1));

            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Genero (Hombre/Mujer): ");
            String genero = sc.nextLine();

            personas[i] = new Persona(nombre, edad, genero);

            if (genero.equalsIgnoreCase("Hombre")) {
                totalHombres++;
            } else if (genero.equalsIgnoreCase("Mujer")) {
                totalMujeres++;
            }

            if (edad <= 18) {
                totalMenores++;
            }

            if (edad >= 18) {
                totalAdultos++;
            }

            System.out.println();
        }

        System.out.println("Lista de personas registradas:");
        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println();
        }

        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Total de menores: " + totalMenores);
        System.out.println("Total de adultos: " + totalAdultos);

        sc.close();
    }
}
