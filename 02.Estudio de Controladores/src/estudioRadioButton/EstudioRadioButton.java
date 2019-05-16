package estudioRadioButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class EstudioRadioButton extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnSoltero;
	private JRadioButton rdbtnCasado;
	private JRadioButton rdbtnDivorciado;
	private JLabel lblEstadoCivil;
	private JLabel lblMostrarEstadoCivil;
	private String ECivil;
	private ButtonGroup grupoRadioButton;
	private JLabel lblEstadoCivilCuando;
	private JButton btnAceptar;
	private JLabel lblEstadoCivilAceptar;
	private ArrayList<JRadioButton> botonesradio;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioRadioButton frame = new EstudioRadioButton();
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
	public EstudioRadioButton() {
		setTitle("Estudio Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		definirventana();
		definireventos();
		this.setVisible(true);
	}

	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		grupoRadioButton= new ButtonGroup();
		botonesradio=new ArrayList<>();
		
		rdbtnSoltero = new JRadioButton("Soltero");
		grupoRadioButton.add(rdbtnSoltero);
		rdbtnSoltero.setBounds(10, 83, 109, 23);
		contentPane.add(rdbtnSoltero);
		botonesradio.add(rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		grupoRadioButton.add(rdbtnCasado);
		rdbtnCasado.setBounds(10, 109, 109, 23);
		contentPane.add(rdbtnCasado);
		botonesradio.add(rdbtnCasado);
		
		rdbtnDivorciado = new JRadioButton("Divorciado");
		grupoRadioButton.add(rdbtnDivorciado);
		rdbtnDivorciado.setBounds(10, 135, 109, 23);
		contentPane.add(rdbtnDivorciado);
		botonesradio.add(rdbtnDivorciado);
		
		lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(10, 11, 109, 23);
		contentPane.add(lblEstadoCivil);
		
		lblMostrarEstadoCivil = new JLabel("");
		lblMostrarEstadoCivil.setBounds(6, 45, 109, 23);
		contentPane.add(lblMostrarEstadoCivil);
		
		lblEstadoCivilCuando = new JLabel("Estado civil cuando pulso Aceptar");
		lblEstadoCivilCuando.setBounds(147, 45, 206, 23);
		contentPane.add(lblEstadoCivilCuando);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(147, 11, 89, 23);
		contentPane.add(btnAceptar);
		
		lblEstadoCivilAceptar = new JLabel("");
		lblEstadoCivilAceptar.setBounds(147, 87, 117, 19);
		contentPane.add(lblEstadoCivilAceptar);

	}

	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		
		rdbtnSoltero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ECivil=rdbtnSoltero.getText();
				lblMostrarEstadoCivil.setText(ECivil);
			}
		});
		rdbtnCasado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ECivil=rdbtnCasado.getText();
				lblMostrarEstadoCivil.setText(ECivil);
			}
		});
		rdbtnDivorciado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ECivil=rdbtnDivorciado.getText();
				lblMostrarEstadoCivil.setText(ECivil);
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JRadioButton radio;
				for(int x=0;x<botonesradio.size();x++) {
					radio=botonesradio.get(x);
					if(radio.isSelected()) {
						ECivil=radio.getText();
					}
					lblEstadoCivilAceptar.setText(ECivil);
				}
				
			}
		});
	}
}
