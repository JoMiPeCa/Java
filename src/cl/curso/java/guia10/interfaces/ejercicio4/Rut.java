package cl.curso.java.guia10.interfaces.ejercicio4;

public class Rut implements Validable {

	private int numero;
	private String digitoVerificador;

	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(int numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the digitoVerificador
	 */
	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador
	 *            the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	/**
	 * Metodo que verifica si el rut es valido o no
	 */
	public boolean validar() {
		String dv = "", rut = "";
		int run = 0, suma = 0, resto = 0, multiplicador = 2, aux = 0;
		run = this.numero;
		dv = this.digitoVerificador;
		for (int i = 0; i < 8; i++) {
			aux = run % 10;
			run = run / 10;
			suma = suma + aux * multiplicador;
			// System.out.println("suma "+suma);
			multiplicador = multiplicador + 1;
			if (multiplicador == 8) {
				multiplicador = 2;
			}
		}
		resto = suma % 11;
		aux = 11 - resto;
		rut.indexOf(aux);
		if (aux == 11) {
			rut = "0";
			if (dv.equalsIgnoreCase(rut)) {
				return true;
			}
		} else if (aux == 10) {
			rut = "k";
			if (dv.equalsIgnoreCase(rut)) {
				return true;
			}

		} else if (dv.equalsIgnoreCase(rut)) {
			return true;
		}
		return false;
	}

}
