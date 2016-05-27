package cl.curso.java.guia11.guion1.ejercicio3;


public class ReservaThread extends Thread {
	private Bus bus;
	private int numeroDeAsiento;

	public ReservaThread(Bus bus, int numeroDeAsiento) {
		super();
		this.bus = bus;
		this.numeroDeAsiento = numeroDeAsiento;
	}

	public ReservaThread() {
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getNumeroDeAsiento() {
		return numeroDeAsiento;
	}

	public void setNumeroDeAsiento(int numeroDeAsiento) {
		this.numeroDeAsiento = numeroDeAsiento;
	}

	@Override
	public void run() {
		this.getBus().reservarAsiento(this.getNumeroDeAsiento());
	}
}
