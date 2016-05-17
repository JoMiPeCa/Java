package cl.curso.java.ejemplos.superheroes;

/**
 * Programa que emula la resistencia de 
 * superheroes ante armas especificas
 * @author Juan Maldonado León
 *
 */
public class Programa {

	/**
	 * Inicio del programa
	 * @param args argumentos iniciales
	 */
	public static void main(String[] args) {
		Batman bt = new Batman();
		Superman sp = new Superman();
		Kryptonita criptonita = new Kryptonita();
		Granada granada = new Granada();
		
		bt.recibirAtaque(granada);
		bt.recibirAtaque(criptonita);
		
		sp.recibirAtaque(granada);
		sp.recibirAtaque(criptonita);

	}

}
