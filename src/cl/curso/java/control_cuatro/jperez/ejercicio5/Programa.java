/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio5;

import javax.swing.JOptionPane;

import cl.curso.java.guia10.herencia.ejercicio1.Circulo;
import cl.curso.java.guia10.herencia.ejercicio1.Cuadrado;
import cl.curso.java.guia10.herencia.ejercicio1.Triangulo;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Ejecutar PRESTAMO\n" + "2. Mostrar informacion\n"
				+ "3. Ejecutar DEVOLUCION \n" + "4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		Libro datos = new Libro("Juanito el curioso", "Editorial Emplea", 10, 3);
		ReservaLibroThread reserva1 = new ReservaLibroThread(datos);
		ReservaLibroThread reserva2 = new ReservaLibroThread(datos);
		ReservaLibroThread reserva3 = new ReservaLibroThread(datos);
		DevolverLibroThread devolver1 = new DevolverLibroThread(datos);
		DevolverLibroThread devolver2 = new DevolverLibroThread(datos);
		DevolverLibroThread devolver3 = new DevolverLibroThread(datos);

		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				try {
					reserva1.start();
					reserva2.start();
					reserva3.start();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());

				}
				break;

			case "2":
				JOptionPane.showMessageDialog(null, "Libros: " + datos.getCantidadLibros());
				JOptionPane.showMessageDialog(null, "Prestados: " + datos.getCantidadLibrosPrestados());

				break;

			case "3":
				try {
					devolver1.start();
					devolver2.start();
					devolver3.start();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());

				}
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
