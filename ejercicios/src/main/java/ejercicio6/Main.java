package ejercicio6;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion = " ";
        String id;

        RepositorioEnMemoria repositorioMemoria = new RepositorioEnMemoria();
        RepositorioSQL repositorioSQL = new RepositorioSQL();

        do{
            System.out.println("Bienvenido al sistema de repositorio de datos");
            System.out.println("Que desea hacer?");
            System.out.println("1. Repositorio de datos");
            System.out.println("2. Repositorio de memoria");

            String tipo;

            do {
                tipo = sc.nextLine();

                switch (tipo) {
                    case "1":
                        do{
                            System.out.println("Que quieres hacer?");
                            System.out.println("1. Guardar");
                            System.out.println("2. Leer");
                            System.out.println("3. Eliminar");

                            String opciones;
                            do {
                                opciones = sc.nextLine();
                                switch (opciones) {

                                    case "1":
                                        System.out.println("Ingresa lo que desea guardar");
                                        String datos = sc.nextLine();
                                        repositorioSQL.guardar(datos);
                                        break;
                                    case "2":
                                        System.out.println("Ingresa el id de lo que desea leer");
                                        id = sc.nextLine();
                                        repositorioSQL.leer(id);
                                        break;
                                    case "3":
                                        System.out.println("Ingresa el id de lo que desea eliminar");
                                        id = sc.nextLine();
                                        repositorioSQL.eliminar(id);
                                        break;
                                    default:
                                        System.out.println("Opción inválida, vuelve a intentar.");
                                }
                            }while(!opciones.equals("1") && !opciones.equals("2") && !opciones.equals("3"));
                            System.out.println("¿Desea hacer otra cosa? (si/no)");
                            opcion = continuar();

                        }while(opcion.equals("si"));
                        break;
                    case "2":
                        do{
                            System.out.println("Que quieres hacer?");
                            System.out.println("1. Guardar");
                            System.out.println("2. Leer");
                            System.out.println("3. Eliminar");

                            String opciones;
                            do {
                                opciones = sc.nextLine();
                                switch (opciones) {

                                    case "1":
                                        System.out.println("Ingresa lo que desea guardar");
                                        String datos = sc.nextLine();
                                        repositorioMemoria.guardar(datos);
                                        break;
                                    case "2":
                                        System.out.println("Ingresa el id de lo que desea leer");
                                        id = sc.nextLine();
                                        repositorioMemoria.leer(id);
                                        break;
                                    case "3":
                                        System.out.println("Ingresa el id de lo que desea eliminar");
                                        id = sc.nextLine();
                                        repositorioMemoria.eliminar(id);
                                        break;
                                    default:
                                        System.out.println("Opción inválida, vuelve a intentar.");
                                }
                            }while(!opciones.equals("1") && !opciones.equals("2") && !opciones.equals("3"));
                            System.out.println("¿Desea hacer otra cosa? (si/no)");
                            opcion = continuar();

                        }while(opcion.equals("si"));
                        break;
                    default:
                        System.out.println("Opción inválida, vuelve a intentar.");
                }

            } while (!tipo.equals("1") && !tipo.equals("2"));

            System.out.println("¿Desea cambiar de repositorio? (si/no)");
            opcion = continuar();

        }while (opcion.equals("si"));

    }

    public static String continuar(){
        String opcion;
        do {
            opcion = sc.nextLine().toLowerCase();

            if (!opcion.equals("si") && !opcion.equals("no")) {
                System.out.println("Opción inválida, por favor coloca una opción válida");
            }

        } while (!opcion.equals("si") && !opcion.equals("no"));
        return opcion;
    }
}
