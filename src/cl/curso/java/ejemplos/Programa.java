package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

import cl.curso.java.guia09.item2.ejercicio4.Tienda;

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
			//EjemploHilo thread = new EjemploHilo();
			Thread thread = new Thread(new EjemploHilo2());
			
			String opc;

			do {
				opc = menu();

				switch (opc) {

				case "1":
					//thread.run();
					thread.start();
					System.out.println("metodo main; el nombre del thread es: "+Thread.currentThread().getName());
					//JOptionPane.showMessageDialog(null, "BRUTO "+datos.sBruto());
					//JOptionPane.showMessageDialog(null, "LIQUIDO "+datos.sLiquido());
					
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
