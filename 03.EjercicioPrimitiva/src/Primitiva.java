import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Primitiva extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblApuestas;
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JRadioButton rb3;
	private JRadioButton rb4;
	private JRadioButton rb5;
	private JRadioButton rb6;
	private JButton btnApostar;
	private JLabel lblTusApuestas;
	private JLabel lblNApuesta;
	private JLabel lblAciertos;
	private JLabel lbl1;
	private JLabel label;
	private JLabel label_1;
	ArrayList<JRadioButton> apuestas;
	private int napuestas;
	private int[]repe= new int[6];
	private JButton btnSorteo;
	private JPanel panel;
	private JLabel lblNGanador;
	private int[][]numeroapuestas=new int[6][6];
	private int[]boletoganador=new int[6];
	ArrayList<JLabel>  boletos;
	private JLabel lblColor;
	private JLabel lblNewLabel;
	private int[]aciertos=new int[6];
	
	public Primitiva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		definirventana();
		definireventos();
		
		this.setVisible(true);
		
	}


	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		apuestas=new ArrayList<>();
		boletos=new ArrayList<>();
		
		
		lblApuestas = new JLabel("APUESTAS");
		lblApuestas.setHorizontalAlignment(SwingConstants.CENTER);
		lblApuestas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApuestas.setBounds(805, 11, 250, 36);
		contentPane.add(lblApuestas);
		
		rb1 = new JRadioButton("1");
		rb1.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb1.setBounds(899, 58, 46, 36);
		contentPane.add(rb1);
		apuestas.add(rb1);
		
		rb2 = new JRadioButton("2");
		rb2.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb2.setBounds(899, 97, 46, 36);
		contentPane.add(rb2);
		apuestas.add(rb2);
		
		rb3 = new JRadioButton("3");
		rb3.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb3);
		rb3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb3.setBounds(899, 136, 46, 36);
		contentPane.add(rb3);
		apuestas.add(rb3);
		
		rb4 = new JRadioButton("4");
		rb4.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb4);
		rb4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb4.setBounds(899, 175, 46, 36);
		contentPane.add(rb4);
		apuestas.add(rb4);
		
		rb5 = new JRadioButton("5");
		rb5.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb5);
		rb5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb5.setBounds(899, 214, 46, 36);
		contentPane.add(rb5);
		apuestas.add(rb5);
		
		rb6 = new JRadioButton("6");
		rb6.setBackground(new Color(0, 153, 255));
		buttonGroup.add(rb6);
		rb6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rb6.setBounds(899, 253, 46, 36);
		contentPane.add(rb6);
		apuestas.add(rb6);
		
		btnApostar = new JButton("APOSTAR");
		btnApostar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnApostar.setBounds(805, 318, 250, 36);
		contentPane.add(btnApostar);
		
		lblTusApuestas = new JLabel("TUS APUESTAS");
		lblTusApuestas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTusApuestas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTusApuestas.setBounds(10, 11, 514, 36);
		contentPane.add(lblTusApuestas);
		
		/*lblNApuesta = new JLabel("");
		lblNApuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNApuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNApuesta.setBounds(10, 58, 46, 36);
		contentPane.add(lblNApuesta);*/
		
		/*lblAciertos = new JLabel("");
		lblAciertos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAciertos.setBounds(582, 58, 46, 36);
		contentPane.add(lblAciertos);*/
		
		btnSorteo = new JButton("SORTEO");
		btnSorteo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSorteo.setBounds(805, 379, 250, 36);
		contentPane.add(btnSorteo);
		btnSorteo.setEnabled(false);
		
		JLabel lblAciertosTotales = new JLabel("ACIERTOS TOTALES");
		lblAciertosTotales.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAciertosTotales.setBounds(478, 11, 198, 36);
		contentPane.add(lblAciertosTotales);
		
	/*	lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(554, 88, 46, 36);
		contentPane.add(lblNewLabel);*/
		
	/*	JLabel lblApuestaGanadora = new JLabel("APUESTA GANADORA");
		lblApuestaGanadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblApuestaGanadora.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblApuestaGanadora.setBounds(10, 401, 396, 36);
		contentPane.add(lblApuestaGanadora);*/
	
	/*	lblNGanador = new JLabel("");
		lblNGanador.setBounds(10, 11, 65, 56);
		panel.add(lblNGanador);*/
		
		/*lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(88, 58, 46, 36);
		contentPane.add(lbl1);*/
		
		
		/*label = new JLabel(":");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(49, 58, 46, 36);
		contentPane.add(label);*/
		
		/*lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(554, 88, 46, 36);
		//lblNewLabel.setText(Integer.toString(contador));
		contentPane.add(lblNewLabel);*/
		
	}

	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		//boton apostar
		btnApostar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnApostar.setEnabled(false);
				btnSorteo.setEnabled(true);
				int y=58;
				JRadioButton radio;
				for(int i=0;i<apuestas.size();i++) {
					radio=apuestas.get(i);
					if(radio.isSelected()) {
						i++;
						napuestas=i;
						for(int x=0;x<i;x++) {
							lblNApuesta = new JLabel("");
							lblNApuesta.setBounds(10, y, 46, 36);
							lblNApuesta.setHorizontalAlignment(SwingConstants.CENTER);
							lblNApuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
							contentPane.add(lblNApuesta);
							x++;
							lblNApuesta.setText(Integer.toString(x));
							x--;
							lblNApuesta=null;
							
							label = new JLabel();
							label.setHorizontalAlignment(SwingConstants.CENTER);
							label.setFont(new Font("Tahoma", Font.PLAIN, 20));
							label.setBounds(49, y, 46, 36);
							contentPane.add(label);
							label.setText(":");
							
							definirboleto(y,x);
							
							y=y+50;
						}
						i--;
						
						System.out.println(Arrays.deepToString(numeroapuestas));
						
					}
				}
				
				
			}

			private void definirboleto(int y, int x) {
				// TODO Apéndice de método generado automáticamente
				int hor=88;
				for(int j=0;j<6;j++) {
					lbl1 = new JLabel("");
					lbl1.setHorizontalAlignment(SwingConstants.CENTER);
					lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lbl1.setBounds(hor, y, 46, 36);
					contentPane.add(lbl1);
					int aleatorio=0;
					do {
						aleatorio=(int)Math.floor(Math.random()*(49+1-1)+1);
					} while (generaaleatoriosinrepeticion(aleatorio));
					numeroapuestas[x][j]=aleatorio;
					repe[j]=aleatorio;
					lbl1.setText(Integer.toString(aleatorio));
					int hor2=118;
					boletos.add(lbl1);
					hor=hor+60;
				}
				for(int i=0;i<repe.length;i++) {
					repe[i]=0;
				}
				
			}

			private boolean generaaleatoriosinrepeticion(int aleatorio) {
				// TODO Apéndice de método generado automáticamente
				boolean norepe=false;
				for(int x=0;x<6;x++) {
					if(repe[x]==(aleatorio)) {
						norepe=true; 
					}
				}
				
				return norepe;
			}
			
		});
		
		//Boton sorteo
		btnSorteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSorteo.setEnabled(false);
				int hor=10;
				
				for(int j=0;j<6;j++) {
					lblNGanador = new JLabel("");
					lblNGanador.setHorizontalAlignment(SwingConstants.CENTER);
					lblNGanador.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblNGanador.setBounds(hor, 401, 396, 36);
					contentPane.add(lblNGanador);
					int aleatorio=0;
					do {
						aleatorio=(int)Math.floor(Math.random()*(49+1-1)+1);
					} while (generaaleatoriosinrepeticion(aleatorio));
					boletoganador[j]=aleatorio;
					repe[j]=aleatorio;
					lblNGanador.setText(Integer.toString(aleatorio));
					int hor2=118;

					hor=hor+60;
				}
				for(int i=0;i<repe.length;i++) {
					repe[i]=0;
				}
				System.out.println(Arrays.toString(boletoganador));
				compruebaboletos();
				sacaraciertos();
			}
			

			private void sacaraciertos() {
				// TODO Apéndice de método generado automáticamente
				int y=58;
				for(int i=0;i<napuestas;i++) {
					lblNewLabel = new JLabel();
					lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
					lblNewLabel.setBounds(554, y, 46, 36);
					lblNewLabel.setText(Integer.toString(aciertos[i]));
					contentPane.add(lblNewLabel);
					y=y+50;
				}
			}


			private void compruebaboletos() {
				// TODO Apéndice de método generado automáticamente
				int c=0;
				int t=0;
				int contador=0;
				for(int i=0;i<boletos.size();i++) {	
					for(int x=0;x<6;x++) {
						if(boletoganador[x]==Integer.parseInt(boletos.get(i).getText())) {
							contador++;
							boletos.get(c).setForeground(Color.green);
							break;
						}else {
							boletos.get(c).setForeground(Color.red);
						}
					}
					if(c==6) {
						aciertos[t]=contador;
						t++;
						contador=0;
					}
					c++;
				}
				System.out.println(Arrays.toString(aciertos));
			}

			private boolean generaaleatoriosinrepeticion(int aleatorio) {
				// TODO Apéndice de método generado automáticamente
				boolean norepe=false;
				for(int x=0;x<6;x++) {
					if(repe[x]==(aleatorio)) {
						norepe=true; 
					}
				}
				
				return norepe;
			}
				
				
			
		});
	}
}
