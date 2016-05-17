package cl.curso.java.ejemplos.notas;
/**
 * 
 * @author Juan Maldonado León
 *
 */
public class Alumno 
{
	private String nombre;
	private Nota[] notas;
	
	
	public Alumno()
	{}

	
	

	/**
	 * @param nombre nombre del alumno
	 * @param notas arreglo de notas del alumno
	 */
	public Alumno(String nombre, Nota[] notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
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
	 * @return the notas
	 */
	public Nota[] getNotas() {
		return notas;
	}


	/**
	 * @param notas the notas to set
	 */
	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	/**
	 * Calcula el promedio de las notas de un Alumno
	 * segun el porcentaje de cada nota.
	 * @return retorna el promedio calculado
	 */
	public double calcularPromedio()
	{
		double notaFinal = 0;
		for( int i = 0 ; i < this.getNotas().length ; i++ )
		{
			double nota = (this.getNotas()[i].getValorNota() * 
			this.getNotas()[i].getPorcentaje() ) /100;
			notaFinal = notaFinal + nota;
		}
		return notaFinal;
	}
	
}
