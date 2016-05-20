package cl.curso.java.ejemplos;

public class EjemploHilo2 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("El nombre del thread es: " + Thread.currentThread().getName());
		
	}

	
}
