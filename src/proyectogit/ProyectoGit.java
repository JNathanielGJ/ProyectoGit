package proyectogit;
import Conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ProyectoGit {

    public static void main(String[] args)throws SQLException {
        Conexion conexionPostgres = new Conexion();
        Connection con = conexionPostgres.getConexion();
    }
}
