package estudioFrameyPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class EstudioJFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioJFrame frame = new EstudioJFrame();
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
	public EstudioJFrame() {
		//Icono del frame
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\Peneland\\descarga.jpg"));
		//Accion al pulsar la x de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Para las medidas de la caja
		setBounds(100, 100, 981, 676);
		//titulo del panel
		setTitle("Estudio de Formulario");
		//definimos el panel
		Panelimagen p=new Panelimagen();
		//JPanel contentPane = new JPanel();
		//Una clase que proporciona un borde vacío, transparente, que ocupa espacio pero no hace ningún dibujo
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		//Contenido del frame
		//setContentPane(contentPane);
		setContentPane(p);
		p.setLayout(null);
		  
		  JPanel panel = new JPanel();
		  panel.setBounds(27, 22, 341, 93);
		  p.add(panel);
		  panel.setLayout(new GridLayout(1, 0, 0, 0));
		  
		  JButton btnNewButton = new JButton("1");
		  panel.add(btnNewButton);
		  
		  JButton btnNewButton_1 = new JButton("2");
		  panel.add(btnNewButton_1);
		  
		  JButton btnNewButton_2 = new JButton("3");
		  panel.add(btnNewButton_2);
		  
		  JButton btnNorte = new JButton("4");
		  panel.add(btnNorte);
		  
		  JPanel panel_2 = new JPanel();
		  panel_2.setBounds(710, 22, 245, 129);
		  p.add(panel_2);
		  panel_2.setLayout(new BorderLayout(0, 0));
		  
		  JButton btnNewButton_5 = new JButton("NORTH");
		  panel_2.add(btnNewButton_5, BorderLayout.NORTH);
		  
		  JButton btnNewButton_6 = new JButton("CENTER");
		  panel_2.add(btnNewButton_6, BorderLayout.CENTER);
		  
		  JButton btnNewButton_7 = new JButton("WEST");
		  panel_2.add(btnNewButton_7, BorderLayout.WEST);
		  
		  JButton btnNewButton_8 = new JButton("EAST");
		  panel_2.add(btnNewButton_8, BorderLayout.EAST);
		  
		  JButton btnNewButton_9 = new JButton("SOUTH");
		  panel_2.add(btnNewButton_9, BorderLayout.SOUTH);
		  
		  JPanel panel_1 = new JPanel();
		  panel_1.setBounds(27, 126, 341, 159);
		  p.add(panel_1);
		  panel_1.setLayout(new CardLayout(0, 0));
		  
		  JButton btnNewButton_3 = new JButton("boton1");
		  btnNewButton_3.setBackground(new Color(255, 255, 0));
		  panel_1.add(btnNewButton_3, "name_11019331480437");
		  
		  JButton btnBoton = new JButton("boton2");
		  panel_1.add(btnBoton, "name_11020987456955");
		  
		  JButton button = new JButton("");
		  button.setIcon(new ImageIcon(EstudioJFrame.class.getResource("/imagenes/descarga.jpg")));
		  button.setBackground(new Color(204, 0, 0));
		
		  button.setBounds(614, 189, 280, 241);
		  p.add(button);
		  
		  this.setVisible(true);

		
	}
}
 