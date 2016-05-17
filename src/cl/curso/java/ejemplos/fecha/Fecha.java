package cl.curso.java.ejemplos.fecha;


/**
 * 
 * @author Juan Maldonado León
 * Clase que representa una Fecha Ej
 * 23 de mayo de 1995
 */
public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	public final String[] nombreMeses = {"enero", "febrero", "marzo", "abril", "mayo"};
	public final int[] cantidadDiasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
	
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
	 */
	public boolean validarDia()
	{
		if( validarMes() )
		{
			if( this.getMes() == 2 && this.esBisiesto() )
			{
				return ( this.getDia() >= 1 && this.getDia() <= 29);
			}
			else
			{
				int cantDias = cantidadDiasMes[ this.getMes() -1 ];
				return this.getDia() >=1 && this.getDia() <= cantDias;
			}
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * 
	 * @return retorna un booleano si e mes es valido o no
	 */
	public boolean validarMes()
	{
		return this.getMes() >=1 && this.getMes() <=12;
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
