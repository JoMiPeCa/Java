package cl.curso.java.ejemplos.sistemaBip;

import java.util.Date;

/**
 * 
 * @author Juan Maldonado León
 * 
 */
public abstract class TNEBasica extends TNE {

	@Override
	public void recargar(int monto) {
		if( this.getFecha().before( new Date() ) )
		{
			this.setSaldo(this.getSaldo() + monto);
		}
		else
		{
			System.out.println( "no es necesario recargar" );
		}
	}

	@Override
	public void pagarViaje() {
		if( this.getFecha().before( new Date() ) )
		{
			if( this.getSaldo() >= VALOR_TARJETA_CLASICA )
			{
				this.setSaldo( this.getSaldo() - VALOR_TARJETA_CLASICA );
			}
			else
			{
				System.out.println( "Saldo Insuficiente" );
			}
		}
		else
		{
			System.out.println( "Cobro 0" );
		}

	}

}
