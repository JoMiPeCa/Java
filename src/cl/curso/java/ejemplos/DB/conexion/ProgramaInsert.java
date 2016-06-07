package cl.curso.java.ejemplos.DB.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ProgramaInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection(
				"jdbc:mysql://192.168.0.124:3306/curso", "alumnos",
				"java123");
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese usuario");
		String password = JOptionPane.showInputDialog("Ingrese password");
		// Inyeccion SQL 'or '1'='1
		PreparedStatement st = conexion.prepareStatement(
				"select * from usuarios where "+
				"nombre_usuario =?  AND "+  
				"password = ?;");
		st.setString(1,nombreUsuario );
		st.setString(2,password);
		ResultSet rs = st.executeQuery(  );
		if( rs.next() ){
			JOptionPane.showMessageDialog(null, "Acceso correcto");
		}
		else{
			JOptionPane.showMessageDialog(null, "Acceso denegado");
		}
		
		
		
//		Statement st = conexion.createStatement();
//		st.executeUpdate("INSERT INTO usuarios "
//				+ "(nombre_usuario, password)"
//				+ " VALUES ('"+nombreUsuario+"', '"+password+"');");
		

	}

}
