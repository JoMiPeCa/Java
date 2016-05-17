package cl.curso.java.ejemplos.piedra;

/**
 * Programa para emular el juego de piedra, 
 * papel o tijera
 * @author Juan Maldonado León
 *
 */
public class Programa {

	/**
	 * Inicializacion del Programa
	 * @param args
	 */
	public static void main(String[] args) {
		
		Piedra piedra = new Piedra();
		Papel papel = new Papel();
		Tijera tijera = new Tijera();
		
		piedra.jugar( papel );
		tijera.jugar(piedra);

	}

}
