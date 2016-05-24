/**
 * 
 */
package cl.curso.java.guia10.herencia.ejercicio1;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Cuadrado extends FiguraGeometrica {

	private int lado;
	
	/**
	 * Constructor por DEFECTO inicializado
	 * 
	 */
	public Cuadrado() {
		this.lado=0;
	}

	

	/**
	 * @param lado
	 */
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}



	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#dibujar()
	 */
	@Override
	public void dibujar() {
		System.out.println("DEBERIA DIBUJAR UN CUADRADO DE LADO: "+this.lado);

	}

	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#calcularArea()
	 */
	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

}
