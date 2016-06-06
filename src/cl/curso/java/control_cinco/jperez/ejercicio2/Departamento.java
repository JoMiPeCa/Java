/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Departamento {

	private String nombre;
	private String descripcion;
	
	/**
	 * Constructor Recibe Parametros
	 * 
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	/**
	 * Constructor Inicializa Por Defecto
	 */
	public Departamento() {
		this.nombre = "";
		this.descripcion = "";
	}

	/**
	 * Retorna el parametro nombre (Accesador)
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Mutador nombre
	 * @param Modifica el nombre y lo reemplaza con nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Retorna el parametro descripcion (Accesador)
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Mutador descripcion
	 * @param Modifica el descripcion y lo reemplaza con descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	/*
	 * Sobreescribe Equals 
	 */
	public boolean equals(Object obj) {
		Departamento d = (Departamento) obj;
		return this.getNombre().equals(d.getNombre());
	}
	
	
}
