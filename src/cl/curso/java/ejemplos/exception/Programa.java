package cl.curso.java.ejemplos.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

/**
 * 
 * @author Juan Maldonado León
 * Programa que crea dos fechas y valida si son correctas
 * segun el dia y el mes. 
 */
public class Programa {

	/**
	 * 
	 * @param args argumentos del programa
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		
		String fecha = JOptionPane.showInputDialog("Ingrese una fecha");
		
		try {
			SimpleDateFormat sFormat = new SimpleDateFormat("'");
			sFormat.format(new Date());
			Date date = sFormat.parse(fecha);
		}
		catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error", 
					"La fecha ingresada no es Correcta", 
					JOptionPane.ERROR_MESSAGE);
		}
		catch( Exception e )
		{
			JOptionPane.showMessageDialog(null, "Error", 
					"La fecha ingresada no es Correcta", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		
		
//		FormatoFechaUtils.formatFecha(12, 1, 2016);
		
//		Fecha fecha1 = new Fecha();
//		System.out.println(fecha1.toString());
//		
//		Fecha fecha2 = new Fecha(112, 15, 2016);
//		System.out.println(fecha2.toString());
		
		
//		fecha1.imprimirFecha();
//		fecha1.imprimirFechaFormato();
//		
//		fecha2.imprimirFecha();
//		fecha2.imprimirFechaFormato();
//		
//		System.out.println( fecha1.validarDia() );
//		System.out.println( fecha2.validarDia() );
//		
//		System.out.println( fecha1.validarMes() );
//		System.out.println( fecha2.validarMes() );
		
		
		
	}

}
