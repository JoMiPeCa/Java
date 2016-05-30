package cl.curso.java.guia11.guion1.ejercicio2;


/**
 * @author Joseph Perez Carmona
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Thread( new Animal("leopardo", 20, 1000, 0) ).start();
		new Thread( new Animal("leopardo2", 20, 1000, 0) ).start();
		new Thread( new Animal("tortuga", 5, 2000, 0) ).start();
		
	}

}
