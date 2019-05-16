package estudioDialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frmDialog extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDialog frame = new frmDialog();
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
		private JPanel Panel;
		private JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4;
		private frmDialog frame;
		private JLabel lblInformacion;
		
		public frmDialog() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 520, 300);
			Panel = new JPanel();
			Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(Panel);
			Panel.setLayout(null);
			frame=this;
			
			definirVentana();
			definirEventos();
			
			setVisible(true);

		}

		private void definirEventos() {
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int seleccion=JOptionPane.showOptionDialog(
						frame,
						"Seleccione opcion",
						"Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,		//null para icono por defecto
						new Object[] {"Opcion 1", "Opcion 2", "Opcion 3"},		//null para YES, NO y CANCEL
						"Opcion 3");
					if (seleccion!=-1) {
						lblInformacion.setText("Seleccionada opcion " + (seleccion + 1) );
					}
				}
			});	
			

			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String seleccion=JOptionPane.showInputDialog(
							frame,
							"imput dialogo",
							"");
					
					lblInformacion.setText("El usuario ha escrito "+ seleccion);
				}
			});
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Object seleccion=JOptionPane.showInputDialog(frame, 
							"seleccione opcion", 
							"Selector de opciones",
							JOptionPane.QUESTION_MESSAGE,
							null, 
							new Object[] {"Opcion 1", "Opcion 2", "Opcion 3",},
							"opcion1");
					
					lblInformacion.setText("El ususario ha elegido la opcion "+ seleccion);
				}
			});
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(frame, "Un aviso puñetero");
					lblInformacion.setText("Ya estas avisado");
				}
			});
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int confirmado =JOptionPane.showConfirmDialog(frame, "Aceptas el contrato");
					if(JOptionPane.OK_OPTION==confirmado) {
						lblInformacion.setText("CONFIRMADOO");
					}else {
						lblInformacion.setText("No ha confirmado  :(");
					}
				}
			});
		}

		private void definirVentana() {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(10, 216, 89, 23);
			Panel.add(btnNewButton);
			
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(109, 216, 89, 23);
			Panel.add(btnNewButton_1);
			
			btnNewButton_2 = new JButton("New button");

			btnNewButton_2.setBounds(208, 216, 89, 23);
			Panel.add(btnNewButton_2);
			
			btnNewButton_3 = new JButton("New button");
	
			btnNewButton_3.setBounds(307, 216, 89, 23);
			Panel.add(btnNewButton_3);
			
			btnNewButton_4 = new JButton("New button");
			btnNewButton_4.setBounds(406, 216, 89, 23);
			Panel.add(btnNewButton_4);
			
			lblInformacion = new JLabel("");
			lblInformacion.setHorizontalAlignment(SwingConstants.CENTER);
			lblInformacion.setBounds(109, 11, 287, 23);
			Panel.add(lblInformacion);
			
		}
	}



