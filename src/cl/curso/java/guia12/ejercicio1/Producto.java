package cl.curso.java.guia12.ejercicio1;

public class Producto implements Comparable<Producto> {
	
	private int identificador;
	private String nombre;
	private int precio;
		
	/**
	 * Constructor que recibe parametros
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Constructor que inicializa por defecto
	 */
	public Producto() {
		this.identificador = 0;
		this.nombre = "";
		this.precio = 0;
	}

	

	/**
	 * Retorna el parametro identificador (Accesador)
	 * @return identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Mutador identificador
	 * @param Modifica el identificador y lo reemplaza con identificador
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Retorna el parametro nombre (Accesador)
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Mutador nombre
	 * @param Modifica el nombre y lo reemplaza con nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el parametro precio (Accesador)
	 * @return precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Mutador precio
	 * @param Modifica el precio y lo reemplaza con precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equals(Object obj) {
	  if(obj instanceof Producto){
		 return this.getIdentificador() == ((Producto) obj).getIdentificador();
				  
	  }
		return false;
	}

	@Override
	public int compareTo(Producto prod) {
		if(this.getPrecio() > prod.getPrecio()){
			return 1;
		}
		if(this.getPrecio()< prod.getPrecio()){
			return -1;
		}
		if(this.getPrecio() == prod.getPrecio()){
			return 0;
		}
 		return 0;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
