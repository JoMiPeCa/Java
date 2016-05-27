package cl.curso.java.guia11.guion1.ejercicio3;



public class Asiento {

	private boolean reservado;

	public Asiento(boolean reservado) {
		super();
		this.reservado = reservado;
	}

	public Asiento() {
		super();
		this.reservado = false;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

}
