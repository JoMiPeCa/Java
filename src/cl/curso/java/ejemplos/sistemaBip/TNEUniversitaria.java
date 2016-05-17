package cl.curso.java.ejemplos.sistemaBip;

import java.util.Date;

public class TNEUniversitaria extends TNE {

	@Override
	public void recargar(int monto) {
		if( monto<= 10000 )
		{
			this.setSaldo( this.getSaldo() + monto );
		}
		else
		{
			System.out.println( "Excede el maximo" );
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
			if( this.getSaldo() >= VALOR_TNE )
			{
				this.setSaldo( this.getSaldo() - VALOR_TNE );
			}
			else
			{
				System.out.println("Saldo Insuficiente");
			}
		}
	}

}
