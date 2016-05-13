package cl.curso.java.ejemplos.personas;

import javax.swing.JOptionPane;

public class Programa {
	
	public static String menu(){
        
		String opcion = JOptionPane.showInputDialog("1. Ingresar Datos\n" + "2. Mostrar Datos\n" + "3. Salir\n" + "Ingrese Opcion");
        
        return opcion;
    }

	public static void main(String[] args){
		
		boolean opcionSalir = false,creado=false;
		Persona datos = new Persona();
		String opc;
		
		do{
			opc = menu();
						
			switch(opc){
			
			case "1":
				datos = new Persona(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad")),JOptionPane.showInputDialog("Ingrese Nombre"), JOptionPane.showInputDialog("Ingrese Apellido Paterno"), JOptionPane.showInputDialog("Ingrese Apellido Materno"));
				creado = true;
				break;
			case "2":
				if(creado){
					JOptionPane.showInputDialog(datos.toString());
				}else{
					JOptionPane.showMessageDialog(null, "No se han ingresado datos!!!");
				}
				break;
			case "3":
				opcionSalir = true;
				break;
			default:
				break;
			}
		}
		while(!opcionSalir);
	}
}
