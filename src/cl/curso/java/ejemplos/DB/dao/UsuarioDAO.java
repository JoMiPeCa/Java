/**
 * 
 */
package cl.curso.java.ejemplos.DB.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.curso.java.ejemplos.DB.conexion.Conexion;
import cl.curso.java.ejemplos.DB.login.Usuario;

/**
 * @author Joseph Perez Carmona
 *
 */
public class UsuarioDAO {

	public static boolean validar(Usuario usuario) throws SQLException{
		Conexion con = Conexion.getInstancia();
		PreparedStatement st = con.getConnection().prepareStatement(
				"SELECT * FROM usuarios WHERE "+
				"nombre_usuario = ? AND "+
				"password = ?;");
		
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		ResultSet rs = st.executeQuery();
		
		return rs.next();
		
	}
}
