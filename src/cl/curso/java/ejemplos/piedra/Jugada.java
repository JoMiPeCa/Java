package cl.curso.java.ejemplos.piedra;

/**
 * Concepto abstracto de jugada que puede ser 
 * piedra, papel o tijera.
 * @author Juan Maldonado León
 *
 */
public abstract class Jugada {

	public abstract void jugar( Jugada jugada );
	
	public abstract void jugarContraPapel();
	public abstract void jugarContraPiedra();
	public abstract void jugarContraTijera();
}
