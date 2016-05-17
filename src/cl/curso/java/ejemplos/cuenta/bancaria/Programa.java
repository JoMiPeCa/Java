package cl.curso.java.ejemplos.cuenta.bancaria;

/**
 * 
 * @author Juan Maldonado León
 *
 */
public class Programa {

	
	/**
	 * Método que lanza la ejecucion del Programa
	 * @param args parametros del programa
	 */
	public static void main(String[] args) 
	{
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.setLineaCredito(2000);
		cta1.setNumeroCuenta(123456789);
		cta1.setSaldo(1000);
		
		cta1.imprimir();
		cta1.girar(2000);
		cta1.imprimir();
		cta1.girar(2000);
		
		
		System.out.println("----");
		
		CuentaVista cuentaVista  = new CuentaVista();
		cuentaVista.setNumeroCuenta(1234567890);
		cuentaVista.setSaldo(2000);
		cuentaVista.imprimir();
		
		
		
	}

}
