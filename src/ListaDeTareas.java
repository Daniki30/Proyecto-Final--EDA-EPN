public class ListaDeTareas {
    private Tarea primeraTarea;

    public ListaDeTareas() {
        primeraTarea = null;
    }

    public Object añadirTarea(String titulo, String description) {
        if (primeraTarea == null) {
            primeraTarea = new Tarea(titulo, description);
        }
        Tarea temp = primeraTarea;
        Tarea nuevaTarea = new Tarea(titulo, description);
        nuevaTarea.enlazarSiguiente(temp);
        primeraTarea = nuevaTarea;
        return null;
    }

    public Object eliminarTarea() {
        primeraTarea = primeraTarea.obtenerSiguienteTarea();
        return null;
    }

    public Object editarTarea(int indice, String nuevoTitulo, String nuevaDescription) {
        Tarea temporal = primeraTarea;
        for (int i = 0; i < indice-1; i++) {
            temporal = temporal.obtenerSiguienteTarea();
        }
        temporal.editarValor(nuevoTitulo, nuevaDescription);
        return null;
    }

    @Override
    public String toString() {
        return "********Lista De Tareas********\n" +
                "Primera tarea: \n" + primeraTarea;
    }
}
