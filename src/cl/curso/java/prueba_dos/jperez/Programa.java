/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

import javax.swing.JOptionPane;

import cl.curso.java.prueba_dos.jperez.Alumno;
import cl.curso.java.prueba_dos.jperez.Curso;
import cl.curso.java.prueba_dos.jperez.Persona;

public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Probar Metodos Persona\n" + "2. Probar Metodos Curso\n"
				+ "3. Probar Metodos Tren\n" + "4. Salir\n" + "Ingrese Opcion");

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
				Persona datos = new Persona("juan", 28, "RutFalso", 80, 180);
				JOptionPane.showMessageDialog(null, "IMC " + datos.calcularIMC());
				break;

			case "2":
				JOptionPane.showMessageDialog(null, "ERROR 2411 NOT IMPLEMENTED");

				break;

			case "3":
				/**
				 * Creacion de las 5 Instancias
				 */
				Tren trenRojo = new TrenRutaRoja();
				Tren trenVerde = new TrenRutaVerde();
				Estacion EstacionVerde = new EstacionRutaVerde();
				Estacion EstacionRoja = new EstacionRutaRoja();
				Estacion EstacionComun = new EstacionComun();

				System.out.println("BOOM !!!");
				// JOptionPane.showMessageDialog(null, );
				// JOptionPane.showMessageDialog(null, "LIQUIDO
				// "+datos.sLiquido());

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
