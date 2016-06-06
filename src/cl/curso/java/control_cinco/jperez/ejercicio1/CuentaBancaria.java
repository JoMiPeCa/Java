/**
 * 
 */
package cl.curso.java.control_cinco.jperez.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Joseph Perez Carmona
 *
 */
public class CuentaBancaria {

	private int numero;
	private List<Transaccion> transacciones;
	
	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria() {
		this.numero = 0;
		this.transacciones = new ArrayList<Transaccion>();
	}

	/**
	 * Retorna el parametro numero (Accesador)
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Mutador numero
	 * @param Modifica el numero y lo reemplaza con numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Retorna el parametro transacciones (Accesador)
	 * @return transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * Mutador transacciones
	 * @param Modifica el transacciones y lo reemplaza con transacciones
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	public void ordenarTransaccionesPorFecha(){
		Collections.sort(this.getTransacciones());
	}
	
	public void ordenarTransaccionesPorTipo(){
		
	}

	public String imprimir() {
		for (Transaccion transaccion : transacciones) {
			System.out.println("\nID: "+transaccion.getId());
			System.out.println("\nMonto: "+transaccion.getMonto());
			System.out.println("\nTipo: "+transaccion.getTipo());
			System.out.println("\nFecha: "+transaccion.getFecha());
		}
		return super.toString();
	}
}
