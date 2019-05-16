package estudioCheck;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class EstudioCheck extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxPequea;
	private JCheckBox chckbxMediana;
	private JCheckBox chckbxGrande;
	private JLabel lblIngredientesDeLa;
	private JCheckBox chckbxJamon;
	private JCheckBox chckbxPeperoni;
	private JCheckBox chckbxBacon;
	private JCheckBox chckbxPollo;
	private JLabel lblResumenDelPedido;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_3;
	private JLabel lbl_4;
	private String ingredientes;
	private JButton btnAceptar;
	private JLabel lblResumenDePedido;
	private JLabel label;
	ArrayList<JCheckBox> tamanos;
	ArrayList<JCheckBox> ingre;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstudioCheck frame = new EstudioCheck();
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
	public EstudioCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		definirventana();
		definireventos();

	}



	private void definirventana() {
		// TODO Apéndice de método generado automáticamente
		tamanos=new ArrayList<>();
		ingre=new ArrayList<>();
		
		chckbxPequea = new JCheckBox("Peque\u00F1a");
		buttonGroup.add(chckbxPequea);
		chckbxPequea.setBounds(6, 49, 97, 23);
		contentPane.add(chckbxPequea);
		tamanos.add(chckbxPequea);
		
		chckbxMediana = new JCheckBox("Mediana");
		buttonGroup.add(chckbxMediana);
		chckbxMediana.setBounds(6, 75, 97, 23);
		contentPane.add(chckbxMediana);
		tamanos.add(chckbxMediana);
		
		chckbxGrande = new JCheckBox("Grande");
		buttonGroup.add(chckbxGrande);
		chckbxGrande.setBounds(6, 101, 97, 23);
		contentPane.add(chckbxGrande);
		tamanos.add(chckbxGrande);
		
		JLabel lblTamaoDeLa = new JLabel("Tama\u00F1o de la pizza");
		lblTamaoDeLa.setBounds(6, 11, 97, 23);
		contentPane.add(lblTamaoDeLa);
		
		lblIngredientesDeLa = new JLabel("Ingredientes de la pizza");
		lblIngredientesDeLa.setBounds(113, 15, 125, 14);
		contentPane.add(lblIngredientesDeLa);
		
		chckbxJamon = new JCheckBox("Jamon");
		chckbxJamon.setBounds(105, 49, 97, 23);
		contentPane.add(chckbxJamon);
		ingre.add(chckbxJamon);
		
		chckbxPeperoni = new JCheckBox("Peperoni");
		chckbxPeperoni.setBounds(105, 75, 97, 23);
		contentPane.add(chckbxPeperoni);
		ingre.add(chckbxPeperoni);
		
		chckbxBacon = new JCheckBox("Bacon");
		chckbxBacon.setBounds(105, 101, 97, 23);
		contentPane.add(chckbxBacon);
		ingre.add(chckbxBacon);
		
		chckbxPollo = new JCheckBox("Pollo");
		chckbxPollo.setBounds(105, 127, 97, 23);
		contentPane.add(chckbxPollo);
		ingre.add(chckbxPollo);
		
		lblResumenDelPedido = new JLabel("Ingredientes elegidos");
		lblResumenDelPedido.setBounds(248, 15, 164, 14);
		contentPane.add(lblResumenDelPedido);
		
		lbl_1 = new JLabel("");
		lbl_1.setBounds(248, 53, 164, 14);
		contentPane.add(lbl_1);
		
		lbl_2 = new JLabel("");
		lbl_2.setBounds(248,  75, 164, 14);
		contentPane.add(lbl_2);
		
		lbl_3 = new JLabel("");
		lbl_3.setBounds(248,  101, 164, 14);
		contentPane.add(lbl_3);
		
		lbl_4 = new JLabel("");
		lbl_4.setBounds(248,  127, 164, 14);
		contentPane.add(lbl_4);
		
		btnAceptar = new JButton("\u00A1\u00A1Listoo!!");
		btnAceptar.setBounds(20, 157, 392, 23);
		contentPane.add(btnAceptar);
		
		lblResumenDePedido = new JLabel("Resumen de pedido");
		lblResumenDePedido.setBounds(6, 191, 148, 14);
		contentPane.add(lblResumenDePedido);
		
		label = new JLabel("");
		label.setBounds(6, 216, 406, 76);
		contentPane.add(label);
	}
	
	private void definireventos() {
		// TODO Apéndice de método generado automáticamente
		chckbxJamon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredientes=chckbxJamon.getText();
				lbl_1.setText(ingredientes);
				if(!chckbxJamon.isSelected()) {
					lbl_1.setText("");
				}
			}
		});
		chckbxPeperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredientes=chckbxPeperoni.getText();
				lbl_2.setText(ingredientes);
				if(!chckbxPeperoni.isSelected()) {
					lbl_2.setText("");
				}
				
			}
		});
		chckbxBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredientes=chckbxBacon.getText();
				lbl_3.setText(ingredientes);
				if(!chckbxBacon.isSelected()) {
					lbl_3.setText("");
				}
				
			}
		});
		chckbxPollo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredientes=chckbxPollo.getText();
				lbl_4.setText(ingredientes);
				if(!chckbxPollo.isSelected()) {
					lbl_4.setText("");
				}
				
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EleccionTamano="";
				String TLI="";
				String TodosLosIngredientes;
				JCheckBox tamano;
				JCheckBox ing;
				for(int x=0;x<tamanos.size();x++) {
					tamano=tamanos.get(x);
					if(tamano.isSelected()) {
						EleccionTamano=tamano.getText();
					}
				}
				for(int i=0;i<ingre.size();i++) {
					ing=ingre.get(i);
					if(ing.isSelected()) {
						TodosLosIngredientes=ing.getText();
						TLI=TLI+","+TodosLosIngredientes;
					}
				}
				label.setText(EleccionTamano+"\n"+TLI);
			}
			
		});
		
		
		
		
		
		
		
		
		
		
	}
}
