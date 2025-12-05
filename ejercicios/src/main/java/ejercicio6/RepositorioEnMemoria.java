package ejercicio6;

public class RepositorioEnMemoria implements IRepositorio {
    String[] guardar = new String[10]; // Array to store data in memory

    @Override
    public void guardar(Object data) {  // Method to save data
        for(int i = 0; i < guardar.length; i++){
            if (guardar[i] == null) { // Find the first empty position
                guardar[i] = data.toString(); // Save data as string
                System.out.println("MEM> Se ha guardado en la posicion: " + i);
                break;
            }else if (i == 9 && !(guardar[i] == null)) { // If array is full
                System.out.println("MEM> Error: Memoria llena" );
                break;
            }
        }
    }

    @Override
    public void leer(String id) { // Method to read data by id
        System.out.println("MEM> Leyendo posicion... " + id );
        System.out.println(guardar[Integer.parseInt(id)]); // Print the data at the given position
    }

    @Override
    public void eliminar(String id) { // Method to delete data by id
        System.out.println("MEM> Eliminando posicion... " + id );
        guardar[Integer.parseInt(id)] = null; // Set the position to null to delete data
        System.out.println("Eliminado.");

    }
}
