/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio2;

/**
 * @author usuario Perez Carmona
 *
 */
public class EmpleadoComision extends Empleado {

	private int cantidadDeVentas;
	private int salarioBase;
	
	
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoComision() {
		super();
		this.cantidadDeVentas=0;
		this.salarioBase=0;
	}
	

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 * @param cantidadDeVentas
	 * @param salarioBase
	 */
	public EmpleadoComision(int cantidadDeVentas, int salarioBase) {
		super();
		this.cantidadDeVentas = cantidadDeVentas;
		this.salarioBase = salarioBase;
	}

	/**
	 * @return the cantidadDeVentas
	 */
	public int getCantidadDeVentas() {
		return cantidadDeVentas;
	}

	/**
	 * @param cantidadDeVentas the cantidadDeVentas to set
	 */
	public void setCantidadDeVentas(int cantidadDeVentas) {
		this.cantidadDeVentas = cantidadDeVentas;
	}

	/**
	 * @return the salarioBase
	 */
	public int getSalarioBase() {
		return salarioBase;
	}

	/**
	 * @param salarioBase the salarioBase to set
	 */
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoComision(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio2.Empleado#calcularSalario()
	 */
	@Override
	public int calcularSalario() {
		return (getCantidadDeVentas()*9000)+getSalarioBase();
	}

}
