/**
 * 
 */
package cl.curso.java.guia09.item1;

/**
 * @author Joseph Perez Carmona
 * ESTO ES UNA PRUEBA
 *
 */
public class Vehiculo {
	
	private String codigo;
	private String marca;
	private String tipo;
	private int anio;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int unidadesVenta;
	/**
	 * @param codigo
	 * @param marca
	 * @param tipo
	 * @param anio
	 * @param patente
	 * @param kilometraje
	 * @param precioVenta
	 * @param unidadesVenta
	 */
	public Vehiculo(String codigo, String marca, String tipo, int anio, String patente, int kilometraje,
			int precioVenta, int unidadesVenta) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.anio = anio;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.unidadesVenta = unidadesVenta;
	}
	/**
	 * DEFECTO
	 */
	public Vehiculo() {
		this.codigo = "";
		this.marca = "";
		this.tipo = "";
		this.anio = 0;
		this.patente = "";
		this.kilometraje = 0;
		this.precioVenta = 0;
		this.unidadesVenta = 0;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}
	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}
	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	/**
	 * @return the precioVenta
	 */
	public int getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * @return the unidadesVenta
	 */
	public int getUnidadesVenta() {
		return unidadesVenta;
	}
	/**
	 * @param unidadesVenta the unidadesVenta to set
	 */
	public void setUnidadesVenta(int unidadesVenta) {
		this.unidadesVenta = unidadesVenta;
	}
	/**
	 * Metodo Venta Auto
	 * */
	public String vender(){
		if(this.unidadesVenta>0){
			this.unidadesVenta--;
			return "Vehiculo vendido correctamente";
		}else{
			return "No hay unidades disponibles para la venta!";
		}
	}
	
	

}
