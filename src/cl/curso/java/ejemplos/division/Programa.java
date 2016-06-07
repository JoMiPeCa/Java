/**
 * 
 */
package cl.curso.java.ejemplos.division;

import javax.swing.JOptionPane;

/**
 * @author Joseph Perez Carmona
 *
 */
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
		Division datos = new Division();
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				try{
					String div = JOptionPane.showInputDialog("Dividendo");
					String divi = JOptionPane.showInputDialog("Divisor");
					
				}
				catch(Exception e){
					
				}
				JOptionPane.showMessageDialog(null, "Sueldo 100k horas extras 10 pago hora extra 15");
				
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
