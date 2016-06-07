/**
 * 
 */
package cl.curso.java.ejemplos.dataBase;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import cl.curso.java.ejemplos.DB.*;
//import cl.curso.java.ejemplos.DB.conexion.Conexion;
//
//import javax.swing.JOptionPane;

/**
 * @author Joseph Perez Carmona
 *

public class ProgramaInsert {
	
	public static void main(String[] args) {
		
		
		String nombreUsuario = JOptionPane.showInputDialog("Ingrese Usuario: ");
		String password = JOptionPane.showInputDialog("Ingrese Clave: ");
		
		PreparedStatement st = conexion.prepareStatement(
				"SELECT * FROM usuarios WHERE "+
				"nombre_usuario = ? AND "+
				"password = ? ;");
		st.setString(1, nombreUsuario);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		if( rs.next() ){
			JOptionPane.showMessageDialog(null, "Acceso Correcto");
		}else{
			JOptionPane.showMessageDialog(null, "Acceso Denegado");
		}
	}
}
 */