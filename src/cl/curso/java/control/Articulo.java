/**
 * 
 */
package cl.curso.java.control;

/**
 * @author Joseph
 *
 */
public class Articulo {

	private String nombre;
	private long costoBase;
	private long ventaDetalle;
	private long ventaMayor;
	
	/**
	 * Constructor por defecto
	 */
	public Articulo(){
		
	}
	
	
	
	/**
	 * @param nombre
	 * @param costoBase
	 */
	public Articulo(String nombre, long costoBase) {
		this.nombre = nombre;
		this.costoBase = costoBase;
		this.ventaDetalle = precioAlDetalle();
		this.ventaMayor = precioAlMayor();
	}

	


	/**
	 * @param nombre
	 * @param costoBase
	 * @param ventaDetalle
	 * @param ventaMayor
	 */
	public Articulo(String nombre, long costoBase, long ventaDetalle, long ventaMayor) {
		this.nombre = nombre;
		this.costoBase = costoBase;
		this.ventaDetalle = ventaDetalle;
		this.ventaMayor = ventaMayor;
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
	 * @return the costoBase
	 */
	public long getCostoBase() {
		return costoBase;
	}
	/**
	 * @param costoBase the costoBase to set
	 */
	public void setCostoBase(long costoBase) {
		this.costoBase = costoBase;
	}
	/**
	 * @return the ventaDetalle
	 */
	public long getVentaDetalle() {
		return ventaDetalle;
	}
	/**
	 * @param ventaDetalle the ventaDetalle to set
	 */
	public void setVentaDetalle(long ventaDetalle) {
		this.ventaDetalle = ventaDetalle;
	}
	/**
	 * @return the ventaMayor
	 */
	public long getVentaMayor() {
		return ventaMayor;
	}
	/**
	 * @param ventaMayor the ventaMayor to set
	 */
	public void setVentaMayor(long ventaMayor) {
		this.ventaMayor = ventaMayor;
	}
	
	/**
	 * Metodo precioAlDetalle
	 * Devuelte el precio al detalle del articulo
	 * */
	public long precioAlDetalle(){
		ventaDetalle = Math.round(this.costoBase*1.3);
		return ventaDetalle;
	}
	
	/**
	 * Metodo precioAlMayor
	 * Devuelte el precio al mayor del articulo
	 * */
	public long precioAlMayor(){
		ventaMayor = Math.round(this.costoBase*1.15);
		return ventaMayor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre = " + nombre + " \n costoBase = " + costoBase + " \n ventaDetalle = " + ventaDetalle
				+ " \n ventaMayor = " + ventaMayor;
	}
	
	/**
	 * Metodo Imprimir
	 * Devuelve todos los atributos de la clase*/
	public String imprimir(){
		return toString();
	}
	
}
