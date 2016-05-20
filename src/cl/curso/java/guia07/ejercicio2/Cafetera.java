package cl.curso.java.guia07.ejercicio2;

import javax.swing.JOptionPane;

/**
 * @author Joseph
 *
 */
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	/**
	 * 
	 */
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void llenarCafetera(){
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int capacidadCC){
		if(this.cantidadActual< capacidadCC){
			this.cantidadActual = 0;
		}else{
			this.cantidadActual = this.cantidadActual-capacidadCC;
		}
	}
	
	public void vaciarCafetera(){
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int anadirCC){
		if(this.cantidadActual+anadirCC > this.capacidadMaxima){
			JOptionPane.showMessageDialog(null, "Excede la capacidad de la cafetera, probar con otro monto!");
		}else{
			this.cantidadActual = this.cantidadActual+anadirCC;
		}
	}
	
	public void imprimir(){
		JOptionPane.showMessageDialog(null, this.toString());
	}
	/**
	 * @param capacidadMaxima
	 * @param cantidadActual
	 */
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}
	/**
	 * @return the capacidadMaxima
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	/**
	 * @param capacidadMaxima the capacidadMaxima to set
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	/**
	 * @return the cantidadActual
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}
	/**
	 * @param cantidadActual the cantidadActual to set
	 */
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "capacidadMaxima = " + capacidadMaxima + " \n cantidadActual = " + cantidadActual;
	}
	
	
}
