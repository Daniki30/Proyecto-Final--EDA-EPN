import javax.swing.*;
import java.awt.*;

public class AplicacionDeTareas {
    static int select = -1;
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        lista.añadirTarea("hacer deberes ","dx");
        lista.añadirTarea("1","dfadaf");
        lista.añadirTarea("1","2");
        lista.eliminarTarea();
        lista.editarTarea(0,"1","2121");
        System.out.println(lista);
        while(select != 0){

                String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Ver Lista de Tareas" +
                        "\n2.-Añadir Tarea\n" +
                        "3.- Eliminar Tarea\n" +
                        "4.- Editar Tarea \n" +
                        "0.- Salir\n************************");
                //Recoger una variable por consola
                select = Integer.parseInt(lectura);

                //Switch case en Java
                switch(select){
                    case 1:

                        JOptionPane.showMessageDialog(null,lista);

                        break;
                    case 2:

                        JOptionPane.showMessageDialog(null,"");

                        break;
                    case 3:

                        JOptionPane.showMessageDialog(null,"" );
                        break;
                    case 4:

                        JOptionPane.showMessageDialog(null,"");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"");break;
                }




        }
    }

}


