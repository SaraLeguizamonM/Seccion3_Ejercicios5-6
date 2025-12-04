package ejercicio5;

public class NotificadorEmail {
    @Override
    public void enviar(String mensaje, String destinatorio) {
        System.out.println("Enviando correo a " +  destinatorio + "... el mensaje es: " + mensaje);
    }
    
}
