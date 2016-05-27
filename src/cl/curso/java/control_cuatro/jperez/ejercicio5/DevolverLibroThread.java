/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio5;

/**
 * @author Joseph Perez Carmona
 *
 */
public class DevolverLibroThread extends Thread {

	private Libro libro;

	/**
	 * CONSTRUCTOR QUE RECIBE PARAMETROS
	 * 
	 * @param libro
	 */
	public DevolverLibroThread(Libro libro) {
		this.libro = libro;
	}

	/**
	 * CONSTRUCTOR QUE INICIALIZA POR DEFECTO
	 */
	public DevolverLibroThread() {
		this.libro = null;
	}

	/**
	 * Retorna el parametro libro (Accesador)
	 * 
	 * @return libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * Mutador libro
	 * 
	 * @param Modifica
	 *            el libro y lo reemplaza con libro
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/*
	 * Ejecucion de Run
	 */
	@Override
	public void run() {
		libro.devolverLibro();
	}
}
