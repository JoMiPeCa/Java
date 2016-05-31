package cl.curso.java.guia11.ejercicio1;

public class Rut{

	private String numero;
	private char digitoVerificador;
	
	/**
	 * 
	 */
	public Rut() {
		this.numero= "19188374-8";
	}
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(String numero, char digitoVerificador) {
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the digitoVerificador
	 */
	public char getDigitoVerificador() {
		return digitoVerificador;
	}

	/**
	 * @param digitoVerificador the digitoVerificador to set
	 */
	public void setDigitoVerificador(char digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	public boolean validar(String rut) {
		boolean validacion = false;
	
		rut =  rut.toUpperCase();
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
		 
		this.setDigitoVerificador(rut.charAt(rut.length() - 1));
		 
		int m = 0, s = 1;
		for (; rutAux != 0; rutAux /= 10) {
		s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
		}
		if (this.getDigitoVerificador() == (char) (s != 0 ? s + 47 : 75)) {
		validacion = true;
		}
		else
		{
			throw new RutNoValidoExcepcion("Rut no valido");
		}
		 
		
		return validacion;
	}
	
}
