package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class CuadroDeDialogo {
	
	public static void main(String[] args){
		String nota1 = JOptionPane.showInputDialog("Ingrese Nota 1");
		String nota2 = JOptionPane.showInputDialog("Ingrese Nota 2");
		String nota3 = JOptionPane.showInputDialog("Ingrese Nota 3");
		
		int n1,n2,n3,total;
		n1 = Integer.parseInt(nota1);
		n2 = Integer.parseInt(nota2);
		n3 = Integer.parseInt(nota3);
		
		total = (n1+n2+n3)/3;
				
		
		JOptionPane.showMessageDialog(null, "Su promedio es: "+total);
	}
}
