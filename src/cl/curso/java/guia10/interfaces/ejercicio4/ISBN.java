package cl.curso.java.guia10.interfaces.ejercicio4;

public class ISBN implements Validable {

	private int numero;
	private String digitoVerificador;
	
	
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public ISBN(int numero, String digitoVerificador) {
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
	 * @param numero the numero to set
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
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}


	@Override
	public boolean validar(){
		int total = 0, aux = 0, aux2 = 0, aux3 = 0;
		String aux1 = "";
		int codigo = 0;
		String aux0 = "";
		aux1 = this.digitoVerificador;
		try{
			aux0 = String.valueOf(aux1);
			aux = Integer.parseInt(aux0);
		} catch (Exception e){

		}
		codigo= Integer.parseInt(original,9);

		for (int i = 2; i < 12; i++) {
			aux = codigo % 10;
			codigo = codigo / 10;
			total = total + (aux * i);
		}
		//System.out.println("suma: " + total);
		aux2 = total % 11; // aux2 residuo dividir en 11
		if (aux2 == 0) {
			if (aux2 == aux) {
				return true;
			} else {
				return false;
			}

		} else if (aux2 == 1) {
			if ('X' == aux1) {
				return true;
			} else {
				return false;
			}

		} else {
			aux3 = 11 - aux2;
			if (aux == aux3) {
				return true;
			} else {
				return false;
			}

		}

	}

}
