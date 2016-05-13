/**
 * 
 */
package cl.curso.java.ejemplos.personas;

/**
 * @author Joseph
 *
 */
public class Persona {

	private int edad;
	private String nombre;
	private String appPaterno;
	private String appMaterno;
	
	public Persona(){};
	/**
	 * @param edad
	 * @param nombre
	 * @param appPaterno
	 * @param appMaterno
	 */
	public Persona(int edad, String nombre, String appPaterno, String appMaterno) {
		this.edad = edad;
		this.nombre = nombre;
		this.appPaterno = appPaterno;
		this.appMaterno = appMaterno;
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
	 * @return the appPaterno
	 */
	public String getAppPaterno() {
		return appPaterno;
	}
	/**
	 * @param appPaterno the appPaterno to set
	 */
	public void setAppPaterno(String appPaterno) {
		this.appPaterno = appPaterno;
	}
	/**
	 * @return the appMaterno
	 */
	public String getAppMaterno() {
		return appMaterno;
	}
	/**
	 * @param appMaterno the appMaterno to set
	 */
	public void setAppMaterno(String appMaterno) {
		this.appMaterno = appMaterno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "edad = " + edad + " \n nombre = " + nombre + " \n appPaterno = " + appPaterno + " \n appMaterno = "
				+ appMaterno;
	}
	
	
	
	
	
}
