/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Alumno implements Imprimible {

	private String nombre;
	private double promedio;

	/**
	 * Constructor por DEFECTO
	 */
	public Alumno() {
		this.nombre = "";
		this.promedio = 0.0;
	}

	/**
	 * Constructor que recibe Parametros
	 * 
	 * @param nombre
	 * @param promedio
	 */
	public Alumno(String nombre, double promedio) {
		this.nombre = nombre;
		this.promedio = promedio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio
	 *            the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	/**
	 * Metodo que imprime los atributos de la clase por pantalla.
	 */
	public void imprimir() {
		System.out.println("Nombre Alumno: " + this.nombre);
		System.out.println("Promedio Alumno: " + this.promedio);

	}

}
