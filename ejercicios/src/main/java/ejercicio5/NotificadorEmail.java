package ejercicio5;

public class NotificadorEmail implements INotificador { // Implementing the INotificador interface
    @Override 
    public void enviar(String mensaje, String destinatorio) { // Overriding the "enviar" method
        System.out.println("Enviando correo a " +  destinatorio + "... el mensaje es: " + mensaje);
    }
    
}
