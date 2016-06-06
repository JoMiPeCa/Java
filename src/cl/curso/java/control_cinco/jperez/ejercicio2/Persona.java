/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Persona {

	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	/**
	 * Constructor que recibe parametros
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String rut, String nombre, String apellido, int edad) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	/**
	 * Constructor que Inicializa por defecto
	 */
	public Persona() {
		this.rut = "";
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}
	/**
	 * Retorna el parametro rut (Accesador)
	 * @return rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * Mutador rut
	 * @param Modifica el rut y lo reemplaza con rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
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
	 * Retorna el parametro apellido (Accesador)
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Mutador apellido
	 * @param Modifica el apellido y lo reemplaza con apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Retorna el parametro edad (Accesador)
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Mutador edad
	 * @param Modifica el edad y lo reemplaza con edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
