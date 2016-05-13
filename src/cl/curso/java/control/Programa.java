package cl.curso.java.control;

import javax.swing.JOptionPane;

public class Programa {

	public static String menu() {
		String opcion = JOptionPane
				.showInputDialog("1. Programa Articulo\n" + "2. Programa Libro\n" + "3. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String menuArticulo() {

		String opcion = JOptionPane
				.showInputDialog("1. Ingresar Articulo\n" + "2. Mostrar Articulo\n" + "3. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String menuLibro() {

		String opcion = JOptionPane.showInputDialog("1. Ingresar Libro\n" + "2. Mostrar Libro\n" + "3. Prestar Libro\n"
				+ "4. Devolver Libro\n" + "5. Salir\n" + "Ingrese Opcion");

		return opcion;
	}

	public static String print(String arg) {
		return JOptionPane.showInputDialog(arg+"\n Presione tecla para continuar");
	}

	public static void main(String[] args) {

		boolean opcionSalir = false, creado = false;
		Articulo articulo = new Articulo();
		Libro libro = new Libro();
		String opc;

		do {
			opc = menu();
			creado = false;

			switch (opc) {

			case "1":

				do {
					opc = menuArticulo();

					switch (opc) {

					case "1":
						articulo = new Articulo(JOptionPane.showInputDialog("Ingrese Nombre Articulo"),
								Long.parseLong(JOptionPane.showInputDialog("Ingrese Costo Base")));
						creado = true;
						break;
					case "2":
						if (creado) {
							JOptionPane.showMessageDialog(null, articulo.imprimir());
						} else {
							JOptionPane.showMessageDialog(null, "No se ha ingresado ningun articulo!!!");
						}
						break;
					case "3":
						opcionSalir = true;
						JOptionPane.showMessageDialog(null,
								"Usted ha salido del sistema de articulo, Sera redirigido al menu principal");
						break;
					default:
						JOptionPane.showMessageDialog(null, "ERROR 404 NOT FOUND ON THE SYSTEM");
						break;
					}
				} while (!opcionSalir);
				opcionSalir = false;
				break;

			case "2":

				do {
					opc = menuLibro();
					
					switch (opc) {

					case "1":
						libro = new Libro(JOptionPane.showInputDialog("Ingrese Titulo del Libro"),
								JOptionPane.showInputDialog("Ingrese Autor del Libro"),
								Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Ejemplares")),
								Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Ejemplares Prestados")));
						creado = true;
						break;
					case "2":
						if (creado) {
							JOptionPane.showMessageDialog(null, libro.imprimir());
						} else {
							JOptionPane.showMessageDialog(null, "No se ha ingresado ningun libro!");
						}
						break;
					case "3":
						if (creado) {
							print("Procesando su solicitud");
							if (libro.getNumeroEjemplares() > libro.getNumeroEjemplaresPrestados()) {
								libro.prestarLibro();
								print("Solicitud Procesada correctamente");
							} else {
								print("No Quedan Ejemplares :(");
							}

						} else {
							JOptionPane.showMessageDialog(null, "No se ha ingresado ningun libro!");
						}
						break;
					case "4":
						if (creado) {
							print("Procesando su solicitud");
							libro.devolverLibro();
							print("Solicitud Procesada Correctamente");
						} else {
							JOptionPane.showMessageDialog(null, "No se ha ingresado ningun libro!");
						}
						break;
					case "5":
						opcionSalir = true;
						JOptionPane.showMessageDialog(null,
								"Usted ha salido del sistema de Libro, Sera redirigido al menu principal.");
						break;
					default:
						JOptionPane.showMessageDialog(null, "ERROR 404 NOT FOUND ON THE SYSTEM");
						break;
					}
				} while (!opcionSalir);
				opcionSalir = false;
				break;

			case "3":
				opcionSalir = true;
				JOptionPane.showMessageDialog(null, "Usted ha salido del sistema. Gracias por operar con nosotros.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERROR 404 NOT FOUND ON THE SYSTEM");
				break;
			}

		} while (!opcionSalir);

	}
}
