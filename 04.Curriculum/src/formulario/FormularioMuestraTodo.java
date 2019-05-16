package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class FormularioMuestraTodo extends JFrame {

	private JPanel contentPane;
	private JTextArea txtMostramos;


	public FormularioMuestraTodo(String curriculum) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMostramos = new JTextArea();
		txtMostramos.setBounds(10, 11, 431, 596);
		contentPane.add(txtMostramos);
		

		txtMostramos.setText(curriculum);
	}
}
