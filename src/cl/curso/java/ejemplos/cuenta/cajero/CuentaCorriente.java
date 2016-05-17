package cl.curso.java.ejemplos.cuenta.cajero;

/**
 * 
 * @author Juan Maldonado León
 * Define la clase Cuenta Corriente
 * Cuenta Corriente es una Cuenta Bancaria
 */
public class CuentaCorriente extends CuentaBancaria {
	
	private int lineaCredito;
	
	/**
	 * Constructor por defecto
	 */
	public CuentaCorriente()
	{
		System.out.println("Constructor de Cuenta Corriente");
	}
	
	
	/**
	 * @param lineaCredito monto de la linea de credito
	 */
	public CuentaCorriente(int lineaCredito) {
		this.lineaCredito = lineaCredito;
		System.out.println("Constructor de Cuenta Corriente con parametro");
	}




	/**
	 * @return the lineaCredito
	 */
	public int getLineaCredito() {
		return lineaCredito;
	}

	/**
	 * @param lineaCredito the lineaCredito to set
	 */
	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	/**
	 * Sobreescribe (override) el método girar de la clase 
	 * padre Cuenta Bancaria
	 * - Si el monto a girar sobrepasa el saldo de la cuenta,
	 *   puede hacer uso de la linea de credito
	 * @param monto dinero a retirar
	 */
	public void girar( int monto )
	{
		if( monto <= (this.getSaldo() + this.getLineaCredito()) )
		{
			if( monto <= this.getSaldo() )
			{
				this.setSaldo( this.getSaldo() - monto );
			}
			else
			{
				int resto = monto - this.getSaldo();
				this.setLineaCredito( this.getLineaCredito() - resto );
				this.setSaldo(0);
			}
		}
		else
		{
			System.out.println( "Saldo insuficiente" );
		}
	}
	
	
	/**
	 * Redefine el metodo imprimir de la clase padre
	 * Cuenta Bancaria. 
	 */
	public void imprimir()
	{
		super.imprimir();
		System.out.println( "Linea Cred : $" +  this.getLineaCredito());
	}

}
