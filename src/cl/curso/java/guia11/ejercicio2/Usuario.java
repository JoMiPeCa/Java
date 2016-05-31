package cl.curso.java.guia11.ejercicio2;

import javax.swing.JOptionPane;


public class Usuario {

	private String nombre;
	private String password;
	private int intentosFallidos;
	
	
	/**
	 * 
	 */
	public Usuario() {
		this.nombre = " ";
		this.password = " ";
		this.intentosFallidos = 0;
	}
	/**
	 * @param nombre
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombre, String password, int intentosFallidos) {
		this.nombre = nombre;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}
	/**
	 * @param intentosFallidos the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
	
	public void login(String usuario, String pass) throws CuentaBloquedaException, AutenticacionExcepcion
	{
		 usuario = "jmaldonado";
		 pass = "123456";
			

			if(this.getIntentosFallidos()>=3)
			{
				throw new CuentaBloquedaException("Cuenta Bloqueda.");
			}
			if(this.getNombre().equals(usuario) && this.getPassword().equals(pass))
			{
				
				JOptionPane.showMessageDialog(null, "Haz ingresado al sistema.");
			}
			else
			{
				
				this.setIntentosFallidos(this.getIntentosFallidos()+1);
				throw new AutenticacionExcepcion("Usuario o password mal ingresados.");
			}
			
				
				
				
				
			
			
			
			
		
	}
	
}
