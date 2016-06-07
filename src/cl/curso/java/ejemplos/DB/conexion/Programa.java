/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.ejemplos.DB.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


/**
 * @author Juan Maldonado León
 *
 */
public class Programa {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/curso", "jmaldonado",
					"java123");

			String nombre = JOptionPane.
					showInputDialog("Ingrese Nombre:");
			// Insertar un registro
			Statement sentenciaInsert = conexion.createStatement();
			int resultadoInsert = sentenciaInsert
				.executeUpdate("INSERT INTO alumnos "
						+ "(idalumno, nombre, apellido, apellidoMaterno)"
							+ " VALUES ('3', '"+nombre+"', 'Gosling', 'lion');");
			System.out.println("Resultado : " + resultadoInsert);
			
//			// Actualizar un registro
//			Statement sentenciaUpdate = conexion.createStatement();
//			int resultadoUpdate = sentenciaUpdate
//					.executeUpdate("UPDATE alumnos SET nombre='juan francisco'"
//							+ " WHERE idalumno='1';");
//			System.out.println("Resultado modificacion : " + resultadoUpdate);
//			
//			
//			// Eliminar un registro
//			Statement sentenciaDelete = conexion.createStatement();
//			int resultadoDelete = sentenciaDelete
//					.executeUpdate("DELETE FROM curso.alumnos WHERE idalumno='3';");
//			System.out.println("Resultado modificacion : " + resultadoDelete);
//
//			
//			
//			// Obtener registros 
//			Statement sentenciaSelect = conexion.createStatement();
//			ResultSet resultadoSelect = sentenciaSelect
//					.executeQuery("select * from alumnos");
//
//			while (resultadoSelect.next()) {
//				System.out.println("idAlumno:" + resultadoSelect.getInt(1));
//				System.out.println("Nombre: " + resultadoSelect.getString(2));
//
//				System.out.println("idAlumno:"
//						+ resultadoSelect.getInt("idalumno"));
//				System.out.println("Nombre: "
//						+ resultadoSelect.getString("nombre"));
//			}
			
			
			
			
			
			PreparedStatement pstatementSelect = conexion.prepareStatement( 
					"SELECT * FROM alumnos WHERE nombre = ?" );
			pstatementSelect.setString(1, "juan francisco");
			ResultSet rs = pstatementSelect.executeQuery();
			while (rs.next()) {
				System.out.println( rs.getInt("idalumno") );
				System.out.println( rs.getString("nombre") );
			}
			
			
			PreparedStatement pstatementInsert = conexion.prepareStatement(
					"INSERT INTO alumnos (idalumno, nombre, apellido, apellidoMaterno)"
							+ " VALUES (?,?,?,?);");
			pstatementInsert.setInt(1, 12);
			pstatementInsert.setString(2,"James" );
			pstatementInsert.setString(3,"Gosling" );
			pstatementInsert.setString(4,"lion" );
			int resultpInsert = pstatementInsert.executeUpdate();
			System.out.println(resultpInsert);
			
			
			PreparedStatement pstatementUpdate = conexion.prepareStatement(
					"UPDATE alumnos SET nombre=?"
					+ " WHERE idalumno=?;");
			pstatementUpdate.setString(1,"Juan" );
			pstatementUpdate.setInt(2, 1);
			
			int resultpUpdate = pstatementUpdate.executeUpdate();
			System.out.println(resultpUpdate);
			
			
			
			
			
			PreparedStatement pstatementDelete = conexion.prepareStatement(
					"DELETE FROM alumnos WHERE idalumno=?;");
			pstatementDelete.setInt(1, 12);
			int resultpDelete = pstatementDelete.executeUpdate();
			System.out.println(resultpDelete);
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("El driver requerido no esta cargado.");
		} catch (SQLException e) {
			System.out.println("Ha ocurrido un error al ejecutar las sentencias SQL" );
		} catch ( Exception e ){
			System.out.println("Ocurrio un error desconocido");
		}
	}
}
