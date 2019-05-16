package carton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalIconFactory;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CartonBingo extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumeros;
	private JLabel lblNumeroBoletos;
	private int[][]boleto=new int[3][9];
	ArrayList<Integer> numero_en_boletos;
	private  Border border;
	public ArrayList<JLabel> Array_etiquetas_carton;
	public int totalAciertos,linea1,linea2,linea3;


	public CartonBingo(int cuenta_Boletos) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CartonBingo.class.getResource("/imagenes/icono carton.jpg")));
		setBackground(new Color(0, 153, 204));
		setTitle("Cartón numero - "+ cuenta_Boletos);
		setBounds(100, 100, 470, 170);
		
	    border = LineBorder.createBlackLineBorder();
	    
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 9, 0, 0));
		
		Array_etiquetas_carton=new ArrayList<>();
		totalAciertos=0;
		linea1=0;
		linea2=0;
		linea3=0;
		
		disenarventana();
		definireventos();

	}


	/**
	 * @wbp.parser.constructor
	 */
	public CartonBingo(ArrayList<JLabel> array_etiquetas_carton) throws HeadlessException {
		super();
		/*addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
			para hacer que cuando cerremos un carton nos lo elimine del array cartones
			}
		});*/
		this.setArray_etiquetas_carton(array_etiquetas_carton);
		this.setLinea1(linea1);
		this.setLinea2(linea2);
		this.setLinea3(linea3);
		this.setTotalAciertos(totalAciertos);
	}


	public ArrayList<JLabel> getArray_etiquetas_carton() {
		return Array_etiquetas_carton;
	}


	public void setArray_etiquetas_carton(ArrayList<JLabel> array_etiquetas_carton) {
		Array_etiquetas_carton = array_etiquetas_carton;
	}


	public int getTotalAciertos() {
		return totalAciertos;
	}


	public void setTotalAciertos(int totalAciertos) {
		this.totalAciertos = totalAciertos;
	}


	public int getLinea1() {
		return linea1;
	}


	public void setLinea1(int linea1) {
		this.linea1 = linea1;
	}


	public int getLinea2() {
		return linea2;
	}


	public void setLinea2(int linea2) {
		this.linea2 = linea2;
	}


	public int getLinea3() {
		return linea3;
	}


	public void setLinea3(int linea3) {
		this.linea3 = linea3;
	}


	private void disenarventana() {
		// TODO Apéndice de método generado automáticamente
		numero_en_boletos=new ArrayList<>();
		
		int[][]aleatorio=new int[3][9];
		int[][]huecos=new int[3][9];

		aleatorio=generaaleatorios();
		
		huecos=generarhuecos();
		
		boleto=generarboleto(aleatorio,huecos);
		
		for(int x=0;x<27;x++) {
				System.out.print("  ");
				lblNumeros = new JLabel("");
				lblNumeros.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNumeros.setHorizontalAlignment(SwingConstants.CENTER);
				lblNumeros.setBorder(border);
				contentPane.add(lblNumeros);
				if(numero_en_boletos.get(x)==-1) {
					lblNumeros.setIcon( new ImageIcon(getClass().getResource("/imagenes/hueco.jpg")));
					Array_etiquetas_carton.add(lblNumeros);
					
				}else {
					int nume=numero_en_boletos.get(x);
					
					lblNumeros.setText(Integer.toString(nume));	
					Array_etiquetas_carton.add(lblNumeros);
				}
			}
	}
	
	
	private int[][] generarboleto(int[][] aleatorio, int[][] huecos) {
		// TODO Apéndice de método generado automáticamente
		int[][]boleto=new int[3][9];
		for(int i=0;i<3;i++) {
			for(int x=0;x<9;x++) {
				if(huecos[i][x]==-1) {
					boleto[i][x]=huecos[i][x];
					numero_en_boletos.add(boleto[i][x]);
				}else {
					boleto[i][x]=aleatorio[i][x];
					numero_en_boletos.add(boleto[i][x]);
				}
				
			}
		}
		return boleto;
	}


	private int[][] generarhuecos() {
		// TODO Apéndice de método generado automáticamente
		boolean norepe=false;
		int ale=0;
		int[][]huecos=new int[3][9];
		for(int i=0;i<3;i++) {
			for(int x=0;x<4;x++) {
				do {
					norepe=false;
					ale=(int)Math.floor(Math.random()*(8-0+1)+0);
				} while (compruebahuecos(ale,huecos,i));
				huecos[i][ale]=-1;
			}
		}
		return huecos;
	}


	private boolean compruebahuecos(int ale, int[][] huecos, int i) {
		// TODO Apéndice de método generado automáticamente
		boolean norepe=false;
		int cont=0;
			if(huecos[i][ale]==-1) {
			norepe=true;	
			}
			for(int x=0;x<3;x++) {
				if(huecos[x][ale]==-1) {
					cont++;
				}
			}
			if(cont==2) {
				norepe=true;
			}
			cont=0;
		return norepe;
	}


	private int[][] generaaleatorios() {
		// TODO Apéndice de método generado automáticamente
		boolean norepe=false;
		int ale=0;
		int[][]aleatorio=new int[3][9];
		int sup=9, inf=1;
		int contador=0;
		List<Integer> columnas=new ArrayList<>();
		
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				do {
					norepe=false;
					ale=(int)Math.floor(Math.random()*(sup-inf+1)+inf);
					for(int x=0;x<3;x++) {
						for(int i=0;i<9;i++) {
							if(aleatorio[x][i]==ale) {
							norepe=true;
							}
						}
		
					}
				} while (norepe);	
				aleatorio[j][g]=ale;
			}	
			if(contador==0) {
				inf=inf+9;
				sup=sup+10;
			}else if(contador==7) {
				sup=sup+11;
				inf=inf+10;
			}else {
				sup=sup+10;
				inf=inf+10;
			}
			contador++;
		}
		//System.out.println(contador);
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				columnas.add(aleatorio[j][g]);
			}
		}	
		columnas.sort(null);
		contador=0;
		for(int g=0;g<9;g++) {
			for(int j=0;j<3;j++) {
				aleatorio[j][g]=columnas.get(contador);
				contador++;
			}
		}	
		
		return aleatorio;
	}


	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		
	}

}
