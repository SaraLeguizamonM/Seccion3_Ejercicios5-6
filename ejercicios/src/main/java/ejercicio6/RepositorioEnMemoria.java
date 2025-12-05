package ejercicio6;

public class RepositorioEnMemoria implements IRepositorio {
    String[] guardar = new String[10];

    @Override
    public void guardar(Object data) {
        for(int i = 0; i < guardar.length; i++){
            if (guardar[i] == null) {
                guardar[i] = data.toString();
                System.out.println("MEM> Se ha guardado en la posicion: " + i);
                break;
            }else if (i == 9 && !(guardar[i] == null)) {
                System.out.println("MEM> Error: Memoria llena" );
                break;
            }
        }
    }

    @Override
    public void leer(String id) {
        System.out.println("MEM> Leyendo posicion... " + id );
        System.out.println(guardar[Integer.parseInt(id)]);
    }

    @Override
    public void eliminar(String id) {
        System.out.println("MEM> Eliminando posicion... " + id );
        guardar[Integer.parseInt(id)] = null;
        System.out.println("Eliminado.");

    }
}
