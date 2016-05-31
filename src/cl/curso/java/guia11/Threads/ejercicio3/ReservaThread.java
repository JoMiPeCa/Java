package cl.curso.java.guia11.Threads.ejercicio3;

public class ReservaThread extends Thread {

	private Bus bus;
	private int numeroAsiento;
	
	
	/**
	 * 
	 */
	public ReservaThread() {
	}

	/**
	 * @param bus
	 * @param numeroAsiento
	 */
	public ReservaThread(Bus bus, int numeroAsiento) {
		this.bus = bus;
		this.numeroAsiento = numeroAsiento;
	}


	/**
	 * @return the bus
	 */
	public Bus getBus() {
		return bus;
	}


	/**
	 * @param bus the bus to set
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
	}


	/**
	 * @return the numeroAsiento
	 */
	public int getNumeroAsiento() {
		return numeroAsiento;
	}


	/**
	 * @param numeroAsiento the numeroAsiento to set
	 */
	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}


	@Override
	public void run() {
		
		this.getBus().reservarAsiento(this.getNumeroAsiento());
	}
}
