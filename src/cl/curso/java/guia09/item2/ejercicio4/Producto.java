package cl.curso.java.guia09.item2.ejercicio4;

public class Producto {

	private String nombre;
	private String tipoArticulo;
	private int cantidadArticulo;
	private int precioArticulo;
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
	 * @return the tipoArticulo
	 */
	public String getTipoArticulo() {
		return tipoArticulo;
	}
	/**
	 * @param tipoArticulo the tipoArticulo to set
	 */
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	/**
	 * @return the cantidadArticulo
	 */
	public int getCantidadArticulo() {
		return cantidadArticulo;
	}
	/**
	 * @param cantidadArticulo the cantidadArticulo to set
	 */
	public void setCantidadArticulo(int cantidadArticulo) {
		this.cantidadArticulo = cantidadArticulo;
	}
	/**
	 * @return the precioArticulo
	 */
	public int getPrecioArticulo() {
		return precioArticulo;
	}
	/**
	 * @param precioArticulo the precioArticulo to set
	 */
	public void setPrecioArticulo(int precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	/**
	 * @param nombre
	 * @param tipoArticulo
	 * @param cantidadArticulo
	 * @param precioArticulo
	 */
	public Producto(String nombre, String tipoArticulo, int cantidadArticulo, int precioArticulo) {
		this.nombre = nombre;
		this.tipoArticulo = tipoArticulo;
		this.cantidadArticulo = cantidadArticulo;
		this.precioArticulo = precioArticulo;
	}
	/**
	 * @param nombre
	 * @param tipoArticulo
	 * @param cantidadArticulo
	 * @param precioArticulo
	 */
	public Producto() {
		this.nombre = "";
		this.tipoArticulo = "";
		this.cantidadArticulo = 0;
		this.precioArticulo = 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre = " + nombre + " \n precioArticulo = " + precioArticulo;
	}
}
