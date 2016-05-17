package cl.curso.java.ejemplos.cuenta.cajero;

public class CajeroAutomatico {

	public void retirarDinero( CuentaBancaria cuentaBancaria,
			int monto)
	{
		if( cuentaBancaria instanceof CuentaVista )
		{
			System.out.println( "la cuenta bancaria es "
					+ "instancia de cuenta vista" );
		}
		if( cuentaBancaria instanceof CuentaCorriente )
		{
			System.out.println( "la cuenta bancaria es "
					+ "instancia de cuenta corriente" );
		}
		cuentaBancaria.girar(monto);
	}
}
