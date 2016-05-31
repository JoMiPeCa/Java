package cl.curso.java.guia11.Threads.ejercicio3;

public class Asiento {

	private boolean reservado;

	
	/**
	 * 
	 */
	public Asiento() {
		this.reservado = false;
	}

	/**
	 * @param disponible
	 */
	public Asiento(boolean reservado) {
		this.reservado = reservado;
	}

	/**
	 * @return the disponible
	 */
	public boolean isReservado() {
		return reservado;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
}
