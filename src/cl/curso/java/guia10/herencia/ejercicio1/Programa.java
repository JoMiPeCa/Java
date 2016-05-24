/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio1;

import javax.swing.JOptionPane;



public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Probar Metodos Cuadrado\n" + "2. Probar Metodos Triangulo\n"
				+ "3. Probar Metodos Circulo\n" + "4. Salir\n" + "Ingrese Opcion");

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
				Cuadrado datos = new Cuadrado(4);
				JOptionPane.showMessageDialog(null, "Calculo Area " + datos.calcularArea());
				break;

			case "2":
				Triangulo dato = new Triangulo(3,4);
				JOptionPane.showMessageDialog(null, "Calculo Triangulo " + dato.calcularArea());
				break;

			case "3":
				Circulo dat = new Circulo(4.6);
				JOptionPane.showMessageDialog(null, "Calculo Circulo " + dat.calcularArea());				break;

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
