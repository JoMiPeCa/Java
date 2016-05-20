package cl.curso.java.guia09.item1;

public class Equipo {

	private String nombre;
	private int cantPartGanados;
	private int cantPartPerdidos;
	private int cantPartEmpatados;
	private int partidosJugados;
	private int puntosTotales;
	/**
	 * @param nombre
	 * @param cantPartGanados
	 * @param cantPartPerdidos
	 * @param cantPartEmpatados
	 * @param partidosJugados
	 * @param puntosTotales
	 */
	public Equipo(String nombre, int cantPartGanados, int cantPartPerdidos, int cantPartEmpatados, int partidosJugados,
			int puntosTotales) {
		this.nombre = nombre;
		this.cantPartGanados = cantPartGanados;
		this.cantPartPerdidos = cantPartPerdidos;
		this.cantPartEmpatados = cantPartEmpatados;
		this.partidosJugados = partidosJugados;
		this.puntosTotales = puntosTotales;
	}
	/**
	 * @param nombre
	 * @param cantPartGanados
	 * @param cantPartPerdidos
	 * @param cantPartEmpatados
	 * @param partidosJugados
	 * @param puntosTotales
	 */
	public Equipo() {
		this.nombre = "";
		this.cantPartGanados = 0;
		this.cantPartPerdidos = 0;
		this.cantPartEmpatados = 0;
		this.partidosJugados = 0;
		this.puntosTotales = 0;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cantPartGanados
	 */
	public int getCantPartGanados() {
		return cantPartGanados;
	}
	/**
	 * @param cantPartGanados the cantPartGanados to set
	 */
	public void setCantPartGanados(int cantPartGanados) {
		this.cantPartGanados = cantPartGanados;
	}
	/**
	 * @return the cantPartPerdidos
	 */
	public int getCantPartPerdidos() {
		return cantPartPerdidos;
	}
	/**
	 * @param cantPartPerdidos the cantPartPerdidos to set
	 */
	public void setCantPartPerdidos(int cantPartPerdidos) {
		this.cantPartPerdidos = cantPartPerdidos;
	}
	/**
	 * @return the cantPartEmpatados
	 */
	public int getCantPartEmpatados() {
		return cantPartEmpatados;
	}
	/**
	 * @param cantPartEmpatados the cantPartEmpatados to set
	 */
	public void setCantPartEmpatados(int cantPartEmpatados) {
		this.cantPartEmpatados = cantPartEmpatados;
	}
	/**
	 * @return the partidosJugados
	 */
	public int getPartidosJugados() {
		return partidosJugados;
	}
	/**
	 * @param partidosJugados the partidosJugados to set
	 */
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	/**
	 * @return the puntosTotales
	 */
	public int getPuntosTotales() {
		return puntosTotales;
	}
	/**
	 * @param puntosTotales the puntosTotales to set
	 */
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	
	public void ganar(){
		this.puntosTotales +=3;
		this.cantPartGanados +=1;
		this.partidosJugados +=1;
	}
	
	public void perder(){
		this.partidosJugados+=1;
		this.cantPartPerdidos += 1;
	}
	
	public void empatar(){
		this.partidosJugados += 1;
		this.cantPartEmpatados += 1;
		this.puntosTotales += 1;
	}
	
}
