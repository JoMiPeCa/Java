package cl.curso.java.guia11.Threads.ejercicio2;

public class Animal implements Runnable{

	private String nombre;
	private int velocidad;
	private long descanso;
	private int posicion;
	private static boolean carreraFinalizada;
	
	
	/**
	 * 
	 */
	public Animal() {
	}


	/**
	 * @param nombre
	 * @param velocidad
	 * @param descanso
	 * @param posicion
	 * @param carreraFinalizada
	 */
	public Animal(String nombre, int velocidad, long descanso, int posicion, boolean carreraFinalizada) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanso = descanso;
		this.posicion = posicion;
		this.carreraFinalizada = carreraFinalizada;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}


	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	/**
	 * @return the descanso
	 */
	public long getDescanso() {
		return descanso;
	}


	/**
	 * @param descanso the descanso to set
	 */
	public void setDescanso(long descanso) {
		this.descanso = descanso;
	}


	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}


	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	/**
	 * @return the carreraFinalizada
	 */
	public boolean isCarreraFinalizada() {
		return carreraFinalizada;
	}


	/**
	 * @param carreraFinalizada the carreraFinalizada to set
	 */
	public void setCarreraFinalizada(boolean carreraFinalizada) {
		this.carreraFinalizada = carreraFinalizada;
	}


	@Override
	public void run() {
		
			do {
				
				if(this.getPosicion()>=1000)
				{
					System.out.println("Conejo ganador: "+this.getNombre());
					this.setCarreraFinalizada(true);
				}
				else
				{
					if(this.getPosicion()<=999)
					{
						this.setPosicion(this.getPosicion()+this.getVelocidad());
						System.out.println("Avanza "+this.getPosicion()+" mts "+this.getNombre());
						
					}
				}
				
				try {
					
					Thread.sleep((long) (0 + (Math.random()  * this.descanso)));
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				
			} while (!this.isCarreraFinalizada());
		
			
	
		
		
	}
	
	
}
