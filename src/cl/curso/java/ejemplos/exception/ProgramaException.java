package cl.curso.java.ejemplos.exception;

public class ProgramaException {

	public static void main(String[] args) {
		Fecha fecha = new Fecha(32, 0, 2016);
		try {
			fecha.validarDia();
			System.out.println( "Fecha Valida" );
		} catch (DiaNoValidoException e) {
			System.out.println( "Fecha incorrecta " + 
							e.getMessage() );
		} catch (MesNoValidoException e) {
			System.out.println( "Mes no valido" + 
								e.getMessage() );
		}
	}

}
