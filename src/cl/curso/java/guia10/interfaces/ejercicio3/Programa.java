package cl.curso.java.guia10.interfaces.ejercicio3;

/**
 * 
 */

import javax.swing.JOptionPane;



public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Probar Metodos Libro\n" + "2. Probar Metodos Revista\n"
				+ "4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;

		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				Libro datos = new Libro("NomBre","EditoRiAl");
				JOptionPane.showMessageDialog(null, datos.getNombre());
				break;

			case "2":
				Revista dato = new Revista(45,"BlancaCabra","Guille+Javi");
				JOptionPane.showMessageDialog(null, dato.getNombre());
				break;

			case "4":
				opcionSalir = true;
				JOptionPane.showMessageDialog(null, "Usted ha salido del sistema. Gracias por operar con nosotros.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERROR 404 NOT FOUND ON THE STYSTEM");
				break;
			}
		} while (!opcionSalir);
	}
}
