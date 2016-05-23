/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public abstract class Estacion {

	private String nombre;
	private String linea;
	/**
	 * 
	 */
	public Estacion() {
	}
	/**
	 * @param nombre
	 * @param linea
	 */
	public Estacion(String nombre, String linea) {
		this.nombre = nombre;
		this.linea = linea;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	public abstract boolean seDetieneTrenRutaRoja();
	public abstract boolean seDetieneTrenRutaVerde();
}
