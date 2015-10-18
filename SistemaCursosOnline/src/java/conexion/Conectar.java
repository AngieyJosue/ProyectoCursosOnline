package conexion;
import javax.swing.*;

public class Conectar {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public Conectar() {
        try {
            this.driver="com.mysql.jdbc.Driver";
            this.url="jdbc:mysql://localhost:3306/cursosonline";
            this.user="root";
            this.pass="Itca123";  
            JOptionPane.showMessageDialog(null, "Conexión ha sido exitosa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexión no ha sido exitosa.");
        }            
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }            
}