/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.curso.java.guia.carrera;

/**
 * @author Juan Maldonado León
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
