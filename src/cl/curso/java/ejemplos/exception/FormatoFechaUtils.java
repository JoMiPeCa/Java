package cl.curso.java.ejemplos.exception;

/**
 * 
 * @author Juan Maldonado León
 *
 */
public final class FormatoFechaUtils {

	public static final String[] NOMBRE_MESES = {"enero", "febrero", "marzo", "abril", "mayo"};
	/**
	 * imprime la fecha con el siguiente formato dd-mm-aaaa
	 */
	public static void formatFecha( int dia, int mes, int anio )
	{
		System.out.println( dia + "-" + mes + "-" + anio);
	}
	
	/**
	 * imprime la fecha con el siguiente formato
	 * ej 23 de mayo de 1995. 
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public static void formatFechaDos( int dia, int mes, int anio )
	{
		String nombreMes = NOMBRE_MESES[ mes -1 ];
		System.out.println( 
				dia + " de " + 
						nombreMes + " de " + 
							anio);
	}
}
