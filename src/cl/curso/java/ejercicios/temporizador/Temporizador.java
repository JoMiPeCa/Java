/**
 * 
 */
package cl.curso.java.ejercicios.temporizador;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Temporizador extends Thread {

	@Override
	public void run() {
		String[] numbers = { "cero","uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		try {
			for (int i = 9; i >= 0; i--) {
				sleep(1000);
				System.out.println(numbers[i]);
			}

		} catch (InterruptedException ex) {

		}
	}
}
