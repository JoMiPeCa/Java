package cl.curso.java.ejemplos.exception;

public class FechaNoValidaException extends Exception {

	public FechaNoValidaException(  )
	{
		super("La fecha Ingresada no es valida");
	}
}
