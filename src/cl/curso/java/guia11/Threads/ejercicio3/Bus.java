package cl.curso.java.guia11.Threads.ejercicio3;

public class Bus {

	private String nombre;
	private Asiento[] asientos;
	
	/**
	 * 
	 */
	public Bus() {
	}
	
	/**
	 * @param nombre
	 * @param asientos
	 */
	public Bus(String nombre, Asiento[] asientos) {
		this.nombre = nombre;
		this.asientos = asientos;
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
	 * @return the asientos
	 */
	public Asiento[] getAsientos() {
		return asientos;
	}
	/**
	 * @param asientos the asientos to set
	 */
	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}
	
	public synchronized void reservarAsiento(int numeroAsiento)
	{
		if(!this.getAsientos()[numeroAsiento].isReservado())
		{
			this.getAsientos()[numeroAsiento].setReservado(true);
			System.out.println("El asiento "+numeroAsiento+" se reservo con exito");
		}
		else
		{
			System.out.println("El asiento "+numeroAsiento+" esta reservado");
		}
	}
}
