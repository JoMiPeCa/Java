/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio5;

/**
 * @author Joseph Perez Carmona
 *
 */
public class ReservaLibroThread extends Thread {

	private Libro libro;

	/**
	 * CONSTRUCTOR RECIBE PARAMETROS
	 * 
	 * @param libro
	 */
	public ReservaLibroThread(Libro libro) {
		this.libro = libro;
	}

	/**
	 * CONSTRUCTOR DEFECTO INICIALIZA
	 */
	public ReservaLibroThread() {
		this.libro = null;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro
	 *            the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public synchronized void run() {
		libro.reservarLibro();
	}

}
