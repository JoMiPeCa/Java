package cl.curso.java.ejemplos.notas;

/**
 * 
 * @author Juan Maldonado León
 *
 */
public class Nota {
	
	private String nombre;
	private double valorNota;
	private double porcentaje;
	
	public Nota()
	{}

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
	
	
	
}
