import javax.swing.*;
import java.awt.*;

public class AplicacionDeTareas {
    static int select = -1;
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        lista.añadirTarea("Deber 1", "dx");

        while (select != 0) {

            String lectura = JOptionPane.showInputDialog(null,
                    "************************\nElige opción:\n" +
                            "1.- Ver Lista de Tareas\n" +
                            "2.- Añadir Tarea\n" +
                            "3.- Eliminar Última Tarea\n" +
                            "4.- Editar Tarea \n" +
                            "0.- Salir\n************************");
            //Recoger una variable por consola
            select = Integer.parseInt(lectura);

            //Switch case en Java
            switch (select) {
                case 1:
                    JOptionPane.showMessageDialog(null, lista
                    );
                    break;
                case 2:

                    JOptionPane.showMessageDialog(null, lista.añadirTarea(
                            JOptionPane.showInputDialog(null, "Nombre de la tarea: "),
                            JOptionPane.showInputDialog(null, "Descripción: ")));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, lista.eliminarTarea());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, lista.editarTarea(
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Número de tarea a editar: ")),
                            JOptionPane.showInputDialog(null, "Nombre de la tarea: "),
                            JOptionPane.showInputDialog(null, "Descripción: ")));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "VUELVA PRONTO <3");
                    break;
            }
        }
    }
}


