/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class TrenRutaRoja extends Tren {

	/**
	 * 
	 */
	public TrenRutaRoja() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor del padre
	 * 
	 * @param numero
	 * @param linea
	 */
	public TrenRutaRoja(int numero, String linea) {
		super(numero, linea);

	}

	@Override
	/**
	 * Retorna Si el tren se detiene en la estacion señalada
	 */
	public boolean seDetiene(Estacion estacion) {
		if (estacion.seDetieneTrenRutaRoja()) {
			return true;
		}
		return false;
	}

}
