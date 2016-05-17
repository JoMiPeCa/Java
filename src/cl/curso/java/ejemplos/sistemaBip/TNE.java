package cl.curso.java.ejemplos.sistemaBip;


import java.util.Date;

public abstract class TNE extends TarjetaBip {
	
	private String nombre;
	private Date fecha;
	
	public TNE()
	{
		this.nombre = "juan";
		this.fecha = new Date();
	}
	
	
	
	/**
	 * @param saldo
	 * @param numeroTarjeta
	 */
	public TNE(int saldo, int numeroTarjeta, String nombre, Date fecha) {
		super(saldo, numeroTarjeta);
		this.nombre = nombre;
		this.fecha = fecha;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the date
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param date the date to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * 
	 */
	public void imprimir()
	{
		super.imprimir();
		System.out.println( this.getNombre() );
		System.out.println( this.getFecha() );
	}
	
}
