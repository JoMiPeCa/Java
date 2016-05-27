/**
 * 
 */
package cl.curso.java.control_cuatro.jperez.ejercicio6;

import javax.swing.JOptionPane;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog(
				"1. Vender Auto\n" + 
				"2. Mostrar informacion\n"	+ 
				"3. NADA \n" + 
				"4. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false;
		Auto datos = new Auto("JuanitoMotors","JuanStar",2016,1);
				
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				try{
				datos.venderAuto();
				}catch (SinStockException s){
//					throw new SinStockException(s.getMessage());
					s.printStackTrace();
					JOptionPane.showMessageDialog(null, s.getMessage());
				}
				break;

			case "2":
				JOptionPane.showMessageDialog(null, "Stock: "+datos.getStock());
				JOptionPane.showMessageDialog(null, "Marca: "+datos.getMarca());
				JOptionPane.showMessageDialog(null, "Modelo: "+datos.getModelo());

				break;

			case "3":
				
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
