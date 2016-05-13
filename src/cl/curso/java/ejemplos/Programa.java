package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args){
		
		boolean opcionSalir = false;
		do{
			String opcion = JOptionPane.showInputDialog("1 Encender Auto\n"
					+ "2 Avanzar\n"
					+ ""
					+ ""
					+ "4 Imprimir\n"
					+ "5 Salir");
		}
		while(!opcionSalir);
	}
}
