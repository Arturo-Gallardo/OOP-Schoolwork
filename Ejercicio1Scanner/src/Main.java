import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos seres vivos deseas designar?");
        int cantidad = sc.nextInt();

        SeresVivos[] entidades = new SeresVivos[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Animal(1) o Planta?(2): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Nombre?: ");
            String nombre = sc.nextLine();

            System.out.println("Edad?: ");
            int edad = sc.nextInt();

            if (tipo == 1) {
                entidades[i] = new Animal(nombre, edad);
            } else if (tipo == 2) {
                entidades[i] = new Planta(nombre, edad);
            } else {
                System.out.println("Tipo invalido");
                i--;
            }
        }

        for (SeresVivos entidad : entidades) {
            String tipo;

            if (entidad instanceof Animal) {
                tipo = "Animal";
            } else if (entidad instanceof Planta) {
                tipo = "Planta";
            } else {
                tipo = "Desconocido";
            }

            System.out.println(tipo + ": " + entidad.nombre + " tiene " + entidad.edad + " años");
        }

        for (SeresVivos entidad1: entidades) {
            entidad1.realizarAccion();
        }

        sc.close();
    }
}
