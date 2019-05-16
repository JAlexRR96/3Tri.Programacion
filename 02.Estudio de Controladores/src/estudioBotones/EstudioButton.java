package estudioBotones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class EstudioButton extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnRojo,btnVerde,btnAzul,btnAmarillo;
	private JPanel panel;
	private JFrame frame;
	
	private JToggleButton tglbtnHabilitado;
	private JButton btnCentral;
	private JButton btnIzq;
	private JButton btnDer;
	private JLabel label ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioButton frame = new EstudioButton();
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
	public EstudioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setVisible(true);
		
		definirventana();
		definirEventos();

	}

	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		frame=this;
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(10, 11, 89, 23);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(10, 250, 89, 23);
		contentPane.add(btnVerde);
		
		btnAmarillo = new JButton("Amarillo");
		btnAmarillo.setBounds(400, 11, 89, 23);
		contentPane.add(btnAmarillo);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(400, 250, 89, 23);
		contentPane.add(btnAzul);
		
		panel = new JPanel();
		panel.setBounds(123, 66, 265, 141);
		contentPane.add(panel);
		panel.setBackground(Color.BLACK);
		
		tglbtnHabilitado = new JToggleButton("Habilitado");
		tglbtnHabilitado.setBounds(185, 11, 121, 23);
		contentPane.add(tglbtnHabilitado);
		
		Icon leftButtonIcon =new ImageIcon(getClass().getResource("/imagenes/apagadoo.png"));
		Icon centerButtonIcon =new ImageIcon(getClass().getResource("/imagenes/java.png"));
		Icon rightButtonIcon =new ImageIcon(getClass().getResource("/imagenes/flecha-izquierda.png"));
		
		btnCentral = new JButton("Boton central",centerButtonIcon);
		btnCentral.setVerticalAlignment(AbstractButton.BOTTOM);
		btnCentral.setHorizontalAlignment(AbstractButton.CENTER);
		btnCentral.setMnemonic(KeyEvent.VK_C);
		btnCentral.setToolTipText("Centro");
		btnCentral.setIcon(centerButtonIcon);
		btnCentral.setBounds(170, 291, 177, 100);
		contentPane.add(btnCentral);
		
		btnIzq = new JButton("Disable center button");
		btnIzq.setVerticalAlignment(AbstractButton.CENTER);
		
		btnIzq.setMnemonic(KeyEvent.VK_D);
		btnIzq.setActionCommand("disable");
		btnIzq.setToolTipText("disable centerr text");
		btnIzq.setIcon(leftButtonIcon);
		btnIzq.setBounds(10, 291, 150, 100);
		contentPane.add(btnIzq);
		
		btnDer = new JButton("Enable center",new ImageIcon(EstudioButton.class.getResource("/imagenes/flecha-izquierda.png")));
		btnDer.setHorizontalAlignment(SwingConstants.RIGHT);
		btnDer.setBounds(357, 294, 132, 97);
		btnDer.setActionCommand("enable");
		btnDer.setEnabled(false);
	
		btnDer.setMnemonic(KeyEvent.VK_E);
		contentPane.add(btnDer);
		
		label = new JLabel("............");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(123, 237, 267, 31);
		contentPane.add(label);
		
	}
	
	private void definirEventos() {
		// TODO Apéndice de método generado automáticamente
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "La vigen pare que colo mas feoo", "A T E N C I O N ", JOptionPane.INFORMATION_MESSAGE);
				panel.setBackground(Color.RED);
			}
		});
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame, "OOOO!, No vea que colo mas feo ompare", "A T E N C I O N ", JOptionPane.INFORMATION_MESSAGE);
				panel.setBackground(Color.GREEN);
			}
		});
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.YELLOW);
			}
		});
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		
		tglbtnHabilitado.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglbtnHabilitado.isSelected()) {
					tglbtnHabilitado.setText("Desabilitado");
					boolean sw=false;
					habilitar(sw);
				}else {
					tglbtnHabilitado.setText("Habilitado");
					boolean sw=true;
					habilitar(sw);
				}
			}

			private void habilitar(boolean sw) {
				// TODO Apéndice de método generado automáticamente
				btnRojo.setEnabled(sw);
				btnVerde.setEnabled(sw);
				btnAzul.setEnabled(sw);
				btnAmarillo.setEnabled(sw); 
			}
		});
		
		btnDer.addActionListener(this);
		btnIzq.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("enable")) {
			label.setText("Habilitado");
			btnDer.setEnabled(false);
			btnCentral.setEnabled(true);
			btnIzq.setEnabled(true);
		}else if(e.getActionCommand().equals("disable")){
			label.setText("Desabilitado");
			btnDer.setEnabled(true);
			btnCentral.setEnabled(false);
			btnIzq.setEnabled(false);
		}else {
			label.setText("..............");
		}
	}
}
