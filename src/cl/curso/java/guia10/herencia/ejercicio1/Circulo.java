/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio1;

/**
 * @author usuario Perez Carmona
 *
 */
public class Circulo extends FiguraGeometrica {
	
	private double radio;
	
	

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/* Deberia dibujar un circulo, pero es imaginario
	 */
	@Override
	public void dibujar() {
		System.out.println("DEBERIA DIBUJAR UN CIRCULO DE RADIO: "+this.radio);

	}

	/* Calcula el Area
	 */
	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(this.radio,2);
	}

}
