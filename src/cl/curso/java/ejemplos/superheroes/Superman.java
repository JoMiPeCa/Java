package cl.curso.java.ejemplos.superheroes;

/**
 * Representa al SuperHeroe Superman 
 * @author Juan Maldonado León
 *
 */
public class Superman extends SuperHeroe {

	@Override
	public void recibirAtaque(Arma arma) {
		if( arma instanceof Granada)
		{
			System.out.println( "sobrevive" );
		}
		if( arma instanceof Kryptonita)
		{
			System.out.println( "muere" );
		}

	}

}
