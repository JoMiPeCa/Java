package cl.curso.java.guia09.item2.ejercicio2;

public class Perfil {

	private String nombre;
	private String descripcion;
	private Permiso permiso;
	/**
	 * @param nombre
	 * @param descripcion
	 * @param permiso
	 */
	public Perfil(String nombre, String descripcion, Permiso permiso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.permiso = permiso;
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
	 * @return the permiso
	 */
	public Permiso getPermiso() {
		return permiso;
	}
	/**
	 * @param permiso the permiso to set
	 */
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	
	public String imprimir() {
		return "nombre = " + nombre 
				+ " \n descripcion = " + descripcion 
				+ " \n permiso = " + permiso.toString();
	}
	
}
