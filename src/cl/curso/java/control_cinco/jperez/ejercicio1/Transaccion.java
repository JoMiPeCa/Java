/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio1;

import java.util.Date;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Transaccion {

	private String id;
	private TipoTransaccion tipo;
	private Date fecha;
	private int monto;
	
	
	/**
	 * Constructor que recibe parametros
	 * @param id
	 * @param tipo
	 * @param fecha
	 * @param monto
	 */
	public Transaccion(String id, TipoTransaccion tipo, Date fecha, int monto) {
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}
	/**
	 * Constructor por defecto inicializa parametros.
	 */
	public Transaccion() {
		this.id = "";
		this.tipo = TipoTransaccion.NA;
		this.fecha = new Date();
		this.monto = 0;
	}
	/**
	 * Retorna el parametro id (Accesador)
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * Mutador id
	 * @param Modifica el id y lo reemplaza con id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Retorna el parametro tipo (Accesador)
	 * @return tipo
	 */
	public TipoTransaccion getTipo() {
		return tipo;
	}
	/**
	 * Mutador tipo
	 * @param Modifica el tipo y lo reemplaza con tipo
	 */
	public void setTipo(TipoTransaccion tipo) {
		this.tipo = tipo;
	}
	/**
	 * Retorna el parametro fecha (Accesador)
	 * @return fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * Mutador fecha
	 * @param Modifica el fecha y lo reemplaza con fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * Retorna el parametro monto (Accesador)
	 * @return monto
	 */
	public int getMonto() {
		return monto;
	}
	/**
	 * Mutador monto
	 * @param Modifica el monto y lo reemplaza con monto
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Transaccion tr = (Transaccion) obj;
		return this.id.equals(tr.getId());
	}
	
}
