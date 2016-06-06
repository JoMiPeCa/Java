package cl.curso.java.guia11.guion1.ejercicio1;

public class RetirarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private double montoRetirar;


	/**
	 * 
	 */
	public RetirarDineroThread() {
		super();
	}

	/**
	 * @param cuentaBancaria
	 * @param montoRetirar
	 */
	public RetirarDineroThread(CuentaBancaria cuentaBancaria, double montoRetirar) {
		this.cuentaBancaria = cuentaBancaria;
		this.montoRetirar = montoRetirar;
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
	 * @return the montoRetirar
	 */
	public double getMontoRetirar() {
		return montoRetirar;
	}


	/**
	 * @param montoRetirar the montoRetirar to set
	 */
	public void setMontoRetirar(double montoRetirar) {
		this.montoRetirar = montoRetirar;
	}


	@Override
	public void run() {
		
		this.cuentaBancaria.retirar(this.getMontoRetirar());
		System.out.println(this.cuentaBancaria.getSaldo());
	}
}
