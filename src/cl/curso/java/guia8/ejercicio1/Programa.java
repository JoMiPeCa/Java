package cl.curso.java.guia8.ejercicio1;

import javax.swing.JOptionPane;

public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog(
				"1. Probar Metodos\n"
				+ "2. Salir\n" 
				+ "Ingrese Opcion");

		return opcion;
	}
	
	public static String print(String arg){
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		Reloj datos = new Reloj();
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				
				JOptionPane.showMessageDialog(null, "Reloj en 0 0 0");
				JOptionPane.showMessageDialog(null, datos.imprimir());
				
				datos.avanzarSegundo();
				JOptionPane.showMessageDialog(null, "Avanzar 1 "+datos.imprimir());
				datos.retrocederSegundo();
				JOptionPane.showMessageDialog(null, "Retrasar 1 "+datos.imprimir());
				
				break;
			
			case "2":
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
