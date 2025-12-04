package ejercicio5;

public class NotificadorPush implements INotificador {
    @Override
    public void enviar(String mensaje, String destinatorio) {
        System.out.println("Enviando notificación push a " +  destinatorio + "... el mensaje es: " + mensaje);
    }
    
}
