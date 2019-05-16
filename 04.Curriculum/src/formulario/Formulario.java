package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Formulario extends JFrame {

	private JPanel PanelPrincipal;
	private JLabel lblCurriculumVitae;
	
	private JPanel DatosPersonales;
	private JLabel lblNombre,lblApellidos,lblDireccion,lblTelefono;
	private JTextField txtNombre,txtApellidos,txtDireccion,txtTelefono;
	private JComboBox comboBox;
	private JLabel lblPoblacion;
	private JButton btnAceptar;
	DefaultComboBoxModel poblacion;
	
	private JPanel EstadoCivil;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnSoltero,rdbtnCasado,rdbtnDivorciado;
	ArrayList<JRadioButton> rdbt;
	
	private JPanel LenguajesProgramacion;
	private JCheckBox chckbxJava,chckbxDelphi,chckbxAndroid;
	ArrayList<JCheckBox> leng;
	
	private JPanel SistemasOperativos;
	private JScrollPane scrollPane;
	private JList list;
	private String[]SO={"Windows 7","Windows 10","Windows Vista","Linux","Android","MacOs","IOs"};
	
	private JTextArea textArea;
	private JPanel BasesDeDatos;
	
	private JPanel ExperienciaLaboral;
	private JScrollPane scrollPane_1;
	
	private JList list_1;
	DefaultListModel BD;
	
	private String nombre,apellidos,direccion,telefono,pueblo,estado_civil,lenguajes,s_o,b_d,E_Pro;
	private String TextoFinal;
	
	//private JFrame frame;
	


	private String Curriculum;
	


/*	

	public Formulario(String curriculum) throws HeadlessException {
		super();
		this.setCurriculum(Curriculum);
	}


	public String getCurriculum() {
		return Curriculum;
	}


	public void setCurriculum(String curriculum) {
		Curriculum = curriculum;
	}
*/

	public Formulario() {
		setTitle("Curriculum Vitae");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 422);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		disenoventana();
		disenoeventos();
	}


	private void disenoventana() {
		// TODO Apéndice de método generado automáticamente
		lblCurriculumVitae = new JLabel("CURRICULUM VITAE");
		lblCurriculumVitae.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurriculumVitae.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurriculumVitae.setBounds(10, 11, 890, 36);
		PanelPrincipal.add(lblCurriculumVitae);
		
		//frame=this;
		//fmr=new FormularioMuestraTodo();
		//Panel de datos principales
		//Inicio
		DatosPersonales = new JPanel();
		DatosPersonales.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DatosPersonales.setBounds(10, 58, 340, 200);
		PanelPrincipal.add(DatosPersonales);
		DatosPersonales.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(10, 27, 92, 22);
		DatosPersonales.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(112, 27, 156, 23);
		DatosPersonales.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(10, 60, 92, 22);
		DatosPersonales.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(112, 62, 217, 23);
		DatosPersonales.add(txtApellidos);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDireccion.setBounds(10, 93, 92, 22);
		DatosPersonales.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(112, 96, 217, 23);
		DatosPersonales.add(txtDireccion);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefono.setBounds(10, 126, 92, 22);
		DatosPersonales.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(112, 129, 156, 23);
		DatosPersonales.add(txtTelefono);
		
		poblacion=new DefaultComboBoxModel();
		comboBox = new JComboBox(poblacion);
		comboBox.setBounds(112, 163, 156, 22);
		poblacion.addElement("Lebirja");poblacion.addElement("Jerez");poblacion.addElement("El Cuervo");poblacion.addElement("Chipiona");poblacion.addElement("Sanlucar");
		DatosPersonales.add(comboBox);
		
		lblPoblacion = new JLabel("Poblacion");
		lblPoblacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPoblacion.setBounds(10, 159, 92, 26);
		DatosPersonales.add(lblPoblacion);
		//END
		
		//Panel Estado Civil
		//Inicio
		rdbt=new ArrayList();
		
		EstadoCivil = new JPanel();
		EstadoCivil.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Estado Civil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		EstadoCivil.setBounds(10, 269, 165, 109);
		PanelPrincipal.add(EstadoCivil);
		EstadoCivil.setLayout(null);
		
		rdbtnSoltero = new JRadioButton("Soltero");
		buttonGroup.add(rdbtnSoltero);
		rdbtnSoltero.setBounds(6, 23, 109, 23);
		EstadoCivil.add(rdbtnSoltero);
		rdbt.add(rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		buttonGroup.add(rdbtnCasado);
		rdbtnCasado.setBounds(6, 52, 109, 23);
		EstadoCivil.add(rdbtnCasado);
		rdbt.add(rdbtnCasado);
		
		rdbtnDivorciado = new JRadioButton("Divorciado");
		buttonGroup.add(rdbtnDivorciado);
		rdbtnDivorciado.setBounds(6, 78, 109, 23);
		EstadoCivil.add(rdbtnDivorciado);
		rdbt.add(rdbtnDivorciado);
		//END
		
		//Panel Lenguajes 
		//Inicio
		leng=new ArrayList();
		LenguajesProgramacion = new JPanel();
		LenguajesProgramacion.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Lenguajes Programacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		LenguajesProgramacion.setBounds(188, 269, 165, 109);
		PanelPrincipal.add(LenguajesProgramacion);
		LenguajesProgramacion.setLayout(null);
		
		chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(6, 21, 97, 23);
		LenguajesProgramacion.add(chckbxJava);
		leng.add(chckbxJava);
		
		chckbxDelphi = new JCheckBox("Delphi");
		chckbxDelphi.setBounds(6, 47, 97, 23);
		LenguajesProgramacion.add(chckbxDelphi);
		leng.add(chckbxDelphi);
		
		chckbxAndroid = new JCheckBox("Android");
		chckbxAndroid.setBounds(6, 73, 97, 23);
		LenguajesProgramacion.add(chckbxAndroid);
		leng.add(chckbxAndroid);
		//END
		
		//Panel sistemas operativos
		//Inicio
		SistemasOperativos = new JPanel();
		SistemasOperativos.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Sistemas Operativos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		SistemasOperativos.setBounds(360, 58, 154, 137);
		PanelPrincipal.add(SistemasOperativos);
		SistemasOperativos.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 134, 98);
		SistemasOperativos.add(scrollPane);
		
		list = new JList(SO);
		scrollPane.setViewportView(list);
		//END
		
		//Panel Experiencia Laboral
		//Inicio
		ExperienciaLaboral = new JPanel();
		ExperienciaLaboral.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Experiencia Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		ExperienciaLaboral.setBounds(524, 63, 376, 315);
		PanelPrincipal.add(ExperienciaLaboral);
		ExperienciaLaboral.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 21, 356, 283);
		ExperienciaLaboral.add(textArea);
		//END
		
		//Panel Base de Datos
		//Inicio
		BasesDeDatos = new JPanel();
		BasesDeDatos.setBounds(360, 204, 154, 95);
		PanelPrincipal.add(BasesDeDatos);
		BasesDeDatos.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 154, 95);
		BasesDeDatos.add(scrollPane_1);
		
		BD=new DefaultListModel<>();
		list_1 = new JList(BD);
		BD.addElement("Informix");BD.addElement("Informix");BD.addElement("Mysql");BD.addElement("Access");BD.addElement("Oracle");
		scrollPane_1.setViewportView(list_1);
		//END
		
		//BOTON ACEPTAR
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAceptar.setBounds(360, 310, 154, 66);
		PanelPrincipal.add(btnAceptar);
		
		
	}
	private void disenoeventos() {
		// TODO Apéndice de método generado automáticamente
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				s_o=list.getSelectedValue().toString();
			}
		});
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				b_d=list_1.getSelectedValue().toString();
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				nombre=txtNombre.getText();
				apellidos=txtApellidos.getText();
				direccion=txtDireccion.getText();
				telefono=txtTelefono.getText();
				pueblo=poblacion.getSelectedItem().toString();
				JRadioButton radio;
				for(int x=0;x<rdbt.size();x++) {
					radio=rdbt.get(x);
					if(radio.isSelected()) {
						estado_civil=radio.getText();
					}
				}
				String LM="";
				String TLI="";
				JCheckBox len;
				for(int i=0;i<leng.size();i++) {
					len=leng.get(i);
					if(len.isSelected()) {
						LM=len.getText();
						TLI=TLI+LM+",";
					}
				}
				lenguajes=TLI;


				
				E_Pro=textArea.getText();
				
				
				
				Curriculum=("Nombre : "+nombre+"\n"
						+"Apellidos : "+apellidos+"\n"
						+"Direccion : "+direccion+"\n"
						+"Telefono  : "+telefono+"\n"
						+"Poblacion : "+pueblo+"\n"
						+"Estado Civil : "+estado_civil+"\n"
						+"Lenguajes de programacion : "+lenguajes+"\n"
						+"Sistema Operativo : "+s_o+"\n"
						+"Base de Datos : "+b_d+"\n"
						+"Experiencia Profesional : "+E_Pro+"\n");
				
				System.out.println(Curriculum);
				FormularioMuestraTodo fmr=new FormularioMuestraTodo(Curriculum);
				fmr.setVisible(true);
			}
		});
	}
}
