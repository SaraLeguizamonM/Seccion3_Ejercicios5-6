package ejercicio6;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        IRepositorio repo; // Declare the repository interface

        do {
            System.out.println("Bienvenido al sistema de repositorio de datos");
            System.out.println("Seleccione tipo de repositorio:");
            System.out.println("1. SQL> Repositorio de datos ");
            System.out.println("2. Memoria> Repositorio de memoria");

            String tipo = sc.nextLine();

            if (tipo.equals("1")) { // If user selects repository
                repo = new RepositorioSQL(); // Create SQL repository
            } else {
                repo = new RepositorioEnMemoria(); // Create memory repository
            }

            do {
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Guardar");
                System.out.println("2. Leer");
                System.out.println("3. Eliminar");

                String op = sc.nextLine();

                switch (op) {
                    case "1":
                        System.out.println("Ingresa lo que deseas guardar:");
                        repo.guardar(sc.nextLine()); // Save the input data
                        break;
                    case "2":
                        System.out.println("Ingresa el id a leer:");
                        repo.leer(sc.nextLine()); // Read data by id
                        break;
                    case "3":
                        System.out.println("Ingresa el id a eliminar:");
                        repo.eliminar(sc.nextLine()); // Delete data by id
                        break;
                    default:
                        System.out.println("Opción inválida, vuelve a intentar.");
                }

                System.out.println("¿Desea continuar con este repositorio? (si/no)");
                opcion = continuar(); // Validate user input

            } while (opcion.equals("si"));

            System.out.println("¿Desea cambiar de repositorio? (si/no)");
            opcion = continuar();

        } while (opcion.equals("si"));
    }

    // Method to validate user input

    public static String continuar() { // Method to validate user input
        String opcion;
        do {
            opcion = sc.nextLine().toLowerCase();
            if (!opcion.equals("si") && !opcion.equals("no")) { // If input is invalid
                System.out.println("Opción inválida, vuelve a intentar.");
            }
        } while (!opcion.equals("si") && !opcion.equals("no")); // Repeat until valid input
        return opcion;
    }
}
