/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio2;

/**
 * @author usuario Perez Carmona
 *
 */
public class EmpleadoContratado extends Empleado {

	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	/* 
	 * Calcula el salario en base a cada hora son 20000 pesos.
	 */
	@Override
	public int calcularSalario() {
		return 20000*this.getHorasTrabajadas();
	}

}
