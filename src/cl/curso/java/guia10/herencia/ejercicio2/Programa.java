/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio2;

import javax.swing.JOptionPane;



public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Probar EmpleadoContratado\n"+ "2.- Probar EmpleadoComision\n" + "4. Salir\n" + "Ingrese Opcion");

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
				Empleado datos = new EmpleadoContratado("juan",4);
				JOptionPane.showMessageDialog(null, "Salario " + datos.calcularSalario());
				break;
			case "2":
				Empleado dat = new EmpleadoComision(10,4);
				JOptionPane.showMessageDialog(null, "Salario " + dat.calcularSalario());
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
