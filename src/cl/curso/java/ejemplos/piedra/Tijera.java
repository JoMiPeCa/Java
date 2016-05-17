/**
 * 
 */
package cl.curso.java.ejemplos.piedra;

/**
 * Representa la jugada Tijera
 * @author Juan Maldonado León
 *
 */
public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraTijera();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println( "gana tijera" );
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println( "pierde tijera" );
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println( "empata" );
		
	}

}
