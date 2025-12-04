package ejercicio5;

public class NotificadorPush implements INotificador { // Implementing the INotificador interface
    @Override
    public void enviar(String mensaje, String destinatorio) { // Overriding the "enviar" method
        System.out.println("Enviando notificación push a " +  destinatorio + "... el mensaje es: " + mensaje);
    }
    
}
