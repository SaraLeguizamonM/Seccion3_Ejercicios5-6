package ejercicio6;

public class RepositorioSQL implements IRepositorio {
    String[] guardar = new String[10];

    @Override
    public void guardar(Object data) {
        for(int i = 0; i < guardar.length; i++){
            if (guardar[i] == null) {
                guardar[i] = data.toString();
                System.out.println(" INSERT INTO tabla (id, data) VALUES ('" + i + "', '" + data + "')");
            }else if (i == 9 && !(guardar[i] == null)) {
                System.out.println("SQL Error [1205]: Error: no se puede insertar porque la tabla alcanzó su capacidad máxima." );
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

