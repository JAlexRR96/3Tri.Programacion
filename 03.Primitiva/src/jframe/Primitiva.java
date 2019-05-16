package jframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Primitiva extends JFrame {

	private JPanel Principal;
	private JPanel Logo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnGenerarLoteria;
	private JButton btnSorteo;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JRadioButton rb4;
	private JRadioButton rb5;
	private JRadioButton rb6;
	private JLabel lblNApuesta;
	private int napuestas;
	ArrayList<JRadioButton> botones;
	private JLabel lblApuestaGanadora;
	private JLabel lblNumeros;
	private int[]winner=new int[6];
	private int[][]apuestas=new int[6][6];
	private int[]apu=new int[6];
	private JLabel lblApuestas;
	private JLabel lblA;
	private JLabel lblAciertos;
	private JLabel lblAciertos_1;
	ArrayList<JLabel> numeros;
	private JButton btnNPrimitiva;
	ArrayList<JLabel> napu;
	ArrayList<JLabel> acier;
	

	/**
	 * Create the frame.
	 */
	public Primitiva() {
		setTitle("PRIMITIVA");
		botones=new ArrayList<>();
		numeros=new ArrayList<>();
		napu=new ArrayList<>();
		acier=new ArrayList<>();
		
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Primitiva.class.getResource("/imagenes/logo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		Principal = new JPanel();
		Principal.setBackground(Color.WHITE);
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Principal);
		Principal.setLayout(null);
		diseñarventana();
		definireventos();
		
	}


	private void diseñarventana() {
		// TODO Apéndice de método generado automáticamente

		
		JLabel lblNumeroDeApuestas = new JLabel("N\u00DAMERO DE APUESTAS");
		lblNumeroDeApuestas.setBounds(10, 139, 300, 14);
		Principal.add(lblNumeroDeApuestas);
	
		Logo l= new Logo();
		l.setBounds(10, 11, 300, 100);
		Principal.add(l);
		//radio butons para que el usuario eliga cuantas quiere
		rb1 = new JRadioButton("1");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb1.setBounds(10, 160, 50, 30);
		Principal.add(rb1);
		botones.add(rb1);
		
		rb2 = new JRadioButton("2");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb2.setBounds(60, 160, 50, 30);
		Principal.add(rb2);
		botones.add(rb2);
		
		rb3 = new JRadioButton("3");
		buttonGroup.add(rb3);
		rb3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb3.setBounds(110, 160, 50, 30);
		Principal.add(rb3);
		botones.add(rb3);
		
		rb4 = new JRadioButton("4");
		buttonGroup.add(rb4);
		rb4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb4.setBounds(160, 160, 50, 30);
		Principal.add(rb4);
		botones.add(rb4);
		
		rb5 = new JRadioButton("5");
		buttonGroup.add(rb5);
		rb5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb5.setBounds(210, 160, 50, 30);
		Principal.add(rb5);
		botones.add(rb5);
		
		rb6 = new JRadioButton("6");
		buttonGroup.add(rb6);
		rb6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rb6.setBounds(260, 160, 50, 30);
		Principal.add(rb6);
		botones.add(rb6);
		
		btnGenerarLoteria = new JButton("GENERAR LOTERIA");
		btnGenerarLoteria.setToolTipText("Pulsa para generar los boletos");
		btnGenerarLoteria.setForeground(Color.BLACK);
		btnGenerarLoteria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGenerarLoteria.setBounds(10, 200, 300, 40);
		Principal.add(btnGenerarLoteria);
		
		btnSorteo = new JButton("SORTEO");
		btnSorteo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSorteo.setBounds(10, 251, 300, 40);
		Principal.add(btnSorteo);
		btnSorteo.setEnabled(false);
		
		lblApuestaGanadora = new JLabel("");
		lblApuestaGanadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblApuestaGanadora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApuestaGanadora.setBounds(10, 302, 300, 30);
		Principal.add(lblApuestaGanadora);
		
		lblNumeros = new JLabel("");
		lblNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeros.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNumeros.setBounds(10, 343, 300, 70);
		Principal.add(lblNumeros);
		

		
		lblA = new JLabel();
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblA.setBounds(400, 10, 300, 70);
		Principal.add(lblA);
		
		lblAciertos_1 = new JLabel();
		lblAciertos_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAciertos_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblAciertos_1.setBounds(750, 10, 100, 70);
		Principal.add(lblAciertos_1);
		
		btnNPrimitiva = new JButton("NUEVA PRIMITIVA");
		btnNPrimitiva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNPrimitiva.setBounds(10, 460, 300, 40);
		Principal.add(btnNPrimitiva);
		btnNPrimitiva.setEnabled(false);

		
	}
	

	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		btnGenerarLoteria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblA.setText("APUESTAS");
				btnGenerarLoteria.setEnabled(false);
				btnSorteo.setEnabled(true);
				
				napuestas=numerodeapuestas();
				dibujoapuestas();
			}

			private void dibujoapuestas() {
				// TODO Apéndice de método generado automáticamente
				int aleatorio=0;
				for(int i=0;i<napuestas;i++) {
					for(int x=0;x<6;x++) {
						do {
							aleatorio=(int)Math.floor(Math.random()*(49+1-1)+1);
						} while (generaaleatoriosinrepeticion(aleatorio));
						apu[x]=aleatorio;
						apuestas[i][x]=aleatorio;
					}
					for(int j=0;j<apu.length;j++) {
						apu[j]=0;
					}
				}
				System.out.println(Arrays.deepToString(apuestas));
				int y=80;
				int hor=290;
					for(int x=0;x<napuestas;x++) {
						x++;
						lblNApuesta = new JLabel("");
						lblNApuesta.setHorizontalAlignment(SwingConstants.CENTER);
						lblNApuesta.setFont(new Font("Tahoma", Font.PLAIN, 26));
						lblNApuesta.setBounds(350, y, 60, 60);
						lblNApuesta.setText(Integer.toString(x)+":");
						Principal.add(lblNApuesta);
						lblNApuesta.repaint();
						napu.add(lblNApuesta);
						x--;
						for(int j=0;j<6;j++) {
							String num=Integer.toString(apuestas[x][j]);
							
							lblApuestas = new JLabel("");
							lblApuestas.setHorizontalAlignment(SwingConstants.CENTER);
							lblApuestas.setFont(new Font("Tahoma", Font.PLAIN, 26));
							lblApuestas.setBounds(hor, y, 300, 60);
							lblApuestas.setText(num);
							Principal.add(lblApuestas);
							lblApuestas.repaint();
							numeros.add(lblApuestas);
							hor=hor+50;
						}
						y=y+60;
						hor=290;
				}

			}

			private boolean generaaleatoriosinrepeticion(int aleatorio) {
				// TODO Apéndice de método generado automáticamente
				boolean norepe=false;
				for(int x=0;x<apu.length;x++) {
					if(apu[x]==(aleatorio)) {
						norepe=true; 
					}
				}
				return norepe;
			}

			private int numerodeapuestas() {
				// TODO Apéndice de método generado automáticamente
				int apuestas=0;
				JRadioButton radio;
				for(int i=0;i<6;i++) {
					radio=botones.get(i);
					if(radio.isSelected()) {
						apuestas=Integer.parseInt(radio.getText());
						System.out.println(apuestas);
					}
				}
				return apuestas;
			}
		});
		
		//Boton de sorteo
		btnSorteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//generamos los numeros aleatorios para saber el sorteo de la primitiva
				btnSorteo.setEnabled(false);
				btnNPrimitiva.setEnabled(true);
				int aleatorio=0;
				for(int x=0;x<winner.length;x++) {	
					do {
						aleatorio=(int)Math.floor(Math.random()*(49+1-1)+1);
					} while (generaaleatoriosinrepeticion(aleatorio));
					winner[x]=aleatorio;
				}
				System.out.println(Arrays.toString(winner));
				//Mostramos los numeros de la primitiva 
				String numerosganadores="";
				for(int x=0;x<winner.length;x++) {
					int num=winner[x];
					if(x==5) {
						numerosganadores=numerosganadores+Integer.toString(num);
					}else {
						numerosganadores=numerosganadores+Integer.toString(num)+" - ";
					}
					
				}
				lblApuestaGanadora.setText("APUESTA GANADORA");
				lblAciertos_1.setText("ACIERTOS");
				lblNumeros.setText(numerosganadores);
				numerosganadores="";
				
				
				compruebaaciertos();
			}

			private void compruebaaciertos() {
				// TODO Apéndice de método generado automáticamente
				int contadoraciertos=0;
				int y=80;
				int contador=0;
				for(int i=0;i<napuestas;i++) {
					
					for(int x=0;x<6;x++) {
						
						for(int j=0;j<6;j++) {
							if(winner[j]==apuestas[i][x]) {
								contadoraciertos++;
								numeros.get(contador).setForeground(Color.green);
								break;
							}else {
								numeros.get(contador).setForeground(Color.red);
								
							}
							
						}
						contador++;
					}
					System.out.println(contadoraciertos);
					lblAciertos = new JLabel("");
					lblAciertos.setBounds(800, y, 50, 60);
					lblAciertos.setFont(new Font("Tahoma", Font.PLAIN, 26));
					lblAciertos.setText(Integer.toString(contadoraciertos));
					Principal.add(lblAciertos);
					lblAciertos.repaint();
					acier.add(lblAciertos);
					y=y+60;
					contadoraciertos=0;
				}

			}

			private boolean generaaleatoriosinrepeticion(int aleatorio) {
				// TODO Apéndice de método generado automáticamente
				boolean norepe=false;
				for(int x=0;x<winner.length;x++) {
					if(winner[x]==(aleatorio)) {
						norepe=true; 
					}
				}
				return norepe;
			}
		});
		
		
		
		btnNPrimitiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNPrimitiva.setEnabled(false);
				btnGenerarLoteria.setEnabled(true);
				for(int i=0;i<numeros.size();i++) {
					numeros.get(i).setText("");
				}
				numeros.clear();
				for(int x=0;x<napuestas;x++) {
					napu.get(x).setText("");
					acier.get(x).setText("");
				}
				napu.clear();
				acier.clear();
				lblApuestaGanadora.setText("");
				lblAciertos_1.setText("");
				lblNumeros.setText("");
				lblA.setText("");
			}
		});
	}
	
	
	
	public class Logo extends javax.swing.JPanel{
		public Logo() {
		  this.setSize(300, 100);
		 }

		 @Override
		 public void paintComponent(Graphics g) {
		  Dimension tamanio = getSize();
		  ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/primi logo.jpg"));
		  g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
		  setOpaque(false);
		  super.paintComponent(g);
		 }
	}
}
