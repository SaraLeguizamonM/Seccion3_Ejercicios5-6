package ejercicio6;

public class RepositorioEnMemoria implements IRepositorio {
    String[] guardar = new String[10];

    @Override
    public void guardar(Object data) {
        for(int i = 0; i < guardar.length; i++){
            if (guardar[i] == null) {
                guardar[i] = data.toString();
                System.out.println("Se ha guardado en la posicion: " + i);
            }else if (i == 9 && !(guardar[i] == null)) {
                System.out.println("Error: Memoria llena" );
                break;
            }
        }

    }

    @Override
    public void leer(String id) {

    }

    @Override
    public void eliminar(String id) {

    }
}
