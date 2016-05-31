package cl.curso.java.guia11.ejercicio1;

public class RutNoValidoExcepcion extends RuntimeException {

	public RutNoValidoExcepcion(String mensaje)
	{
		super(mensaje);
	}
}
