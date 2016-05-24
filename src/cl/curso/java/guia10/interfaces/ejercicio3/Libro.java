/**
 * 
 */
package cl.curso.java.guia10.interfaces.ejercicio3;

/**
 * @author usuario Perez Carmona
 *
 */
public class Libro implements Imprimible{

	private String nombre;
	private String editorial;
	/**
	 * @param nombre
	 * @param editorial
	 */
	public Libro(String nombre, String editorial) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
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
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}
	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public void imprimir() {
		System.out.println("nombre" + getNombre() + "\n editorial" + getEditorial());
		
		
	}
	
	
	
}
