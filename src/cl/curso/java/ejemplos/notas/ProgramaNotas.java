package cl.curso.java.ejemplos.notas;

import javax.swing.JOptionPane;
/**
 * 
 * @author Juan Maldonado León
 * Programa Inicial
 */
public class ProgramaNotas {
	

	/**
	 * Solicita por pantalla las notas del alumno (3)
	 * (Cuadros de dialogo JOptionPane)
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Nota[] notax = new Nota[3];

		for( int i = 0; i < notax.length ; i++ )
		{
			String nota = 
				JOptionPane.showInputDialog("Ingresar nota " + i);
			String porcentaje = 
				JOptionPane.showInputDialog("Ingresar porcentaje " + i);
			notax[i] = new Nota("", Integer.parseInt(nota), 
					Integer.parseInt(porcentaje));
		}
		
		Alumno alumno = new Alumno("Juan", notax );
		JOptionPane.showMessageDialog(null, "Promedio es : " + 
		alumno.calcularPromedio() ); 
		
	}

}
