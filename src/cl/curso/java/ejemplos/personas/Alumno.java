package cl.curso.java.ejemplos.personas;

public class Alumno {

	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Alumno(){}
	
	public long promedio(int nota1,int nota2,int nota3){
		long total = (long)Math.round((nota1+nota2+nota3)/3);
		return total;
	}

	/**
	 * @param nombre
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 */
	public Alumno(String nombre, int nota1, int nota2, int nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
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
	 * @return the nota1
	 */
	public int getNota1() {
		return nota1;
	}

	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	/**
	 * @return the nota2
	 */
	public int getNota2() {
		return nota2;
	}

	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	/**
	 * @return the nota3
	 */
	public int getNota3() {
		return nota3;
	}

	/**
	 * @param nota3 the nota3 to set
	 */
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	};
	
	
	
	
	
}
