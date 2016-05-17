/**
 * 
 */
package cl.curso.java.ejemplos.piedra;

/**
 * Representa la Jugada Piedra
 * @author Juan Maldonado León
 *
 */
public  class Piedra extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		jugada.jugarContraPiedra();
		
	}

	@Override
	public void jugarContraPapel() {
		System.out.println( "gana papel" );
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println( "empate" );
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println( "gana piedra" );
		
	}

	
}
