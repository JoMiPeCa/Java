/**
 * 
 */
package cl.curso.java.guia9.item2.ejercicio1;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Perfil {
	
	private String nombre;
	private String descripcion;
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
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Perfil(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Perfil() {
		this.nombre = "";
		this.descripcion = "";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre = " + nombre + " \n descripcion = " + descripcion;
	}
	
	
	

}
