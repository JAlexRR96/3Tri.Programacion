package estudioCajasTexto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EstudioCajaTexto extends JFrame {

	private JPanel contentPane;
	private JTextField textImporte;
	private JTextField textIVA;
	private JTextField textTotal;
	private JButton btnCalcular;
	private JLabel lblInformacion;
	private JLabel lblEventoDeTeclado;
	private JLabel lblDni;
	private JLabel lblIntroDNI;
	private JLabel lblFormato;
	private JTextField textDNI;
	private JFormattedTextField formattedTextField;
	private int importe;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioCajaTexto frame = new EstudioCajaTexto();
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
	public EstudioCajaTexto() {
		setTitle("Estudio JText");
		
		setBounds(100, 100, 755, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		definirventana();
		definireventos();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}



	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImporte.setBounds(10, 50, 90, 24);
		contentPane.add(lblImporte);
		
		JLabel lblIva = new JLabel("IVA:");
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIva.setBounds(10, 85, 90, 24);
		contentPane.add(lblIva);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(10, 120, 90, 24);
		contentPane.add(lblTotal);
		
		textImporte = new JTextField();
		textImporte.setBounds(110, 55, 86, 20);
		contentPane.add(textImporte);
		textImporte.setColumns(10);
		
		textIVA = new JTextField();
		textIVA.setBounds(110, 90, 86, 20);
		contentPane.add(textIVA);
		textIVA.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setBounds(110, 125, 86, 20);
		contentPane.add(textTotal);
		textTotal.setColumns(10);
		textTotal.setEditable(false);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(Color.MAGENTA);
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(47, 167, 96, 38);
		contentPane.add(btnCalcular);
		
		lblInformacion = new JLabel("***********");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInformacion.setBounds(341, 58, 190, 31);
		contentPane.add(lblInformacion);
		
		lblEventoDeTeclado = new JLabel("Evento de teclado");
		lblEventoDeTeclado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEventoDeTeclado.setBounds(341, 93, 351, 24);
		contentPane.add(lblEventoDeTeclado);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDni.setBounds(341, 253, 62, 31);
		contentPane.add(lblDni);
		
		lblIntroDNI = new JLabel("");
		lblIntroDNI.setBounds(413, 253, 190, 31);
		contentPane.add(lblIntroDNI);
		
		lblFormato = new JLabel("Formato");
		lblFormato.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFormato.setBounds(341, 295, 78, 24);
		contentPane.add(lblFormato);

		MaskFormatter maskdni;
		try {
			maskdni = new MaskFormatter("########U");
			MaskFormatter mascara=new MaskFormatter();
			textDNI = new JFormattedTextField(maskdni);
			textDNI.setBounds(423, 295, 148, 24);
			contentPane.add(textDNI);
			textDNI.setColumns(10);
		} catch (ParseException e) {
			// TODO: handle exception
		}

	}
	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformacion.setText("");
				double importe;
				int iva;
				double total;
				String to="";
				try {
					importe=Double.parseDouble(textImporte.getText());
					iva=Integer.parseInt(textIVA.getText());
					double iv=importe*iva/100;
					total=importe+iv;
					to=String.valueOf(total);
					lblIntroDNI.setText(textDNI.getText());
					
				} catch (Exception e2) {
					// TODO: handle exception
					lblInformacion.setText("Introduzca un valor correcto");
				}
				textTotal.setText(to);
			}
		});
		textImporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				lblInformacion.setText(e1.getActionCommand());//devuelve la cadena asociada al evento en casoi de las cajas yu en el texto su contendido
				try {
					Integer x=0;
					importe=x.parseInt(e1.getActionCommand());
					textIVA.requestFocus();
				} catch (Exception e2) {
					// TODO: handle exception
					lblInformacion.setText("Introduzca valores correctos");
					textImporte.setText("");
					}
			}
		});
		textIVA.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				System.out.println("KeyPressed");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased");
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("hyTyped");
				char caracter=e.getKeyChar();
				if(((caracter<'0')||(caracter>'9'))&&(caracter !=KeyEvent.VK_BACK_SPACE)&&(caracter!=44)) {
					e.consume();
				}
				lblEventoDeTeclado.setText("Caracter: "+e.getKeyChar()+" Codigo:"+e.getKeyCode());
			}
		});
	}


}
