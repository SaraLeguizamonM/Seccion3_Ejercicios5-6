package ejercicio5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            List<INotificador> lista = new ArrayList<>(); // List for save the selected of notifiers

            System.out.println("Bienvenido al servicio de notificaciones múltiples");
            System.out.println("Selecciona el tipo de notificación:");
            System.out.println("1. Tipo Email");
            System.out.println("2. Tipo SMS");
            System.out.println("3. Tipo Push");

            String tipo;

            do {
                tipo = sc.nextLine();

                switch (tipo) {
                    case "1":
                        lista.add(new NotificadorEmail()); // Add Email notifier
                        break;
                    case "2":
                        lista.add(new NotificadorSMS()); // Add SMS notifier
                        break;
                    case "3":
                        lista.add(new NotificadorPush()); // Add Push notifier
                        break;
                    default:
                        System.out.println("Opción inválida, vuelve a intentar.");
                        tipo = "";
                }

            } while (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3"));

            GestorDeAlertas gestor = new GestorDeAlertas(lista); // Create the Alert Manager with the selected notifiers

            System.out.print("Ingresa el mensaje: ");
            String mensaje = sc.nextLine();

            System.out.print("Ingresa el destinatario: ");
            String destinatario = sc.nextLine();
            System.out.println(" ");

            gestor.dispararAlertaMaxima(mensaje, destinatario);
            System.out.println(" ");

            do {
                System.out.println("¿Quieres enviar otro tipo? (si/no)"); // Ask if the user wants to send another notification
                opcion = sc.nextLine().toLowerCase();

                if (!opcion.equals("si") && !opcion.equals("no")) {
                    System.out.println("Opción inválida, por favor coloca una opción válida");
                }

            } while (!opcion.equals("si") && !opcion.equals("no"));

        } while (opcion.equals("si"));

        sc.close();
    }
}
