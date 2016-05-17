package cl.curso.java.ejemplos.fecha;

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
	 */
	public static void main(String[] args) {
		
		Fecha fecha1 = new Fecha();
		System.out.println(fecha1.toString());
		
		Fecha fecha2 = new Fecha(112, 15, 2016);
		System.out.println(fecha2.toString());
		
		
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
