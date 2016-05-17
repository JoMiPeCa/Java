/**
 * 
 */
package cl.curso.java.guia9.item2.ejercicio4;

import java.util.ArrayList;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Tienda {

	private String nombre;
	private String tipoTienda;
	private ArrayList<Producto> producto;
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
	 * @return the tipoTienda
	 */
	public String getTipoTienda() {
		return tipoTienda;
	}
	/**
	 * @param tipoTienda the tipoTienda to set
	 */
	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}
	/**
	 * @return the producto
	 */
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	/**
	 * @param nombre
	 * @param tipoTienda
	 * @param producto
	 */
	public Tienda(String nombre, String tipoTienda, ArrayList<Producto> producto) {
		super();
		this.nombre = nombre;
		this.tipoTienda = tipoTienda;
		this.producto = producto;
	}
	
	public String imprimir() {
		return "nombre Tienda = " + nombre + " " +
				producto.toString();
	}
	
	
}
