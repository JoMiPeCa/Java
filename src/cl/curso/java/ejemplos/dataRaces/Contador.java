/**
 * 
 */
package cl.curso.java.ejemplos.dataRaces;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Contador {

	private int cuenta;

	/**
	 * @param cuenta
	 */
	public Contador(int cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the cuenta
	 */
	public int getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	public synchronized void aumentaCuenta(){
		this.cuenta++;
		System.out.println("Cuenta: "+this.cuenta);
	}
}
