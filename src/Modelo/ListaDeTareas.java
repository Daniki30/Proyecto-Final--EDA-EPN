package Modelo;

public class ListaDeTareas {
    private Tarea primeraTarea;

    public ListaDeTareas() {
        primeraTarea = null;
    }

    // TODO: 25/2/2022 refactorizar despues
    public void añadirTarea(String titulo, String description) {
        if (primeraTarea == null) {
            primeraTarea = new Tarea(titulo, description);
        }
        Tarea temp = primeraTarea;
        Tarea nuevaTarea = new Tarea(titulo, description);
        nuevaTarea.enlazarSiguiente(temp);
        primeraTarea = nuevaTarea;

    }

    public void eliminarTarea() {
        primeraTarea = primeraTarea.obtenerSiguienteTarea();
    }

    public void editarTarea(int indice, String nuevoTitulo, String nuevaDescription) {
        Tarea temporal = primeraTarea;
        for (int i = 0; i < indice; i++) {
            temporal = temporal.obtenerSiguienteTarea();
        }
        temporal.editarValor(nuevoTitulo, nuevaDescription);

    }

    @Override
    public String toString() {
        return "ListaDeTareas{" +
                "primeraTarea=" + primeraTarea +
                '}';
    }
}
