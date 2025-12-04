package ejercicio5;

public class NotificadorSMS implements INotificador { // Implementing the INotificador interface
    @Override
    public void enviar(String mensaje, String destinatorio) { // Overriding the "enviar" method
        System.out.println("Enviando SMS a " +  destinatorio + "... el mensaje es: " + mensaje);
    }

}
