/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio1;

/**
 * @author usuario Perez Carmona
 *
 */
public class Triangulo extends FiguraGeometrica {

	private int base;
	private int altura;
	/**
	 * 
	 */
	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}

	

	private int getBase() {
		return base;
	}



	private void setBase(int base) {
		this.base = base;
	}



	private int getAltura() {
		return altura;
	}



	private void setAltura(int altura) {
		this.altura = altura;
	}



	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	



	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#dibujar()
	 */
	@Override
	public void dibujar() {
		System.out.println("DEBERIA DIBUJAR UN TRIANGULO");

	}

	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#calcularArea()
	 */
	@Override
	public double calcularArea() {
		return (this.base * this.altura);
	}

}
