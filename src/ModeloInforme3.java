import javax.swing.table.*;
import java.sql.*;

public class ModeloInforme3 extends DefaultTableModel {
    ResultSet datos3;
    public ModeloInforme3(){
        this.addColumn("ID_Compra");
        this.addColumn("Constructora");
        this.addColumn("Banco_Vinculado");
        
        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite://C:/Users/Asus//Documents/ciclo2/reto5/ProyectosConstruccion.db");
            System.out.println("conexion abierta con la bd");

            Statement stmt = c.createStatement();

            String consulta3 = "SELECT ID_Compra as ID, Proyecto.Constructora, Proyecto.Banco_Vinculado as 'Financiado por' from compra join Proyecto on Compra.ID_Proyecto = Proyecto.ID_Proyecto where Proveedor == 'Homecenter' and Ciudad == 'Salento'";
            datos3 = stmt.executeQuery(consulta3);

            while(datos3.next()){
                Object [] fila = new Object[3];
                for(int i=0; i<3; i++){
                    fila[i] = datos3.getObject(i+1);
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