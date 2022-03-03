import java.util.Arrays;

public class Tarea {

    //    private String titulo;
//    private String description;
    private String[] informacion;
    private Tarea siguienteTarea;

    public Tarea(String titulo, String description) {
//        this.titulo = titulo;
//        this.description = description;
       informacion = new String[2];
       informacion[0]=titulo;
       informacion[1]=description;
    }

    public void enlazarSiguiente(Tarea siguienteTarea) {
        this.siguienteTarea = siguienteTarea;
    }

    public Tarea obtenerSiguienteTarea() {
        return siguienteTarea;
    }


    public void editarValor(String nuevoTitulo, String nuevaDescription) {
//        this.titulo=nuevoTitulo;
//        this.description=nuevaDescription;
       informacion[0]=nuevoTitulo;
       informacion[1]=nuevaDescription;
    }
    public String[] getInformacion() {
        return informacion;
    }

    @Override
    public String toString() {
        return
                "   Título: "+informacion[0]+", Descripción: "+informacion[1]+
                "\nSiguienteTarea: \n" + siguienteTarea;
    }
}
