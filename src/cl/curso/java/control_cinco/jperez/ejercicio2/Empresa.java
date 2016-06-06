/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

import java.util.List;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Empresa {

	private int nombre;
	private List<Empleado> empleados;
	/**
	 * Constructor que recibe parametros
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(int nombre, List<Empleado> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
	}
	/**
	 * Constructor que recibe parametros
	 * @param nombre
	 * @param empleados
	 */
	public Empresa() {
		this.nombre = 0;
		this.empleados = null;
	}
	/**
	 * Retorna el parametro nombre (Accesador)
	 * @return nombre
	 */
	public int getNombre() {
		return nombre;
	}
	/**
	 * Mutador nombre
	 * @param Modifica el nombre y lo reemplaza con nombre
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	/**
	 * Retorna el parametro empleados (Accesador)
	 * @return empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * Mutador empleados
	 * @param Modifica el empleados y lo reemplaza con empleados
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void ordenarEmpleadosPorNombre(){
		
	}
	public void ordenarEmpleadosPorDepartamento(){
		
	}
	public Empleado buscarEmpleado(String rut) throws NotFoundException{
		for (Empleado empleado : empleados) {
			if(empleado.getPersona().getRut().equals(rut)){
				return empleado;
			}
		}
		return null;
		
	}
	public void imprimir(){
		
	}
}
