package cl.curso.java.guia11.guion1.ejercicio3;


public class Bus {
	private String nombre;
	private Asiento[] asientos;

	public Bus(String nombre, Asiento[] asientos) {
		super();
		this.nombre = nombre;
		this.asientos = asientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asiento[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}

	public synchronized void reservarAsiento(int numeroDeAsiento) {
		if (!this.getAsientos()[numeroDeAsiento].isReservado()) {
			this.getAsientos()[numeroDeAsiento].setReservado(true);
			System.out.println("El asiento Nro:"+numeroDeAsiento + " fue reservado con exito");
		} else {
			System.out.println("El asiento Nro:"+numeroDeAsiento+" ya está reservado");
		}
	}
}
