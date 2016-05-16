/**
 * 
 */
package cl.curso.java.guia9.item2.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Permiso {

	private String nombre;
	private String id;
	private String descripcion;
	/**
	 * @param nombre
	 * @param id
	 * @param descripcion
	 */
	public Permiso(String nombre, String id, String descripcion) {
		this.nombre = nombre;
		this.id = id;
		this.descripcion = descripcion;
	}
	/**
	 * @param nombre
	 * @param id
	 * @param descripcion
	 */
	public Permiso() {
		this.nombre = "";
		this.id = "";
		this.descripcion = "";
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre = " + nombre + " \n id = " + id + " \n descripcion = " + descripcion;
	}
	
	
	
}
