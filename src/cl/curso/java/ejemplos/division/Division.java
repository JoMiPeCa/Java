package cl.curso.java.ejemplos.division;

public class Division {

	private int dividendo;
	private int divisor;
	private long cuociente;
	/**
	 * @param dividendo
	 * @param divisor
	 * @param cuociente
	 */
	public Division(int dividendo, int divisor) {
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	public Division() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the dividendo
	 */
	public int getDividendo() {
		return dividendo;
	}
	/**
	 * @param dividendo the dividendo to set
	 */
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}
	/**
	 * @return the divisor
	 */
	public int getDivisor() {
		return divisor;
	}
	/**
	 * @param divisor the divisor to set
	 */
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	/**
	 * @return the cuociente
	 */
	public long getCuociente() {
		return cuociente;
	}
	
	public long dividir(){
		return this.dividendo/this.divisor;
	}
}
