/**
 * 
 */
package cl.curso.java.ejemplos.DB.conexion;

/**
 * @author Joseph Perez Carmona
 *
 */
public class ConexionException extends RuntimeException {

	private static final long serialVersionUID = 7176957695266382895L;
	
	/**
	 * Constructor que recibe parametros
	 * @param arg0
	 * @param arg1
	 */
	public ConexionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que recibe parametros
	 * @param arg0
	 */
	public ConexionException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
