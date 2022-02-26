package Modelo;


public class Tarea {
    private String titulo;
    private String description;
    private Tarea siguienteTarea;

    public Tarea(String titulo, String description) {
        this.titulo = titulo;
        this.description = description;
    }

    public void enlazarSiguiente(Tarea siguienteTarea) {
        this.siguienteTarea = siguienteTarea;
    }

    public Tarea obtenerSiguienteTarea() {
        return siguienteTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", description='" + description + '\'' +
                ", siguienteTarea=" + siguienteTarea +
                '}';
    }
    //*:")
    public void editarValor(String nuevoTitulo, String nuevaDescription) {
        this.titulo=nuevoTitulo;
        this.description=nuevaDescription;
    }
}
