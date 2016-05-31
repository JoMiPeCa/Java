package cl.curso.java.guia11.Threads.ejercicio1;

public class CuentaBancaria {

	private double saldo;
	private int numeroCuenta;
	
	
	/**
	 * 
	 */
	public CuentaBancaria() {
	}
	/**
	 * @param saldo
	 * @param numeroCuenta
	 */
	public CuentaBancaria(double saldo, int numeroCuenta) {
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public double depositar(double monto)
	{
		this.setSaldo(this.getSaldo()+monto);
		
		return this.getSaldo();
	}
	
	public double retirar(double monto)
	{
		this.setSaldo(this.getSaldo()-monto);
		
		return this.getSaldo();
	}
	
}
