import javax.swing.*;
import java.awt.*;

public class TablaInforme1 extends JPanel {
    ModeloInforme1 modelo = new ModeloInforme1();
    public TablaInforme1(){
        setLayout(new BorderLayout());
        JTable tabla = new JTable(modelo);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
    }

}
    