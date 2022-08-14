import javax.swing.table.*;
import java.sql.*;

public class ModeloInforme2 extends DefaultTableModel {
    ResultSet datos2;
    public ModeloInforme2(){
        this.addColumn("ID_Proyecto");
        this.addColumn("Constructora");
        this.addColumn("Numero_Habitaciones");
        this.addColumn("Ciudad");
        
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite://C:/Users/Asus//Documents/ciclo2/reto5/ProyectosConstruccion.db");
            System.out.println("conexion abierta con la bd");

            Statement stmt = c.createStatement();

            String consulta2 = "select ID_Proyecto as ID, Constructora, Numero_Habitaciones, Ciudad from Proyecto where Clasificacion == 'Casa Campestre' and ciudad in ('Santa Marta', 'Barranquilla', 'Cartagena')";
            datos2 = stmt.executeQuery(consulta2);

            while(datos2.next()){
                Object [] fila = new Object[4];
                for(int i=0; i<4; i++){
                    fila[i] = datos2.getObject(i+1);
                }
                this.addRow(fila);
            }

            stmt.close();
            c.close();
            System.out.println("la consulta ha sido un exito");
        }
        catch (Exception e){
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            
        }
    }
}