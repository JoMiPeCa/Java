package cl.curso.java.guia.carrera;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CarreraGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnStart;
	private boolean carreraIniciada;
	private Animal leopardo;
	private Animal tortuga;
	private JButton btnLeopardo;
	private JButton btnTortuga;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarreraGUI frame = new CarreraGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CarreraGUI() {
		leopardo = new Animal("leopardo", 20, 1000, 0);
		tortuga = new Animal("tortuga", 5, 2000, 0);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLeopardo = new JButton("Leopardo");
		btnLeopardo.setBounds(39, 54, 117, 29);
		contentPane.add(btnLeopardo);
		
		btnTortuga = new JButton("Tortuga");
		btnTortuga.setBounds(39, 115, 117, 29);
		contentPane.add(btnTortuga);
		
		btnStart = new JButton("Iniciar Carrera");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarCarrera();
			}
		});
		btnStart.setBounds(105, 224, 202, 29);
		contentPane.add(btnStart);
	}

	
	public void iniciarCarrera()
	{
		if( !carreraIniciada )
		{
			System.out.println("Inicio de la carrera");
			this.setCarreraIniciada(true);
			tortuga.setPosicion(0);
			leopardo.setPosicion(0);
			Animal.setCarreraFinalizada(false);
			new Thread(leopardo ).start();
			new Thread(tortuga ).start();
			new Thread( new Runnable() {
				@Override
				public void run() {
					
					while (carreraIniciada && !Animal.isCarreraFinalizada()) {
						System.out.println( "..." );
						btnLeopardo.setBounds(leopardo.getPosicion(), 54, 117, 29);
						btnTortuga.setBounds(tortuga.getPosicion(), 115, 117, 29);
					}
					carreraIniciada = false;
					btnStart.setText( "Iniciar Carrera" );
					
				}
			} ).start();
			btnStart.setText( "Detener Carrera" );
		}
		else
		{
			Animal.setCarreraFinalizada(true);
			this.setCarreraIniciada(false);
		}
	}
	
	/**
	 * @return the carreraIniciada
	 */
	public boolean isCarreraIniciada() {
		return carreraIniciada;
	}

	/**
	 * @param carreraIniciada the carreraIniciada to set
	 */
	public void setCarreraIniciada(boolean carreraIniciada) {
		this.carreraIniciada = carreraIniciada;
	}
}
