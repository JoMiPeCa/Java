/**
 * 
 */
package cl.curso.java.guia9.item1;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Vendedor {

	private String nombre;
	private int semanasTrabajadas;
	private int cantArtVendidos;
	private int valorPesoArtVendidos;
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
	 * @return the semanasTrabajadas
	 */
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}
	/**
	 * @param semanasTrabajadas the semanasTrabajadas to set
	 */
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}
	/**
	 * @return the cantArtVendidos
	 */
	public int getCantArtVendidos() {
		return cantArtVendidos;
	}
	/**
	 * @param cantArtVendidos the cantArtVendidos to set
	 */
	public void setCantArtVendidos(int cantArtVendidos) {
		this.cantArtVendidos = cantArtVendidos;
	}
	/**
	 * @return the valorPesoArtVendidos
	 */
	public int getValorPesoArtVendidos() {
		return valorPesoArtVendidos;
	}
	/**
	 * @param valorPesoArtVendidos the valorPesoArtVendidos to set
	 */
	public void setValorPesoArtVendidos(int valorPesoArtVendidos) {
		this.valorPesoArtVendidos = valorPesoArtVendidos;
	}
	/**
	 * @param nombre
	 * @param semanasTrabajadas
	 * @param cantArtVendidos
	 * @param valorPesoArtVendidos
	 */
	public Vendedor(String nombre, int semanasTrabajadas, int cantArtVendidos, int valorPesoArtVendidos) {
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.cantArtVendidos = cantArtVendidos;
		this.valorPesoArtVendidos = valorPesoArtVendidos;
	}
	public Vendedor() {
		this.nombre = "";
		this.semanasTrabajadas = 0;
		this.cantArtVendidos = 0;
		this.valorPesoArtVendidos = 0;
	}
	
	public long calcularComision(){
		return Math.round(0.09*this.cantArtVendidos*this.valorPesoArtVendidos*this.semanasTrabajadas);
	}
	
}
