package ejercicio6;

public interface IRepositorio {
    public void guardar(Object data); // Method to save data
    public void leer(String id); // Method to read data by id
    public void eliminar(String id); // Method to delete data by id
}
