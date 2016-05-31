package cl.curso.java.guia11.ejercicio5;

import javax.swing.JOptionPane;

public class CuadroDialogo {

	public static void main(String[] args) {
		int aux1 = 0;
		boolean validar = false;
		do {
			
			try {
				
				String aux = JOptionPane.showInputDialog("Ingrese un numero: ");
				aux1 = Integer.parseInt(aux.trim());
				validar = true;
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(),"Error" , JOptionPane.ERROR_MESSAGE);
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, e.getMessage(),"Error" , JOptionPane.ERROR_MESSAGE);
				}
			
		} while (!validar);
	
	}
}
