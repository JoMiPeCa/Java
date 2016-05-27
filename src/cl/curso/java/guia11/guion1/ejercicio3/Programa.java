package cl.curso.java.guia11.guion1.ejercicio3;


public class Programa {

	public static void main(String[] args) {
		Asiento[] asientos = { new Asiento(), new Asiento(), new Asiento() };
		Bus bus = new Bus("K1000-O", asientos);
		ReservaThread hilo1 = new ReservaThread(bus, 1);
		ReservaThread hilo2 = new ReservaThread(bus, 1);
		hilo1.start();
		hilo2.start();
	}
}
