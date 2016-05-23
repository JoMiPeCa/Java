/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Curso implements Imprimible {

	private String nombre;
	private Alumno[] alumnos;

	/**
	 * Constructor por DEFECTO que inicializa parametros
	 */
	public Curso() {
		this.nombre = "";
		// No se como inicializar un Arreglo de Alumnos con valores nulos.
		// this.alumnos = new Alumno();
	}

	/**
	 * Constructor que recibe parametros
	 * 
	 * @param nombre
	 * @param alumnos
	 */
	public Curso(String nombre, Alumno[] alumnos) {
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos
	 *            the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	/**
	 * Metodo que calcura el promedio del curso
	 * 
	 * @return Retorna el Promedio del curso.
	 */
	public double calcularPromedioCurso() {
		double promedio = 0;
		for (int i = 0; i < alumnos.length; i++) {
			promedio = promedio + alumnos[i].getPromedio();

		}
		return (promedio / alumnos.length);
	}

	/**
	 * Metodo que obtiene el mejor promedio.
	 * 
	 * @return Retorna el mejor promedio obtenido
	 */
	public double obtenerMejorPromedio() {
		double promedio = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getPromedio() > promedio) {
				promedio = alumnos[i].getPromedio();
			}
		}
		return promedio;
	}

	@Override
	/**
	 * Metodo que muestra por consola los atributos de la clase junto a los de
	 * la clase Alumno.
	 */
	public void imprimir() {
		System.out.println("Nombre Curso: " + this.getNombre());
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Nombre Alumno: " + alumnos[i].getNombre());
			System.out.println("Promedio Alumno: " + alumnos[i].getPromedio());
		}
	}
	
}
