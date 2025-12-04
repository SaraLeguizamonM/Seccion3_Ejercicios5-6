package ejercicio5;
import java.util.List;

public class GestorDeAlertas {
    private List<INotificador> notificadores;

    public GestorDeAlertas(List<INotificador> notificadores) {
        this.notificadores = notificadores;

    }
    public void dispararAlertaMaxima(String mensaje, String destinatario) {
        for (int i = 0; i < notificadores.size(); i++) {
            INotificador notificador = notificadores.get(i);
            notificador.enviar(mensaje, destinatario);
        }
    }
}
