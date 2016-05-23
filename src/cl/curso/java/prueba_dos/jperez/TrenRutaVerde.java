/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class TrenRutaVerde extends Tren {

	/**
	 * @param numero
	 * @param linea
	 */
	public TrenRutaVerde(int numero, String linea) {
		super(numero, linea);
		// TODO Auto-generated constructor stub
	}

	public TrenRutaVerde() {
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * Retorna Si el tren se detiene en la estacion señalada
	 */
	public boolean seDetiene(Estacion estacion) {
		if (estacion.seDetieneTrenRutaVerde()) {
			return true;
		}
		return false;
	}

}
