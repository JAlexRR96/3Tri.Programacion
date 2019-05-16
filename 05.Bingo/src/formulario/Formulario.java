package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import carton.CartonBingo;
import premios.VentanaBingo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Formulario extends JFrame {
	/**
	 * Create the frame.
	 */
	private JPanel Principal;
	private JPanel panel_Numeros;
	private JLabel lbl_Numeros_Aleatorios;
	private JLabel lblBingooo;
	private JLabel lbl_Numeros;
	private JLabel lblModoDeJuego;
	private JRadioButton rdbtnAutomatico;
	private JRadioButton rdbtnManual;
	private JButton btnGenerarNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	ArrayList<JRadioButton> MododeJuego;
	private JButton btnComenzar;
	private int[]naleatorios=new int[90];
	private int contador;
	private JFrame frame;
	ArrayList<JLabel> numerosordenados;
	private Timer time;
	private TimerTask task;
	private JPanel Panel_Boleto;
	ArrayList<JLabel> Etiquetas_Numeros_Boletos;
	private JButton btnGenerarBoletos;
	private  int Cuenta_Boletos;
	ArrayList<CartonBingo> cartones;
	CartonBingo carton_teporal;
	JLabel Numeros_Carton;
	private boolean linea=true;
	public Formulario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Formulario.class.getResource("/imagenes/iconoBombo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		setTitle("Bombo bingo");
		//Paneles 
		Principal = new JPanel();
		Principal.setBackground(new Color(255, 255, 255));
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Principal);
		Principal.setLayout(null);
		
		panel_Numeros = new JPanel();
		panel_Numeros.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_Numeros.setBackground(new Color(255, 153, 255));
		panel_Numeros.setBounds(5, 5, 475, 750);
		Principal.add(panel_Numeros);
		panel_Numeros.setLayout(null);
		
		//Diseños 
		diseñoventana();
		diseñoeventos();
		
	}

	private void diseñoventana() {
		// TODO Apéndice de método generado automáticamente
		MododeJuego=new ArrayList();
		numerosordenados=new ArrayList();
		Etiquetas_Numeros_Boletos=new ArrayList();
		cartones=new ArrayList<>();
		contador=0;
		frame=this;
		Cuenta_Boletos=1;
		
		lblBingooo = new JLabel("BINGOOO!!");
		lblBingooo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBingooo.setFont(new Font("Magneto", Font.PLAIN, 40));
		lblBingooo.setBounds(10, 11, 454, 58);
		panel_Numeros.add(lblBingooo);
		
		diseñodetodoslosnumeros();
		
		lbl_Numeros_Aleatorios = new JLabel("");
		lbl_Numeros_Aleatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Numeros_Aleatorios.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lbl_Numeros_Aleatorios.setBounds(235, 76, 154, 120);
		panel_Numeros.add(lbl_Numeros_Aleatorios);
		
		//Modos de juego
		lblModoDeJuego = new JLabel("Modo de juego");
		lblModoDeJuego.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModoDeJuego.setBounds(10, 80, 139, 22);
		panel_Numeros.add(lblModoDeJuego);
		
		rdbtnAutomatico = new JRadioButton("AUTOMATICO");
		buttonGroup.add(rdbtnAutomatico);
		rdbtnAutomatico.setBackground(new Color(255, 153, 255));
		rdbtnAutomatico.setBounds(6, 109, 109, 23);
		panel_Numeros.add(rdbtnAutomatico);
		MododeJuego.add(rdbtnAutomatico);
		rdbtnAutomatico.setSelected(true);
		 
		rdbtnManual = new JRadioButton("MANUAL");
		buttonGroup.add(rdbtnManual);
		rdbtnManual.setBackground(new Color(255, 153, 255));
		rdbtnManual.setBounds(6, 135, 109, 23);
		panel_Numeros.add(rdbtnManual);
		MododeJuego.add(rdbtnManual);
		
		btnGenerarNumero = new JButton("GENERAR NUMERO");
		btnGenerarNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGenerarNumero.setBounds(10, 165, 139, 30);
		panel_Numeros.add(btnGenerarNumero);
		btnGenerarNumero.setVisible(false);
		
		btnComenzar = new JButton("COMENZAR");
		btnComenzar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnComenzar.setBounds(10, 206, 139, 30);
		panel_Numeros.add(btnComenzar);
		
		btnGenerarBoletos = new JButton("GENERAR BOLETOS");

		btnGenerarBoletos.setBounds(206, 109, 191, 98);
		panel_Numeros.add(btnGenerarBoletos);
		
	}
	private void diseñodetodoslosnumeros() {
		// TODO Apéndice de método generado automáticamente
		int ver=250;
		int hor=10;
		int n=1;
		
		for(int i=0;i<9;i++) {
			
			for(int x=0;x<10;x++) {
				lbl_Numeros = new JLabel("");
				lbl_Numeros.setBounds(hor, ver, 49, 41);
				lbl_Numeros.setFont(new Font("Tahoma", Font.PLAIN, 30));
				panel_Numeros.add(lbl_Numeros);
				lbl_Numeros.setText(Integer.toString(n));
				n++;
				hor=hor+47;
				numerosordenados.add(lbl_Numeros);
			}
			hor=10;
			ver=ver+50;
		}
	}
	
	private void diseñoeventos() {
		// TODO Apéndice de método generado automáticamente
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnComenzar.setEnabled(false);
				btnGenerarBoletos.setEnabled(false);
				btnGenerarBoletos.setVisible(false);
				boolean manual=false;
			
				
				
				if(rdbtnManual.isSelected()) {
					manual=true;
					btnGenerarNumero.setVisible(true);
						btnGenerarNumero.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							int aleatorio=0;
							if(contador==90) {
								JOptionPane.showMessageDialog(frame, "El juego ha terminado", "Fin del BINGO", JOptionPane.INFORMATION_MESSAGE);
							}else {
								boolean norepe=false;
								do {
									norepe=false;
									aleatorio=(int)Math.floor(Math.random()*(90+1-1)+1);
									for(int x=0;x<90;x++) {
										if(naleatorios[x]==aleatorio) {
											norepe=true;
										}
									}
								} while (norepe);
								
								lbl_Numeros_Aleatorios.setText(Integer.toString(aleatorio));
								naleatorios[contador]=aleatorio; 
								compruebacarton(aleatorio);
								aleatorio--;
								numerosordenados.get(aleatorio).setForeground(Color.green);
								
								contador++;
							}

						}
					});
				}else {
					

					time=new Timer();
					task=new TimerTask() {
						
						@Override
						public void run() {
							// TODO Apéndice de método generado automáticamente
							int aleatorio=0;
							boolean norepe=false;
							do {
								norepe=false;
								aleatorio=(int)Math.floor(Math.random()*(90+1-1)+1);
								for(int x=0;x<90;x++) {
									if(naleatorios[x]==aleatorio) {
										norepe=true;
									}
								}
							} while (norepe);
							
							lbl_Numeros_Aleatorios.setText(Integer.toString(aleatorio));
							naleatorios[contador]=aleatorio; 
							compruebacarton(aleatorio);
							aleatorio--;
							numerosordenados.get(aleatorio).setForeground(Color.green);
							
							contador++;
							if(contador==90) {	
								JOptionPane.showMessageDialog(frame, "El juego ha terminado", "Fin del BINGO", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						
					};
					time.schedule(task, 10,100);
					
				}
				
				
			}

			private void compruebacarton(int aleatorio) {
				// TODO Apéndice de método generado automáticamente
				
				for(int x=0;x<cartones.size();x++) {
					carton_teporal=cartones.get(x);
					for(int i=0;i<27;i++) {
						Numeros_Carton=carton_teporal.Array_etiquetas_carton.get(i);
						if(Numeros_Carton.getText().equals(Integer.toString(aleatorio))) {
							Numeros_Carton.setForeground(Color.GREEN);
							//si ha entrado aumnetamos los numeros que ya tenemos en el carton
							carton_teporal.totalAciertos++;
							//Con esto vamos a hacer que salga una ventasna cuando llegue a los 15 aciertos
							if(carton_teporal.totalAciertos==15) {
								x++;
								VentanaBingo bin=new VentanaBingo(x);
								bin.setVisible(true);
								time.cancel();	
							}
							//Aqui vamos a comprobar la linea del acierto
							if(i<9){
								carton_teporal.linea1++;
							}else if(i>8 && i<18) {
								carton_teporal.linea2++;
							}else {
								carton_teporal.linea3++;
							}
							
							//por ultimo vamos a lanzar una ventana que salga la linea del carton que es
							if(linea) {
								x++;
								if(carton_teporal.linea1==5) {
									JOptionPane.showMessageDialog(frame, "!!LINEAAAAA!!", "Han cantado linea en el carton " + x, JOptionPane.INFORMATION_MESSAGE);
									linea=false;
								}
								if(carton_teporal.linea2==5) {
									JOptionPane.showMessageDialog(frame, "!!LINEAAAAA!!", "Han cantado linea en el carton " + x, JOptionPane.INFORMATION_MESSAGE);
									linea=false;
								}
								if(carton_teporal.linea3==5) {
									JOptionPane.showMessageDialog(frame, "!!LINEAAAAA!!", "Han cantado linea en el carton " + x, JOptionPane.INFORMATION_MESSAGE);
									linea=false;
								}
								x--;
							}
							
						}	
					}
				}

			}
		});
		btnGenerarBoletos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<JLabel> cartoncreado=new ArrayList<>();
				
				CartonBingo frame = new CartonBingo(Cuenta_Boletos);
				frame.setVisible(true);
				Cuenta_Boletos++;
				cartones.add(frame);
				for(int i=0;i<cartones.size();i++) {
					System.out.println(cartones.get(i));
				}
			}
		});
	}
	
}
