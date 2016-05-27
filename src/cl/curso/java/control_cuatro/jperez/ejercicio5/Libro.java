/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio5;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Libro {

	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	/**
	 * CONSTRUCTOR RECIBE PARAMETROS
	 * 
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * CONSTRUCTOR DEFECTO INCIALIZA
	 */
	public Libro() {
		this.nombre = "";
		this.editorial = "";
		this.cantidadLibros = 0;
		this.cantidadLibrosPrestados = 0;
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
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 *            the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 *            the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * Metodo que reserva un libro, sumando 1 a libros prestados solo en el caso
	 * de que la cantidad de libros sea mayor a la de libros prestados.
	 */
	public void reservarLibro() {
		if (this.cantidadLibros > this.cantidadLibrosPrestados)
			this.cantidadLibrosPrestados++;
	}

	/**
	 * Metodo que devuelve un libro, restando 1 a libros prestados solo en el
	 * caso de que la cantidad de libros prestados sea mayor o igual a 1. de
	 * esta forma no queda en negativos.
	 */
	public void devolverLibro() {
		if (this.cantidadLibrosPrestados >= 1)
			this.cantidadLibrosPrestados--;
	}
}
