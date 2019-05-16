package estudioListas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class EstudioListas extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnAceptar;
	private JLabel lblPuebloElejido;
	private String pueblo;
	private JLabel label;
	private JScrollPane scrollPane_1;
	private JList listDiasSemana;
	private JScrollPane scrollPane_2;
	private JList listMeses;
	private JLabel lblDiassemana;
	private JLabel lblMeses;
	private JLabel lblDia;
	private JLabel lblMes;
	DefaultListModel modelo;
	DefaultListModel modelo2;
	private JTextField textField;
	private JButton button;
	private String[]meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre", "Octubre","Noviembre","Diciembre"};
	private JTextField textField_1;
	private JComboBox comboBox;
	private JLabel lblCB ;
	private JButton btnAceptar_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JButton button_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioListas frame = new EstudioListas();
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
	public EstudioListas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		definirventana();
		definireventos();
		
	}
	
	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		//Para hacer una lista  primero debemos de hacer un scrol panel
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 55, 172, 187);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.PLAIN, 24));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Lebrija", "Trebujena", "El cuervo", "Andujar", "Chipiona", "Las Cabezas", "Jerez", "Sanlucar"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JLabel lblPueblois = new JLabel("Pueblos");
		lblPueblois.setHorizontalAlignment(SwingConstants.CENTER);
		lblPueblois.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblPueblois.setBounds(21, 11, 172, 33);
		contentPane.add(lblPueblois);
		
		lblPuebloElejido = new JLabel("Pueblo elejido");
		lblPuebloElejido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuebloElejido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPuebloElejido.setBounds(20, 253, 173, 33);
		contentPane.add(lblPuebloElejido);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(21, 297, 172, 40);
		contentPane.add(btnAceptar);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(21, 348, 172, 40);
		contentPane.add(label);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(233, 55, 172, 187);
		contentPane.add(scrollPane_1);
		
		//IMportante el orden
		// estloo nos servira para coger datos de varuiables
		modelo=new DefaultListModel();
		listDiasSemana = new JList(modelo);
		listDiasSemana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		modelo.addElement("Lunes");modelo.addElement("Martes");modelo.addElement("Miercoles");modelo.addElement("Jueves");
		modelo.addElement("Viernes");modelo.addElement("Sabado");modelo.addElement("Domingo");
	
		scrollPane_1.setViewportView(listDiasSemana);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(440, 55, 172, 187);
		contentPane.add(scrollPane_2);
		
		listMeses = new JList(meses);
		listMeses.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane_2.setViewportView(listMeses);
		
		lblDiassemana = new JLabel("DiasSemana");
		lblDiassemana.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiassemana.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblDiassemana.setBounds(233, 11, 172, 33);
		contentPane.add(lblDiassemana);
		
		lblMeses = new JLabel("Meses");
		lblMeses.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeses.setFont(new Font("Dialog", Font.PLAIN, 23));
		lblMeses.setBounds(440, 11, 172, 33);
		contentPane.add(lblMeses);
		
		lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDia.setBounds(233, 396, 173, 33);
		contentPane.add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMes.setBounds(439, 253, 173, 33);
		contentPane.add(lblMes);
		
		button = new JButton("Agregar");
		button.setBounds(233, 297, 172, 40);
		contentPane.add(button);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 252, 172, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox = new JComboBox(meses);
		comboBox.addItem("trebujena");
		comboBox.setBounds(10, 439, 170, 31);
		contentPane.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblCB = new JLabel("");
		lblCB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCB.setBounds(10, 481, 170, 40);
		contentPane.add(lblCB);
		
		btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.setBounds(10, 532, 89, 23);
		contentPane.add(btnAceptar_1);
		
		label_1 = new JLabel("");
		label_1.setBounds(109, 532, 123, 23);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(216, 440, 188, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		button_1 = new JButton("Agregar");
		button_1.setBounds(427, 439, 172, 40);
		contentPane.add(button_1);
		
		
	}
	
	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				pueblo=list.getSelectedValue().toString();
				lblPuebloElejido.setText(pueblo);
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pueblo=list.getSelectedValue().toString();
				if(pueblo.equals(null)) {
					label.setText("No has marcado");
				}else {
				label.setText(pueblo);
				}
				
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dia=textField_1.getText();
				modelo.addElement(dia);
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pueblo=comboBox.getSelectedItem().toString();
				lblCB.setText(pueblo);
				
			}
		});
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pueblo=comboBox.getSelectedItem().toString();
				label_1.setText(pueblo);
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pueblo=textField_2.getText();
				comboBox.addItem(pueblo);
			}
		});
	}
}
