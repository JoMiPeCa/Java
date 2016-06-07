/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.ejemplos.DB.conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * @author Juan Maldonado León
 *
 */
public class Conexion {
	
	private static Conexion _conexion;
	private Connection connection;

	private Conexion() {
		
	}
	
	public static Conexion getInstancia(){
		if(_conexion == null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://192.168.0.108:3306/curso", 
						"alumnos",
						"java123");
				
				Conexion conexion = new Conexion();
				conexion.setConnection(conn);
				_conexion = conexion;
			} catch(Exception e) {
				throw new ConexionException("Ocurrio un error "
						+ "al conectar con la base de datos", e);
			}
		}
		return _conexion;
	}
	
	public void conectar()
	{
		
	}

	/**
	 * Retorna el parametro connection (Accesador)
	 * @return connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * Mutador connection
	 * @param Modifica el connection y lo reemplaza con connection
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	
}
