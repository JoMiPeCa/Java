/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio2;

/**
 * @author usuario Perez Carmona
 *
 */
public abstract class Empleado {

	private String nombre;
	private int horasTrabajadas;
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
	public Empleado() {
		this.nombre="";
		this.horasTrabajadas=0;
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
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * MEtodo Abstracto
	 * @return el salario calculado en las clases hijas
	 */
	public abstract int calcularSalario();
	
}
