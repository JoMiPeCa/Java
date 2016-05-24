package cl.curso.java.ejemplos.dataRaces;

/**
 * 
 */

import javax.swing.JOptionPane;



public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Probar Metodos \n" + "2. VACIO\n"
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
				Contador contado = new Contador(0);
				AumentaThread aumento = new AumentaThread(contado);
				AumentaThread aumentoHilo = new AumentaThread(contado);
				AumentaThread aumenta3 = new AumentaThread(contado);
				aumento.start();
				aumentoHilo.start();
				aumenta3.start();
				JOptionPane.showMessageDialog(null, contado.getCuenta());
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
