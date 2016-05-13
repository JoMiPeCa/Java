/**
 * 
 */
package cl.curso.java.control;

/**
 * @author Joseph
 *
 */
public class Libro {

	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int numeroEjemplaresPrestados;
	
	/**
	 * Constructor por defecto
	 */
	public Libro() {
	}

	/**
	 * @param titulo
	 * @param autor
	 * @param numeroEjemplares
	 * @param numeroEjemplaresPrestados
	 */
	public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
		this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numeroEjemplares
	 */
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	/**
	 * @param numeroEjemplares the numeroEjemplares to set
	 */
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	/**
	 * @return the numeroEjemplaresPrestados
	 */
	public int getNumeroEjemplaresPrestados() {
		return numeroEjemplaresPrestados;
	}

	/**
	 * @param numeroEjemplaresPrestados the numeroEjemplaresPrestados to set
	 */
	public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
		this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "titulo = " + titulo + " \n autor = " + autor + " \n numeroEjemplaresDisponibles = " + numeroEjemplares
				+ "  \n numeroEjemplaresPrestados = " + numeroEjemplaresPrestados;
	}
	
	/**
	 * Metodo prestarLibro()
	 * Presta un libro! (Segun instrucciones no debe devolver nada)
	 * */
	public void prestarLibro(){
		if(this.numeroEjemplaresPrestados<this.numeroEjemplares){
			this.numeroEjemplaresPrestados++;
			this.numeroEjemplares--;
		}
	}
	/**
	 * Metodo devolverLirbo()
	 * Devuelve un libro prestado (segun instrucciones no debe retornar nada)
	 * */
	public void devolverLibro(){
		this.numeroEjemplaresPrestados--;
		this.numeroEjemplares++;
	}
	
	/**
	 * Metodo imprimir()
	 * Imprime por consola todos los atributos de la clase
	 * */
	public String imprimir(){
		return toString();
	}
	
	
}
