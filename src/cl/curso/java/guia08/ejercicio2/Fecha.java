/**
 * 
 */
package cl.curso.java.guia08.ejercicio2;

/**
 * @author Joseph Perez Carmona
 *
 */
public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	/**
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha() {
		this.dia = 23;
		this.mes = 5;
		this.anio = 1995;
	}
	/**
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean bisiesto(int year){
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean validarDia(){
		int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(validarMes()){
		if (bisiesto(this.anio)){
			array[1]=29;
			return true;
		}
		return false;
		}
		else return false;
	}
	
	public boolean validarMes(){
		if(this.mes>0 && this.mes <=12)
		{
			return true;
		}
		return false;
	}
	
	public String printDate(){
		return this.dia+"-"+this.mes+"-"+this.anio;
	}
	
	public String printDateLarge(){
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		return this.dia+" de "+meses[this.mes-1]+" de "+this.anio;
	}
	
	
}
