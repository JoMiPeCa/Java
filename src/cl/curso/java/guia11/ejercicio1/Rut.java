package cl.curso.java.guia11.ejercicio1;

public class Rut{

	private String rut;
	private char digitoVerificador;
	
	/**
	 * 
	 */
	public Rut() {
		this.rut= "17700879-6";
	}
	
	/**
	 * @param numero
	 * @param digitoVerificador
	 */
	public Rut(String rut, char digitoVerificador) {
		this.rut = rut;
		this.digitoVerificador = digitoVerificador;
	}

	/**
	 * @return retorna el Rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param setea el Rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
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
