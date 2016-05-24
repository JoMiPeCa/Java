/**
 * 
 */
package cl.curso.java.ejemplos.dataRaces;

/**
 * @author Joseph Perez Carmona
 *
 */
public class AumentaThread extends Thread{

	private Contador contado;

	/**
	 * @param contado
	 */
	public AumentaThread(Contador contado) {
		this.contado = contado;
	}

	/**
	 * @return the contado
	 */
	public Contador getContado() {
		return contado;
	}

	/**
	 * @param contado the contado to set
	 */
	public void setContado(Contador contado) {
		this.contado = contado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		this.contado.aumentaCuenta();
		this.contado.aumentaCuenta();
		this.contado.aumentaCuenta();
		super.run();
	}
	
	
}
