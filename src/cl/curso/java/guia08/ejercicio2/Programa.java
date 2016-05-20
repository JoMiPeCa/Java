package cl.curso.java.guia08.ejercicio2;

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
		Fecha datos = new Fecha();
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				JOptionPane.showMessageDialog(null, datos.printDate());
				JOptionPane.showMessageDialog(null, datos.printDateLarge());
				datos.setDia(35);
				JOptionPane.showMessageDialog(null, "Dia35 "+datos.validarDia());
				datos.setMes(15);
				JOptionPane.showMessageDialog(null, "Mes15 "+datos.validarMes());
				datos.setAnio(2016);
				JOptionPane.showMessageDialog(null, "Año 2016 "+datos.bisiesto(datos.getAnio()));
				
				
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
