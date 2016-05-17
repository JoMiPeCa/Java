/**
 * 
 */
package cl.curso.java.guia9.item1;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Disco {

	private String nombreDisco;
	private String nombreAutor;
	private String generoMusical;
	private String[] canciones;

	/**
	 * @param nombreDisco
	 * @param nombreAutor
	 * @param generoMusical
	 * @param canciones
	 */
	public Disco(String nombreDisco, String nombreAutor, String generoMusical, String[] canciones) {
		this.nombreDisco = nombreDisco;
		this.nombreAutor = nombreAutor;
		this.generoMusical = generoMusical;
		this.canciones = canciones;
	}

	/**
	 * @param nombreDisco
	 * @param nombreAutor
	 * @param generoMusical
	 * @param canciones
	 */
	public Disco() {
		
		this.nombreDisco = "";
		this.nombreAutor = "";
		this.generoMusical = "";
		this.canciones = null;
	}

	/**
	 * @return the nombreDisco
	 */
	public String getNombreDisco() {
		return nombreDisco;
	}

	/**
	 * @param nombreDisco
	 *            the nombreDisco to set
	 */
	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}

	/**
	 * @return the nombreAutor
	 */
	public String getNombreAutor() {
		return nombreAutor;
	}

	/**
	 * @param nombreAutor
	 *            the nombreAutor to set
	 */
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	/**
	 * @return the generoMusical
	 */
	public String getGeneroMusical() {
		return generoMusical;
	}

	/**
	 * @param generoMusical
	 *            the generoMusical to set
	 */
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	/**
	 * @return the canciones
	 */
	public String[] getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones
	 *            the canciones to set
	 */
	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}

	/**
	 * Metodo que imprime los atributos.
	 */
	public String imprimir() {
		return "nombreDisco = " + nombreDisco + " \n nombreAutor = " + nombreAutor + " \n generoMusical = "
				+ generoMusical + " \n canciones = " + cancion();
	}

	public String cancion() {
		String retorno = "";
		if (canciones != null) {
			for (int i = 0; i < canciones.length; i++) {
				retorno += (i+1) + ". " + canciones[i]+" ";
				
			}
		}else{
			return "No hay canciones";
		}
		return retorno;

	}
	

}
