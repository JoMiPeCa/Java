/**
 * 
 */
package cl.curso.java.guia9.item2.ejercicio3;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Alumno {

	private String nombre;
	private int edad;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param edad
	 */
	public Alumno() {
		this.nombre = "";
		this.edad = 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre = " + nombre + " \n edad = " + edad;
	}	
}
