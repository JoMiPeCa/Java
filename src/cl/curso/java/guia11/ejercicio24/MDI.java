package cl.curso.java.guia11.ejercicio24;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class MDI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JDesktopPane desktopPane;
	private Usuario usuario;


	/**
	 * Create the frame.
	 */
	public MDI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 380);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(70, 110, 73, 22);
		contentPane.add(lblUsuario);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(70, 159, 73, 14);
		contentPane.add(lblPassword);

		JLabel lblAccesoAPlataforma = new JLabel("Acceso a Plataforma");
		lblAccesoAPlataforma.setForeground(new Color(255, 255, 255));
		lblAccesoAPlataforma.setBounds(70, 0, 240, 59);
		lblAccesoAPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblAccesoAPlataforma);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(155, 113, 134, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(153, 158, 136, 20);
		contentPane.add(txtPassword);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			Usuario user = new Usuario();
			@Override
			public void mouseClicked(MouseEvent arg0) {

				String passw = new String(txtPassword.getPassword());

				user.setUsername(txtUsuario.getText());
				user.setPassword(passw);
				
				
				try {
					user.login(user.getUsername(), user.getPassword());
				} catch ( AutenticacionExcepcion e) {
					JOptionPane.showMessageDialog(null, "Error", e.getMessage(), JOptionPane.ERROR_MESSAGE);
				} catch (CuentaBloquedaException e) {
					JOptionPane.showMessageDialog(null, "Error", e.getMessage(), JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnEntrar.setBounds(70, 230, 89, 23);
		contentPane.add(btnEntrar);
	}
}
