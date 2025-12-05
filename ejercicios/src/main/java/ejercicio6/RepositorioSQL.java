package ejercicio6;

public class RepositorioSQL implements IRepositorio {
    String[] guardar = new String[10];

    @Override
    public void guardar(Object data) {
        for(int i = 0; i < guardar.length; i++){
            if (guardar[i] == null) {
                guardar[i] = data.toString();
                System.out.println("SQL> INSERT INTO tabla (id, data) VALUES ('" + i + "', '" + data + "')");
                break;
            }else if (i == 9 && !(guardar[i] == null)) {
                System.out.println("SQL Error [1205]: Error: no se puede insertar porque la tabla alcanzó su capacidad máxima." );
                break;
            }
        }

    }
    @Override
    public void leer(String id) {
        System.out.println("SQL> SELECT * FROM tabla WHERE id = '" + id + "';");
        System.out.println(guardar[Integer.parseInt(id)]);

    }
    @Override
    public void eliminar(String id) {
        System.out.println("SQL> DELETE FROM tabla WHERE id = '" + id + "';");
        guardar[Integer.parseInt(id)] = null;
        System.out.println("1 row deleted.");
    }
}

