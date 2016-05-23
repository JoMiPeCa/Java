/**
 * 
 */
package cl.curso.java.prueba_dos.jperez;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Persona {

	/**
	 * Declaracion de Atributos. Nombre Cadena de caracteres Edad enteros Rut
	 * Cadena de caracteres Peso Enteros Altura Enteros
	 */
	private String nombre;
	private int edad;
	private String rut;
	private int peso;
	private int altura;

	/**
	 * Constructor por DEFECTO que inicializa valores
	 */
	public Persona() {
		this.altura = 0;
		this.edad = 0;
		this.nombre = "";
		this.peso = 0;
		this.rut = "";
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param rut
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, String rut, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Metodo que permite verificar si esta con sobrepeso, bajopeso, o peso
	 * ideal.
	 * 
	 * @return Confirmacion de peso ideal. Retorna 404 en caso de que haya un
	 *         error inexplicable.
	 */
	public int calcularIMC() {
		long pesoIdeal = 0;
		pesoIdeal = (this.peso / (this.altura * this.altura));
		if (pesoIdeal > this.peso) {
			return -1;
		} else if (pesoIdeal < this.peso) {
			return 1;
		} else if (pesoIdeal == this.peso) {
			return 0;
		} else {
			System.out.println("ERROR 404 NOT FOUND");
			return 404;
		}
	}

	/**
	 * Metodo que permite verificar si es mayor de edad.
	 * 
	 * @return true/false si es mayor de edad o no.
	 */
	public boolean esMayorDeEdad() {
		if (this.edad > 17) {
			return true;
		} else {
			return false;
		}
	}

}
