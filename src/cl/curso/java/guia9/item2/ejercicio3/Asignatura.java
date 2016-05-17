package cl.curso.java.guia9.item2.ejercicio3;

import java.util.ArrayList;

public class Asignatura {

	private String nombreAsignatura;
	private String nombreProfesor;
	private ArrayList<Alumno> alumno;
	/**
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	/**
	 * @return the nombreProfesor
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	/**
	 * @param nombreProfesor the nombreProfesor to set
	 */
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	/**
	 * @return the alumno
	 */
	public ArrayList<Alumno> getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(ArrayList<Alumno> alumno) {
		this.alumno = alumno;
	}
	/**
	 * @param nombreAsignatura
	 * @param nombreProfesor
	 * @param alumno
	 */
	public Asignatura(String nombreAsignatura, String nombreProfesor, ArrayList<Alumno> alumno) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nombreProfesor = nombreProfesor;
		this.alumno = alumno;
	}
	
	public String imprimir(){
		return "nombreAsignatura = " + nombreAsignatura 
				+ alumno.toString();
	}
}
