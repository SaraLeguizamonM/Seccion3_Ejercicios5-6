package ejercicio5;
import java.util.List;

public class GestorDeAlertas {
    private List<INotificador> notificadores; // List to hold different notifiers

    public GestorDeAlertas(List<INotificador> notificadores) { // Constructor to initialize the notifiers list
        this.notificadores = notificadores;

    }
    public void dispararAlertaMaxima(String mensaje, String destinatario) { // Method to send alert using all notifiers
        for (int i = 0; i < notificadores.size(); i++) {
            INotificador notificador = notificadores.get(i);
            notificador.enviar(mensaje, destinatario);
        }
    }
}
