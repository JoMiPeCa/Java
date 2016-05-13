package cl.curso.java.guia7.ejercicio1;

public class CuentaVista {

	
	
	private long numeroCuenta;
	private String nombre;
	private String apellido;
	private int saldo;
	private String run;
	
	public CuentaVista(){}
	
	
	/**
	 * @param numeroCuenta
	 * @param nombre
	 * @param apellido (SIN USO)
	 * @param saldo
	 * @param run
	 */
	public CuentaVista(long numeroCuenta, String nombre, int saldo, String run) {
		this.numeroCuenta = numeroCuenta;
		this.nombre = nombre;
		this.apellido = null;
		this.saldo = saldo;
		this.run = run;
	}
	
	/**
	 * @param numeroCuenta
	 * @param nombre
	 * @param apellido (SIN USO)
	 * @param run
	 */
	public CuentaVista(long numeroCuenta, String nombre, String run) {
		this.numeroCuenta = numeroCuenta;
		this.nombre = nombre;
		this.apellido = null;
		this.run = run;
		this.saldo = 0;
	}


	/**
	 * @return the numeroCuenta
	 */
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the run
	 */
	public String getRun() {
		return run;
	}
	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "numeroCuenta = " + numeroCuenta + " \n nombre = " + nombre + " \n saldo = " + saldo + " \n run = " + run;
	}
	
	
	
	
}
