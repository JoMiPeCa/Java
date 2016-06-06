package cl.curso.java.guia11.guion1.ejercicio1;

public class DepositarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private double montoDepositar;
	
	/**
	 * 
	 */
	public DepositarDineroThread() {
	}
	
	/**
	 * @param cuentaBancaria
	 * @param montoDepositar
	 */
	public DepositarDineroThread(CuentaBancaria cuentaBancaria, double montoDepositar) {
		this.cuentaBancaria = cuentaBancaria;
		this.montoDepositar = montoDepositar;
	}
	
	/**
	 * @return the cuentaBancaria
	 */
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	/**
	 * @param cuentaBancaria the cuentaBancaria to set
	 */
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	/**
	 * @return the montoDepositar
	 */
	public double getMontoDepositar() {
		return montoDepositar;
	}
	/**
	 * @param montoDepositar the montoDepositar to set
	 */
	public void setMontoDepositar(double montoDepositar) {
		this.montoDepositar = montoDepositar;
	}
	
	@Override
	public void run() {
		
		this.cuentaBancaria.depositar(this.getMontoDepositar());
		System.out.println(this.cuentaBancaria.getSaldo());
	}
}
