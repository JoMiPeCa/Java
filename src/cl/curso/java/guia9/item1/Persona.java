/**
 * 
 */
package cl.curso.java.guia9.item1;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Persona {
	
	private String nombre;
	private String apellido;
	private int telefono;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	/**
	 * DEFECTO
	 */
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.telefono = 0;
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		if((telefono>99999999)&&(telefono < 1000000000)){
			this.telefono = telefono;
		}else{
			this.telefono = 0;
		}
	}

	/* 
	 * Metodo imprimir, muestra todos los atributos!
	 */
	public String imprimir() {
		return "nombre = " + nombre + " \n apellido = " + apellido + " \n telefono = " + telefono;
	}
	
	
	
	
	

}
