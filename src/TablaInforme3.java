import javax.swing.*;
import java.awt.*;

public class TablaInforme3 extends JPanel {
    ModeloInforme3 modelo = new ModeloInforme3();
    public TablaInforme3(){
        setLayout(new BorderLayout());
        JTable tabla = new JTable(modelo);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
    }

}
    