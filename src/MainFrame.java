import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainFrame extends JFrame {
    MainFrame(){

        JMenuBar mb = new JMenuBar();
        JMenu menuInformes = new JMenu("Ver informes");
        mb.add(menuInformes);
        JMenuItem iteminforme1 = new JMenuItem("Informe 1");
        JMenuItem iteminforme2 = new JMenuItem("Informe 2");
        JMenuItem iteminforme3 = new JMenuItem( "Informe 3");
        menuInformes.add(iteminforme1);
        menuInformes.add(iteminforme2);
        menuInformes.add(iteminforme3);

        setLayout(new BorderLayout());
        add(mb, BorderLayout.NORTH);

        iteminforme1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                InformeLideresFrame ventanaInforme1 = new InformeLideresFrame();
            }});

        setVisible(true);
        setSize(500, 500);

        iteminforme2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                InformeProveedoresFrame ventanaInforme2 = new InformeProveedoresFrame();
            }});

        setVisible(true);
        setSize(500, 500);

        iteminforme3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                InformeProyectosFrame ventanaInforme3 = new InformeProyectosFrame();
            }});

        setVisible(true);
        setSize(500, 500);


    }


    public static void main(String[] args) throws Exception {
        MainFrame ventana = new MainFrame();
    }
}








