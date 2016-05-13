package cl.curso.java.guia7.ejercicio1;

import javax.swing.JOptionPane;

public class Programa {

	public static String menu() {

		String opcion = JOptionPane.showInputDialog("1. Ingresar Datos\n" + "2. Mostrar Datos\n" + "3. Abonar Dinero\n"
				+ "4. Retirar dinero\n" + "5. Salir\n" + "Ingrese Opcion");

		return opcion;
	}
	
	public static String print(String arg){
		return JOptionPane.showInputDialog(arg);
	}

	public static void main(String[] args) {

		boolean opcionSalir = false, creado = false;
		CuentaVista datos = new CuentaVista();
		String opc;

		do {
			opc = menu();

			switch (opc) {

			case "1":
				datos = new CuentaVista(Long.parseLong(JOptionPane.showInputDialog("Ingrese Numero de Cuenta")),
						JOptionPane.showInputDialog("Ingrese Nombre de Cuenta"),
						JOptionPane.showInputDialog("Ingrese RUT "));
				creado = true;
				break;
			case "2":
				if (creado) {
					JOptionPane.showInputDialog(datos.toString());
				} else {
					JOptionPane.showMessageDialog(null, "No se han ingresado datos!!!");
				}
				break;
			case "3":
				if (creado) {
					int abono = 0, saldo = 0;
					abono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad a abonar"));
					if (abono > 0) {
						saldo = datos.getSaldo();
						saldo = saldo + abono;
						datos.setSaldo(saldo);
					} else {
						print("Valor Erroneo o Negativo!!!!");
					}

				} else {
					JOptionPane.showMessageDialog(null, "No se han ingresado datos!!!");
				}
				break;
			case "4":
				if (creado) {
					int resto = 0, saldo = 0;
					resto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad a retirar"));
					saldo = datos.getSaldo();
					if (saldo < resto) {
						JOptionPane.showMessageDialog(null,
								"Saldo insuficiente para realizar la operacion! Abone mas dinero primero.");
					}else if (resto<0) {
							JOptionPane.showMessageDialog(null,
									"No puede retirar dinero NEGATIVO");
					} else {
						saldo = saldo - resto;
						datos.setSaldo(saldo);
					}
				} else {
					JOptionPane.showMessageDialog(null, "No se han ingresado datos!!!");
				}
				break;
			case "5":
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
