package cl.curso.java.guia11.Threads.ejercicio2;

public class Programa {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Animal ani = new Animal("Conejo negro",1,20,1,false);
		Animal ani1 = new Animal("Conejo blanco", 1,20,1, false);
		Animal ani2 = new Animal("Conejo azul", 1,20,1, false);
		
		Thread thread1 = new Thread(ani);
		Thread thread2 = new Thread(ani1);
		Thread thread3 = new Thread(ani2);
		
		
			thread1.start();
			thread2.start();
			thread3.start();
		
		
	}

}
