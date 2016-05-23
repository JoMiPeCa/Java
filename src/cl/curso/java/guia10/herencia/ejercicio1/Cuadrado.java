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
	 * @param color
	 * @param cantidadLados
	 */
	public Cuadrado(String color, int cantidadLados) {
		super(color, cantidadLados);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#dibujar()
	 */
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see cl.curso.java.guia10.herencia.ejercicio1.FiguraGeometrica#calcularArea()
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
