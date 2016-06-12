/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cl.curso.java.control_cinco.jperez.ejercicio1.ComparadorPorFecha;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Empresa {

	private int nombre;
	private List<Empleado> empleados;

	/**
	 * Constructor que recibe parametros
	 * 
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(int nombre, List<Empleado> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
	}

	/**
	 * Constructor que recibe parametros
	 * 
	 * @param nombre
	 * @param empleados
	 */
	public Empresa() {
		this.nombre = 0;
		this.empleados = null;
	}

	/**
	 * Retorna el parametro nombre (Accesador)
	 * 
	 * @return nombre
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * Mutador nombre
	 * 
	 * @param Modifica
	 *            el nombre y lo reemplaza con nombre
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el parametro empleados (Accesador)
	 * 
	 * @return empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * Mutador empleados
	 * 
	 * @param Modifica
	 *            el empleados y lo reemplaza con empleados
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void ordenarEmpleadosPorNombre() {
		Collections.sort(this.getEmpleados(), new ComparadorPorNombre());
	}

	public void ordenarEmpleadosPorEdad() {
		Collections.sort(this.getEmpleados(), new ComparadorPorEdad());
	}

	public void ordenarEmpleadosPorDepartamento() {
		Collections.sort(this.getEmpleados(), new ComparadorPorDepartamento());
	}

	public Empleado buscarEmpleado(String rut) throws NotFoundException {
		for (Empleado empleado : empleados) {
			if (empleado.getRut().equals(rut)) {
				return empleado;
			}
		}
		throw new NotFoundException("404 NOT FOUND EMPLOYEE");

	}

	public void imprimir() {
		Iterator<Empleado> empleadosIterator = this.empleados.iterator();
		while (empleadosIterator.hasNext()) {
			Empleado e = empleadosIterator.next();
			System.out.println(e.getEdad());
			System.out.println(e.getDepartamento().getNombre());
			System.out.println(e.getRut());
			System.out.println("\n");
		}
	}
}
