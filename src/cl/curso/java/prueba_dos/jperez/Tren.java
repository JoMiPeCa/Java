/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public abstract class Tren {

	private int numero;
	private String linea;

	/**
	 * 
	 */
	public Tren() {
	}

	/**
	 * @param numero
	 * @param linea
	 */
	public Tren(int numero, String linea) {
		this.numero = numero;
		this.linea = linea;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 *            the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}

	/**
	 * 
	 * @param estacion
	 * @return Metodo Abstracto
	 */
	public abstract boolean seDetiene(Estacion estacion);

}
