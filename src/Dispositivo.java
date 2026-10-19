public class Dispositivo {
    private String nombre;
    private String tipo;
    private int id;

    // Atributo static (compartido por toda la clase)
    private static int contador = 0;

    // Constructor
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;         // Incrementa el contador cada vez que se crea un objeto
        this.id = contador; // Asigna un ID automático basado en el contador (Desafío adicional)
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    // Método static para consultar el total de objetos creados
    public static int getTotalCreados() {
        return contador;
    }
}
