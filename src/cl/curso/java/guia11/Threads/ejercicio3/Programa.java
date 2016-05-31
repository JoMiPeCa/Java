package cl.curso.java.guia11.Threads.ejercicio3;

public class Programa {

	public static void main(String[] args) {
		
		Asiento[] asientos = {new Asiento(), new Asiento(), new Asiento()};
		Bus bus = new Bus("G22", asientos);
		
		ReservaThread hilo1 = new ReservaThread(bus, 0);
		ReservaThread hilo2 = new ReservaThread(bus, 0);
		
		hilo1.start();
		hilo2.start();
	}

}
