package cl.curso.java.guia11.guion1.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Animal implements Runnable {

	private String nombre;
	private int velocidad;
	private long descanso;
	private int posicion;
	private static boolean carreraFinalizada;

	
	
	
	/**
	 * @param nombre
	 * @param velocidad
	 * @param descanso
	 * @param posicion
	 */
	public Animal(String nombre, int velocidad, long descanso, int posicion) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanso = descanso;
		this.posicion = posicion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
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
	 * @param velocidad
	 *            the velocidad to set
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
	 * @param descanso
	 *            the descanso to set
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
	 * @param posicion
	 *            the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the carreraFinalizada
	 */
	public static boolean isCarreraFinalizada() {
		return carreraFinalizada;
	}

	/**
	 * @param carreraFinalizada
	 *            the carreraFinalizada to set
	 */
	public static void setCarreraFinalizada(boolean carreraFinalizada) {
		Animal.carreraFinalizada = carreraFinalizada;
	}

	@Override
	public void run() {

		while (!carreraFinalizada) {
			
			if( this.getPosicion() >= 100 )
			{
				Animal.carreraFinalizada = true;
				System.out.println( "La carrera finalizo, el ganador es : " + this.getNombre() );
			}
			else
			{
				this.setPosicion( this.getPosicion() + this.getVelocidad() );
				try {
					Thread.sleep((long)(0 + Math.random() * this.getDescanso())  );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println( this.getNombre() + " posicion :" + this.getPosicion() );
			}
		}

	}

}
