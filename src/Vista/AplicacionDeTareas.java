package Vista;

import javax.swing.*;
import java.awt.*;

public class AplicacionDeTareas {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Aplicacion de tareas");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,1000);
    frame.getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy=0;
    gbc.gridwidth=3;
    gbc.gridheight=6;
    gbc.weightx=1.0;
    gbc.weighty = 1.0;
    }

}
