package estudioEventos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class EstudioEventos extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnReenviar;
	private JLabel JLEtiqueta;
	private JButton btnEnviar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioEventos frame = new EstudioEventos();
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
	public EstudioEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setVisible(true);
		
		definirventana();
		definireventos();

	}


	private void definirventana() {
		// TODO Apéndice de método generado automáticamente

		
		btnReenviar = new JButton("Reenviar");
		btnReenviar.setBounds(240, 11, 141, 120);
		contentPane.add(btnReenviar);
		
		JLEtiqueta = new JLabel("");
		JLEtiqueta.setBounds(41, 185, 340, 14);
		contentPane.add(JLEtiqueta);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(41, 11, 156, 120);
		contentPane.add(btnEnviar);
		btnEnviar.setActionCommand("enviar");
	}
	
	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		//this es el formulario
		btnEnviar.addActionListener(this);
		
		btnReenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLEtiqueta.setText("Ha pulsado el boton reenviar");
				
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Apéndice de método generado automáticamente
		//La clase action event lo que contiene es informacion sobre el objeto que ha provocado el evento
		/*if(e.getSource()==btnEnviar) {
			lblNewLabel.setText("Ha pulsado el boton enviar");
		}*/
		
		if(e.getActionCommand().equals("enviar")) {
			JLEtiqueta.setText("Ha pulsado el boton enviar");
		}
	}
}
