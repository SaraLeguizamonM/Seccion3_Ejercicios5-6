package ejercicio5;

public class NotificadorSMS implements INotificador {
    @Override
    public void enviar(String mensaje, String destinatorio) {
        System.out.println("Enviando SMS a " +  destinatorio + "... el mensaje es: " + mensaje);
    }

    
}
