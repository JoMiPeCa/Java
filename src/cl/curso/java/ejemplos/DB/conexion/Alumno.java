/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.ejemplos.DB.conexion;

/**
 * @author Juan Maldonado León
 *
 */
public class Alumno {
	
	private int idAlumno;
	private String nombre;
	private String apellido;
	private int edad;
	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return idAlumno;
	}
	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
}
