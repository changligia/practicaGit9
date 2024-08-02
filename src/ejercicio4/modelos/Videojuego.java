package ejercicio4.modelos;

public class Videojuego {
    private final String nombre;
    private final int ano;
    private final double precio;
    private final int duracion;
    private final Genero genero;
    private final Empresa empresa;

    public Videojuego(String nombre, int ano, double precio, int duracion, Genero genero, Empresa empresa) {
        this.nombre = nombre;
        this.ano = ano;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", ano=" + ano +
                ", precio=" + precio +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", empresa=" + empresa +
                '}';
    }

    public enum Genero {
        ACCION,
        COMEDIA,
        TERROR
    }

    public enum Empresa {
        PLAYSTATION,
        NINTENDO,
        XBOX
    }

    public String getNombre() {
        return nombre;
    }
}
