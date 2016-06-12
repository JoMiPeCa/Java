/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Buscar por Rut\n" + "2. Ordenar por Nombre(EDAD)\n"
				+ "3. Ordenar por Departamento \n" + "4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		List<Empleado> dat = new ArrayList();
		for (int i = 0; i < 10; i++) {

			Empleado lista = new Empleado(500,
					i % 2 == 0 ? new Departamento("Familiar", "desc") : new Departamento("Studio", "desc22"),
					"17700879" + i, "nombre", "apellido", (i + 50));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dat.add(lista);

		}
		Empresa datos = new Empresa(5, dat);

		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				try {
					String run = JOptionPane.showInputDialog("Ingrese Run");
					Empleado e = datos.buscarEmpleado(run);
					print(e.getDepartamento().getNombre());
				} catch (NotFoundException nfe) {
					nfe.printStackTrace();
				}
				break;

			case "2":
				datos.ordenarEmpleadosPorEdad();
				datos.imprimir();

				break;

			case "3":
				datos.ordenarEmpleadosPorDepartamento();
				datos.imprimir();

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
