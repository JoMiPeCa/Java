package cl.curso.java.ejemplos.personas;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	/**
	 * @param numero1
	 * @param numero2
	 */
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	/**
	 * 
	 */
	public Calculadora() {
	}
	/**
	 * @return the numero1
	 */
	public int getNumero1() {
		return numero1;
	}
	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	/**
	 * @return the numero2
	 */
	public int getNumero2() {
		return numero2;
	}
	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public long calculame(String op){
		long total=0;
		if(op.compareToIgnoreCase("suma")==0){
			total = this.numero1+this.numero2;
		}else if(op.equalsIgnoreCase("resta")){
			total= this.numero1-this.numero2;
		}else if(op.equalsIgnoreCase("multiplicacion")){
			total = this.numero1*this.numero2;
		}else if(op.equalsIgnoreCase("division")){
			total = this.numero1/this.numero2;
		}
		return total;
	}
}
