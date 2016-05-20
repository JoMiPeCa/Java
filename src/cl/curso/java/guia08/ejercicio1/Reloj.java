/**
 * 
 */
package cl.curso.java.guia08.ejercicio1;

/**
 * @author Joseph
 *
 */
public class Reloj {

	private int hora;
	private int minuto;
	private int segundos;

	/**
	 * @param hora
	 * @param minuto
	 * @param segundos
	 */
	public Reloj(int hora, int minuto, int segundos) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundos = segundos;
	}

	/**
	 * 
	 */
	public Reloj() {
		this.hora = 0;
		this.minuto = 0;
		this.segundos = 0;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora
	 *            the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto
	 *            the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos
	 *            the segundos to set
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void avanzarSegundo() {
		if (this.segundos == 0) {
			this.segundos = 1;
		} else {
			this.segundos = this.segundos + 1;
		}
	}

	public void retrocederSegundo() {
		this.segundos--;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "hora = " + hora + " \n minuto = " + minuto + " \n segundos = " + segundos;
	}

	public String imprimir() {
		return "La hora es: " + this.hora + ":" + this.minuto + ":" + this.segundos;
	}

}
