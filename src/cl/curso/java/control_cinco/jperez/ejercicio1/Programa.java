/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio1;

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

		String opcion = JOptionPane.showInputDialog(
				"1. Crear Datos\n" + 
				"2. Ordenar por Fecha\n"	+ 
				"3. Ordenar por Tipo \n" + 
				"4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		List<Transaccion> transacciones = new ArrayList();
		for (int i = 0; i < 12; i++) {
			
			Transaccion lista = new Transaccion(""+i,i%2==0?TipoTransaccion.ABONO:TipoTransaccion.DEPOSITO,new Date(),50000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			transacciones.add(lista);

		}
		CuentaBancaria datos = new CuentaBancaria(12345, transacciones);
		
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				break;

			case "2":
				datos.ordenarTransaccionesPorFecha();
				datos.imprimir();

				break;

			case "3":
				datos.ordenarTransaccionesPorTipo();
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
