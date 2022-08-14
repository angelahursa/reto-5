import javax.swing.*;
import java.awt.*;

public class TablaInforme2 extends JPanel {
    ModeloInforme2 modelo = new ModeloInforme2();
    public TablaInforme2(){
        setLayout(new BorderLayout());
        JTable tabla = new JTable(modelo);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
    }

}
    