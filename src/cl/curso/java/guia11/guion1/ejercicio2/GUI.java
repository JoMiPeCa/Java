package cl.curso.java.guia11.Threads.ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class GUI extends Thread{

	private JFrame frame;
	private Animal conejoBlanco;
	private Animal conejoAzul;
	private Animal conejoNegro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		conejoBlanco = new Animal("Conejo blanco",1,20,5,false);
		conejoAzul = new Animal("Conejo azul", 1, 20, 5, false);
		conejoNegro = new Animal("Conejo negro", 1, 20, 5, false);
		
		frame.setBounds(100, 100, 1200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConejoNegro = new JButton("Conejo negro");
		btnConejoNegro.setBounds(10, 21, 122, 23);
		frame.getContentPane().add(btnConejoNegro);
		
		JButton btnConejoAzul = new JButton("Conejo azul");
		btnConejoAzul.setBounds(10, 74, 122, 23);
		frame.getContentPane().add(btnConejoAzul);
		
		JButton btnConejoBlanco = new JButton("Conejo blanco");
		btnConejoBlanco.setBounds(10, 130, 122, 23);
		frame.getContentPane().add(btnConejoBlanco);
		
		JButton btnEmpezarCarrera = new JButton("Empezar carrera");
		btnEmpezarCarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btnConejoNegro.setBounds(0, 21, 122, 23);
				btnConejoAzul.setBounds(0, 74, 122, 23);
				btnConejoBlanco.setBounds(0, 130, 122, 23);
				conejoBlanco.setPosicion(0);
				conejoAzul.setPosicion(0);
				conejoNegro.setPosicion(0);
				conejoBlanco.setCarreraFinalizada(false);
				conejoAzul.setCarreraFinalizada(false);
				conejoNegro.setCarreraFinalizada(false);
				Thread thread1 = new Thread(conejoBlanco);
				Thread thread2 = new Thread(conejoAzul);
				Thread thread3 = new Thread(conejoNegro);
				Thread thread4 = new Thread(new Runnable(){
					
					@Override
					public void run() {
						do {
							btnConejoBlanco.setBounds(0+conejoBlanco.getPosicion(), 21, 122, 23);
							btnConejoAzul.setBounds(0+conejoAzul.getPosicion(), 74, 122, 23);
							btnConejoNegro.setBounds(0+conejoNegro.getPosicion(), 130, 122, 23);
							
						} while (!conejoBlanco.isCarreraFinalizada() || 
								 !conejoAzul.isCarreraFinalizada() ||
								 !conejoNegro.isCarreraFinalizada());
					}
				});
				thread1.start();
				thread2.start();
				thread3.start();
				thread4.start();
				
			}
		});
		btnEmpezarCarrera.setBounds(152, 194, 177, 23);
		frame.getContentPane().add(btnEmpezarCarrera);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.RED);
		separator.setForeground(Color.RED);
		separator.setBounds(1122, 10, 17, 190);
		frame.getContentPane().add(separator);
		
		JLabel lblMeta = new JLabel("Meta");
		lblMeta.setBounds(1128, 78, 46, 14);
		frame.getContentPane().add(lblMeta);
	}
}
