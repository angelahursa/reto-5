import javax.swing.table.*;
import java.sql.*;

public class ModeloInforme1 extends DefaultTableModel {
    ResultSet datos;
    public ModeloInforme1(){
        this.addColumn("ID_lider");
        this.addColumn("Nombre");
        this.addColumn("Primer_Apellido");
        this.addColumn("Ciudad_Residencia");
        
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite://C:/Users/Asus//Documents/ciclo2/reto5/ProyectosConstruccion.db");
            System.out.println("conexion abierta con la bd");

            Statement stmt = c.createStatement();

            String consulta = "SELECT ID_Lider as ID, Nombre, Primer_Apellido AS Apellido, Ciudad_Residencia as Residencia from Lider order by Ciudad_Residencia";
            datos = stmt.executeQuery(consulta);

            while(datos.next()){
                Object [] fila = new Object[4];
                for(int i=0; i<4; i++){
                    fila[i] = datos.getObject(i+1);
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