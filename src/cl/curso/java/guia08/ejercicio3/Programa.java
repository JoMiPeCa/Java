package cl.curso.java.guia08.ejercicio3;

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
		Empleado datos = new Empleado(null,null,0,0,0);
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				JOptionPane.showMessageDialog(null, "Sueldo 100k horas extras 10 pago hora extra 15");
				datos.setSueldoBase(100000);
				datos.setHorasExtrasRealizadas(10);
				datos.setPagoHoraExtra(1500);
				JOptionPane.showMessageDialog(null, "BRUTO "+datos.sBruto());
				JOptionPane.showMessageDialog(null, "LIQUIDO "+datos.sLiquido());
				
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
