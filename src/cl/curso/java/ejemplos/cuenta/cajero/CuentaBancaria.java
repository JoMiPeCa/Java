package cl.curso.java.ejemplos.cuenta.cajero;

/**
 * 
 * @author Juan Maldonado León
 * 
 */
public abstract class CuentaBancaria
{
	private int numeroCuenta;
	private int saldo;
	
	
	/**
	 * Constructor por defecto
	 */
	public CuentaBancaria()
	{
		System.out.println( "Constructor Cuenta Bancaria" );
	}


	/**
	 * @param numeroCuenta numero de la cuenta bancaria
	 * @param saldo saldo que tiene la cuenta
	 */
	public CuentaBancaria(int numeroCuenta, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
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
	 * 
	 * @param monto dinero total a girar
	 */
	public abstract void girar( int monto );
	
	/**
	 * Permite depositar o abonar dinero a la cuenta bancaria
	 * @param monto dinero que se abonara al saldo
	 */
	public void depositar( int monto )
	{
		System.out.println( "Se depositara $" + monto );
		this.setSaldo( this.getSaldo() + monto );
	}
	
	/**
	 * Metodo que permite imprimir los atributos de 
	 * la clase.
	 */
	public void imprimir()
	{
		System.out.println( "Datos de la Cuenta" );
		System.out.println( "Nº cuenta : " +  this.getNumeroCuenta() );
		System.out.println( "Saldo : $" + this.getSaldo() );
	}
	
	
}
