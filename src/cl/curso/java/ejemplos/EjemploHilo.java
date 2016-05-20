package cl.curso.java.ejemplos;

public class EjemploHilo extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try{
			sleep(1000);
		} catch (InterruptedException ex){
			
		}
		System.out.println("El nombre del Thread es: "+ getName());
		
	}

	
}
