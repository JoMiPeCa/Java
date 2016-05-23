/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class EstacionRutaVerde extends Estacion {

	/**
	 * 
	 */
	public EstacionRutaVerde() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionRutaVerde(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.curso.java.prueba_dos.jperez.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {
		// NO SE DETIENE
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.curso.java.prueba_dos.jperez.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		// SI SE DETIENE
		return true;
	}

}
