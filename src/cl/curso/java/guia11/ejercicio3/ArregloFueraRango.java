package cl.curso.java.guia11.ejercicio3;

public class ArregloFueraRango {

	public static void main(String[] args) {

		try
		{
			String[] str = {"foo"};
			String functionName = str[10];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arreglo no existe en la posicion "+e.getMessage());
		}
	}

}
