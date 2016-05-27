/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio6;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Auto {

	private String marca;
	private String modelo;
	private int anio;
	private int stock;

	/**
	 * CONSTRUCTOR RECIBE PARAMETROS
	 * 
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}

	/**
	 * CONSTRUCTOR DEFECTO INCIALIZA PARAMETROS
	 */
	public Auto() {
		this.marca = "";
		this.modelo = "";
		this.anio = 0;
		this.stock = 0;
	}

	/**
	 * Retorna el parametro marca (Accesador)
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Mutador marca
	 * 
	 * @param Modifica
	 *            el marca y lo reemplaza con marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Retorna el parametro modelo (Accesador)
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Mutador modelo
	 * 
	 * @param Modifica
	 *            el modelo y lo reemplaza con modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Retorna el parametro anio (Accesador)
	 * 
	 * @return anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * Mutador anio
	 * 
	 * @param Modifica
	 *            el anio y lo reemplaza con anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * Retorna el parametro stock (Accesador)
	 * 
	 * @return stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Mutador stock
	 * 
	 * @param Modifica
	 *            el stock y lo reemplaza con stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Metodo que Vende un auto, Si no hay stock lanza SinStockException
	 */
	public void venderAuto() throws RuntimeException {
		if (this.stock == 0) {
			throw new SinStockException("No es posible vender auto. No hay stock");
		} else {
			this.stock--;
		}
	}

}
