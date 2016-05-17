
package cl.curso.java.ejemplos.sistemaBip;

/**
 * Representa el concepto abstracto de una tarjeta 
 * bip. la cual puede ser recargada y tambien pagar un 
 * viaje en bus o en metro.
 * @author Juan Maldonado León
 * @version 1.0
 */
public abstract class TarjetaBip {
	
	private int saldo;
	private int numeroTarjeta;
	
	public static final int VALOR_TARJETA_CLASICA = 740;
	public static final int VALOR_TNE = 210;
	
	
	/**
	 * Constructor por defecto.
	 */
	public TarjetaBip()
	{
		this.saldo = 0;
		this.numeroTarjeta = 1234567890;
	}
	
	
	
	
	
	/**
	 * @param saldo saldo de la tarjeta bip
	 * @param numeroTarjeta  numero identificador.
	 */
	public TarjetaBip(int saldo, int numeroTarjeta) {
		super();
		this.saldo = saldo;
		this.numeroTarjeta = numeroTarjeta;
	}





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
	 * Una tarjeta bip puede recargar el saldo de su 
	 * tarjeta.
	 * @param monto monto que sera recargado.
	 */
	public abstract void recargar( int monto );
	
	
	/**
	 * Paga el viaje en un bus o metro.
	 */
	public abstract void pagarViaje();
	
	
	/**
	 * imprime los atributos de la clase.
	 */
	public void imprimir()
	{
		System.out.println( this.getNumeroTarjeta() );
		System.out.println( this.getSaldo() );
	}
	
}
