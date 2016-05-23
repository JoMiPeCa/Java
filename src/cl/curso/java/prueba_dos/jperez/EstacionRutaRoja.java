/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class EstacionRutaRoja extends Estacion {

	/**
	 * 
	 */
	public EstacionRutaRoja() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public EstacionRutaRoja(String nombre, String linea) {
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
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.curso.java.prueba_dos.jperez.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		// NO SE DETIENE
		return false;
	}

}
