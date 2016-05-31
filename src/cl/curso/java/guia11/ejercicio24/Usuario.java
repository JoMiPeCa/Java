package cl.curso.java.guia11.ejercicio24;

import javax.swing.JOptionPane;


public class Usuario {

	private String username;
	private String password;
	private int intentosFallidos;
	
	
	/**
	 * 
	 */
	public Usuario() {
		this.username = " ";
		this.password = " ";
		this.intentosFallidos = 0;
	}
	/**
	 * @param username
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombre, String password, int intentosFallidos) {
		this.username = nombre;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}
	/**
	 * @return devuelve el Username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param Setea el Username
	 */
	public void setUsername(String user) {
		this.username = user;
	}
	/**
	 * @return devuelve el password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param Setea el password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return Devuelve los intentos Fallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}
	/**
	 * @param Setea los intentos fallidos
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
			if(this.getUsername().equals(usuario) && this.getPassword().equals(pass))
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
