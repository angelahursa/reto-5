import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class InformeProyectosFrame extends JFrame {
    InformeProyectosFrame(){

        TablaInforme3 tabla = new TablaInforme3();

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(239, 154, 154));
        panelPrincipal.add(tabla, BorderLayout.CENTER);

        add(panelPrincipal);

        setTitle("Informe Proyectos");

        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(1000, 600);
    }
}