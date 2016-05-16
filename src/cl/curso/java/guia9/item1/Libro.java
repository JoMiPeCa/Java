package cl.curso.java.guia9.item1;

public class Libro {

	private String nombre;
	private String autor;
	private String editorial;
	private String iSBN;

	/**
	 * @param nombre
	 * @param autor
	 * @param editorial
	 * @param iSBN
	 */
	public Libro(String nombre, String autor, String editorial, String iSBN) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.iSBN = iSBN;
	}

	/**
	 * Inicializa los parametros por defecto
	 */
	public Libro() {
		this.nombre = "";
		this.autor = "";
		this.editorial = "";
		this.iSBN = "";
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
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
	 * @return the iSBN
	 */
	public String getiSBN() {
		return iSBN;
	}

	/**
	 * @param iSBN
	 *            the iSBN to set
	 */
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public boolean verificar(String original){
		int total = 0, aux = 0, aux2 = 0, aux3 = 0;
		char aux1 = ' ';
		int codigo = 0;
		String aux0 = "";
		aux1 = original.toUpperCase().charAt(10);
		try{
			aux0 = String.valueOf(aux1);
			aux = Integer.parseInt(aux0);
		} catch (Exception e){

		}
		codigo= Integer.parseInt(original,9);

		for (int i = 2; i < 12; i++) {
			aux = codigo % 10;
			codigo = codigo / 10;
			total = total + (aux * i);
		}
		//System.out.println("suma: " + total);
		aux2 = total % 11; // aux2 residuo dividir en 11
		if (aux2 == 0) {
			if (aux2 == aux) {
				return true;
			} else {
				return false;
			}

		} else if (aux2 == 1) {
			if ('X' == aux1) {
				return true;
			} else {
				return false;
			}

		} else {
			aux3 = 11 - aux2;
			if (aux == aux3) {
				return true;
			} else {
				return false;
			}

		}

	}
}
