package cl.curso.java.ejemplos.sistemaBip;

public abstract class TarjetaBip {

	private int saldo;
	private int numeroTarjeta;
	private String color;
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @param saldo
	 * @param numeroTarjeta
	 * @param color
	 */
	public TarjetaBip(int saldo, int numeroTarjeta, String color) {
		this.saldo = saldo;
		this.numeroTarjeta = numeroTarjeta;
		this.color = color;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "saldo = " + saldo + " \n numeroTarjeta = " + numeroTarjeta + " \n color = " + color;
	}
	
	public abstract void recargar(int monto);
	
	public abstract void pagarViaje();
}
