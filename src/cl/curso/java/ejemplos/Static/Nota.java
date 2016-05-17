package cl.curso.java.ejemplos.Static;

public class Nota {
	
	private String nombre;
	private double valorNota;
	private double porcentaje;
	private static int cantidadInstancias;//clase
	private int cantidadInstanciasNoStatic;//instancia
	
	/**
	 * 
	 */
	public Nota()
	{
		cantidadInstancias++;
		cantidadInstanciasNoStatic++;
	}

	/**
	 * @param nombre
	 * @param nota
	 * @param porcentaje
	 */
	public Nota(String nombre, double nota, double porcentaje) {
		super();
		this.nombre = nombre;
		this.valorNota = nota;
		this.porcentaje = porcentaje;
		
		cantidadInstancias++;
		cantidadInstanciasNoStatic++;
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
	 * @return the nota
	 */
	public double getValorNota() {
		return valorNota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setValorNota(double nota) {
		this.valorNota = nota;
	}

	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * @return the cantidadInstanciasNoStatic
	 */
	public int getCantidadInstanciasNoStatic() {
		return cantidadInstanciasNoStatic;
	}

	/**
	 * @param cantidadInstanciasNoStatic the cantidadInstanciasNoStatic to set
	 */
	public void setCantidadInstanciasNoStatic(int cantidadInstanciasNoStatic) {
		this.cantidadInstanciasNoStatic = cantidadInstanciasNoStatic;
	}

	/**
	 * @return the cantidadInstancias
	 */
	public static int getCantidadInstancias() 
	{
		return cantidadInstancias;
	}

	/**
	 * @param cantidadInstancias the cantidadInstancias to set
	 */
	public static void setCantidadInstancias(int cantidadInstancias) {
		Nota.cantidadInstancias = cantidadInstancias;
	}
}
