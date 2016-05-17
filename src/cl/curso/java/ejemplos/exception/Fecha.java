package cl.curso.java.ejemplos.exception;


/**
 * Clase que representa una Fecha Ej
 * 23 de mayo de 1995 
 * @author Juan Maldonado León
 */
public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	private final String[] nombreMeses = {"enero", "febrero", "marzo", "abril", 
			"mayo", "junio", "julio", "agosto", "septiembre"
			,"octubre", "noviembre", "diciembre" };
	
	private final int[] cantidadDiasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	
	/**
	 * 
	 */
	public Fecha()
	{
		this.dia = 23;
		this.mes = 5;
		this.anio = 1995;
	}

	/**
	 * @param dia del anio (1-31)
	 * @param mes del anio (1-12)
	 * @param anio en particular
	 */
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	/**
	 * imprime la fecha con el siguiente formato dd-mm-aaaa
	 */
	public void imprimirFecha()
	{
		FormatoFechaUtils.formatFecha(12, 1, 2016);
		System.out.println( this.getDia() + "-" +  
				this.getMes() + "-" + this.getAnio());
	}
	
	
	/**
	 * imprime la fecha con el siguiente formato
	 * ej 23 de mayo de 1995. 
	 */
	public void imprimirFechaFormato()
	{
		String nombreMes = nombreMeses[ this.getMes() -1 ];
		System.out.println( 
				this.getDia() + " de " + 
						nombreMes + " de " + 
							this.getAnio());
	}
	
	/**
	 * 
	 * @return retorna si el año de la clase es bisiesto
	 */
	public boolean esBisiesto()
	{	
		return ((this.getAnio() % 4 == 0 || 
				this.getAnio() % 400 == 0 ) && 
				this.getAnio() % 100 != 0);  
	}
	
	
	/**
	 * Valida si el dia esta entre 1 y la numero maximo de dias que 
	 * puede tener un mes en particular
	 * @return retorna un booleano si el dia es valido o no
	 * @throws DiaNoValidoException 
	 * @throws MesNoValidoException 
	 */
	public void validarDia() throws DiaNoValidoException, MesNoValidoException
	{
		validarMes();
		if( this.getMes() == 2 && this.esBisiesto() )
		{
			if(! (this.getDia() >= 1 && this.getDia() <= 29 ))
			{
				throw new DiaNoValidoException("Si el año es bisiesto, no"
						+ "puede exceder de 29 días");
			}
		}
		else
		{
			int cantDias = cantidadDiasMes[ this.getMes() -1 ];
			if( !(this.getDia() >=1 && this.getDia() <= cantDias) )
			{
				throw new DiaNoValidoException("Excede el numero maximo"
						+ "segun el mes " + this.getMes() );
			}
		}
//		else
//		{
//			return false;
//		}
		
	}
	
	/**
	 * 
	 * @return retorna un booleano si e mes es valido o no
	 * @throws MesNoValidoException 
	 */
	public void validarMes() throws MesNoValidoException
	{
		if( !(  this.getMes() >=1 && this.getMes() <=12 ) )
		{
			throw new MesNoValidoException( "El mes debe estar "
					+ "entre 1 y 12" );
		}
	}
	
	/**
	 * devuelve un string que representa la clase
	 * Fecha
	 */
	public String toString()
	{
		return this.getDia() + "-" +  
				this.getMes() + "-" + this.getAnio();
	}
	
}
