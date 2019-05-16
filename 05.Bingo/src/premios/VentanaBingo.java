package premios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaBingo extends JFrame {

	private JPanel contentPane;

	public VentanaBingo(int x) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.setBounds(5, 5, 424, 195);
		button.setIcon(new ImageIcon(VentanaBingo.class.getResource("/imagenes/bingopremio.jpg")));
		contentPane.add(button);
		
		JLabel lblCartonpremiado = new JLabel("");
		lblCartonpremiado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCartonpremiado.setHorizontalAlignment(SwingConstants.CENTER);
		lblCartonpremiado.setBounds(5, 211, 424, 45);
		contentPane.add(lblCartonpremiado);
		lblCartonpremiado.setText("El carton premiado es: "+x);
		
		
	}

}
