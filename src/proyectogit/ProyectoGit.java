package proyectogit;

import Conexion.Conexion;
import Formulario.Cliente;
import Formulario.Empleado;
import Formulario.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ProyectoGit {

    public static void main(String[] args)throws SQLException {
        Conexion conexionPostgres = new Conexion();
        Connection con = conexionPostgres.getConexion();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
