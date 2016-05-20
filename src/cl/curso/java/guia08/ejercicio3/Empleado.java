/**
 * 
 */
package cl.curso.java.guia08.ejercicio3;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Empleado {

	private String nombre;
	private String rut;
	private int sueldoBase;
	private int pagoHoraExtra;
	private int horasExtrasRealizadas;
	/**
	 * @param nombre
	 * @param rut
	 * @param sueldoBase
	 * @param pagoHoraextra
	 * @param horasExtrasRealizadas
	 */
	public Empleado(String nombre, String rut, int sueldoBase, int pagoHoraextra, int horasExtrasRealizadas) {
		this.nombre = nombre;
		this.rut = rut;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraextra;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
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
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the sueldoBase
	 */
	public int getSueldoBase() {
		return sueldoBase;
	}
	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	/**
	 * @return the pagoHoraextra
	 */
	public int getPagoHoraExtra() {
		return pagoHoraExtra;
	}
	/**
	 * @param pagoHoraextra the pagoHoraextra to set
	 */
	public void setPagoHoraExtra(int pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}
	/**
	 * @return the horasExtrasRealizadas
	 */
	public int getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}
	/**
	 * @param horasExtrasRealizadas the horasExtrasRealizadas to set
	 */
	public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	public long sLiquido(){
		return Math.round((this.sueldoBase+(this.pagoHoraExtra*this.getHorasExtrasRealizadas()))*0.83);
	}
	
	public long sBruto(){
		return this.sueldoBase+(this.pagoHoraExtra*this.getHorasExtrasRealizadas());
	}
}
