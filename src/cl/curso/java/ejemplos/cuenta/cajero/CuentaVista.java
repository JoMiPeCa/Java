package cl.curso.java.ejemplos.cuenta.cajero;

/**
 * @author Juan Maldonado León
 * @see cl.curso.java.herencia.CuentaBancaria
 * Define la clase Cuenta Vista
 * Cuenta Vista es una CuentaBancaria
 */
public class CuentaVista extends CuentaBancaria {
	
	/**
	 * Sobreescribe (override) el método girar de la clase 
	 * padre Cuenta Bancaria
	 * - Por cada giro que se realice, se cobrara 300 pesos
	 *   sobre el monto a girar
	 * @param monto dinero a retirar  
	 */
	public void girar( int monto )
	{
		if((monto + 300) <= this.getSaldo())
		{
			this.setSaldo( this.getSaldo() - (monto+300) );
		}
		else
		{
			System.out.println( "Saldo insuficiente" );
		}
	
	}
}
