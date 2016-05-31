package cl.curso.java.guia11.ejercicio1;

public class Programa {

	public static void main(String[] args)
	{
		Rut rut = new Rut();
		
		try
		{
			System.out.println(rut.validar("9479854-k"));
		}
		catch(RutNoValidoExcepcion e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
