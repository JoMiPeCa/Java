package cl.curso.java.ejemplos.sistemaBip;


/**
 * 
 * @author Juan Maldonado León
 *
 */
public class TarjetaBipClasica extends TarjetaBip 
{

	@Override
	public void recargar(int monto) {
		if( monto <= 25000 )
		{
			this.setSaldo( this.getSaldo() + monto );
		}
		else
		{
			System.out.println( "Debe recargar un monto "
					+ "menor a 25000" );
		}
	}

	@Override
	public void pagarViaje() {
		if( this.getSaldo() >= VALOR_TARJETA_CLASICA )
		{
			this.setSaldo( this.getSaldo() - VALOR_TARJETA_CLASICA );
		}
		else
		{
			System.out.println( "Saldo Insuficiente" );
		}
	}

	

}
