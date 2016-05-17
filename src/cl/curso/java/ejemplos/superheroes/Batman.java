package cl.curso.java.ejemplos.superheroes;

/**
 * Representa al superheroe Batman 
 * @author Juan Maldonado León
 *
 */
public class Batman extends SuperHeroe {

	@Override
	public void recibirAtaque(Arma arma) {
		if( arma instanceof Granada)
		{
			System.out.println( "muere" );
		}
		if( arma instanceof Kryptonita)
		{
			System.out.println( "sobrevive" );
		}

	}

}
