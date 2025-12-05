package ejercicio6;

public class RepositorioSQL implements IRepositorio {
    String[] guardar = new String[10]; // Array to simulate database storage

    @Override
    public void guardar(Object data) { // Method to save data
        for(int i = 0; i < guardar.length; i++){ 
            if (guardar[i] == null) { // Find the first empty position
                guardar[i] = data.toString(); // Save data as string
                System.out.println("SQL> INSERT INTO tabla (id, data) VALUES ('" + i + "', '" + data + "')");
                break;
            }else if (i == 9 && !(guardar[i] == null)) { // If array is full
                System.out.println("SQL Error [1205]: Error: no se puede insertar porque la tabla alcanzó su capacidad máxima." );
                break;
            }
        }
    }

    @Override
    public void leer(String id) { // Method to read data by id
        System.out.println("SQL> SELECT * FROM tabla WHERE id = '" + id + "';");
        System.out.println(guardar[Integer.parseInt(id)]); // Print the data at the given position
    }

    @Override
    public void eliminar(String id) { // Method to delete data by id
        System.out.println("SQL> DELETE FROM tabla WHERE id = '" + id + "';");
        guardar[Integer.parseInt(id)] = null; // Set the position to null to delete data
        System.out.println("1 row deleted.");
    }
}