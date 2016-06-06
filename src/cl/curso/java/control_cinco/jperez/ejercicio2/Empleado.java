/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Empleado extends Persona{

	private int salario;
	private Departamento departamento;
	private Persona persona;
	
	/**
	 * Constructor que recibe parametros
	 * @param salario
	 * @param departamento
	 * @param persona
	 */
	public Empleado(int salario, Departamento departamento, Persona persona) {
		this.salario = salario;
		this.departamento = departamento;
		this.persona = persona;
	}
	
	
	/**
	 * Constructor que Inicializa parametros
	 */
	public Empleado() {
		this.salario = 0;
		this.departamento = null;
		this.persona = null;
	}


	/**
	 * Retorna el parametro salario (Accesador)
	 * @return salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * Mutador salario
	 * @param Modifica el salario y lo reemplaza con salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * Retorna el parametro departamento (Accesador)
	 * @return departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}
	/**
	 * Mutador departamento
	 * @param Modifica el departamento y lo reemplaza con departamento
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	/**
	 * Retorna el parametro persona (Accesador)
	 * @return persona
	 */
	public Persona getPersona() {
		return persona;
	}


	/**
	 * Mutador persona
	 * @param Modifica el persona y lo reemplaza con persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	/* 
	 * Compara los ruts de los empleados
	 */
	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj;
		return this.getPersona().getRut().equalsIgnoreCase(p.getRut());
	}
	
}
