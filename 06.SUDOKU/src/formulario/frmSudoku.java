package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class frmSudoku extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_contenedor_numeros;
	private JTextField txt_numeros;
	private JButton btnNewButton;
	ArrayList<JPanel> paneles_numeros;
	ArrayList<JTextField> texto_numeros;
	private int[]numerosdetxt=new int[9];
	public frmSudoku() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		
		paneles_numeros=new ArrayList<>();
		texto_numeros=new ArrayList<>();
		disenarventana();
		disenareventos();
	}


	private void disenarventana() {
		// TODO Apéndice de método generado automáticamente
		
		//Panel principal
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Boton para inicar el sudoku
		btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setBounds(10, 501, 155, 50);
		contentPane.add(btnNewButton);
		
		//Panel que contendra tosos los cuadros para numeros
		panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 10, 480, 480);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		
		for(int i=0;i<9;i++) {
			//Panel que contrandra todos los JTextField
			panel_contenedor_numeros = new JPanel();
			panel.add(panel_contenedor_numeros);
			panel_contenedor_numeros.setLayout(new GridLayout(3, 3, 5, 5));
			panel_contenedor_numeros.setBackground(new Color(204, 255, 255));
			panel_contenedor_numeros.repaint();

			paneles_numeros.add(panel_contenedor_numeros);
		}
		int contador=0;
		for(int i=0;i<paneles_numeros.size();i++) {
			for(int x=0;x<9;x++) {
				//Cuadros de texto para colocar los numeros
				txt_numeros = new JTextField();
				txt_numeros.setHorizontalAlignment(SwingConstants.CENTER);
				txt_numeros.setFont(new Font("Tahoma", Font.PLAIN, 15));
				paneles_numeros.get(i).add(txt_numeros);
				txt_numeros.setColumns(10);
				txt_numeros.repaint();
				
				texto_numeros.add(txt_numeros);
			}
		}	
		System.out.println(texto_numeros.size());
	}
	private void disenareventos() {
		// TODO Apéndice de método generado automáticamente
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int x=0;x<9;x++) {
					numerosdetxt=generaaleatoriosinrepeticion();
					for(int i=0;i<texto_numeros.size();i++) {
						texto_numeros.get(i).setText(Integer.toString(i));
					}
				}

				
			}

			private int[] generaaleatoriosinrepeticion() {
				// TODO Apéndice de método generado automáticamente
				boolean norepe=false;
				int aleatorio;
				int[]naleatorios=new int[9];
				for(int i=0;i<9;i++) {
					do {
						norepe=false;
						aleatorio=(int)Math.floor(Math.random()*(9+1-1)+1);
						for(int x=0;x<9;x++) {
							if(naleatorios[x]==aleatorio) {
								norepe=true;
							}
						}
					} while (norepe);
					naleatorios[i]=aleatorio;
				}
				return naleatorios;
			}
		});
	}
}
