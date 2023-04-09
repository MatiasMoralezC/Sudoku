package juego.vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableroDeCinco {

	public JFrame frmProgramacinIii;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JSeparator separator_1;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField txtProgramacinIii;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;

	/**
	 * Create the application.
	 */
	public TableroDeCinco() {		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgramacinIii = new JFrame();
		frmProgramacinIii.setTitle("Programación III");
		frmProgramacinIii.setBounds(100, 100, 800, 600);
		frmProgramacinIii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgramacinIii.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField.setBounds(10, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_1.setBounds(10, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_2.setBounds(10, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_3.setBounds(100, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_4.setBounds(100, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_5.setBounds(100, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_6.setBounds(190, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_7.setBounds(190, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_8.setBounds(190, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		//Cuarta tanda
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_9.setBounds(10, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_10.setBounds(100, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_11.setBounds(190, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_12.setBounds(280, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_13.setBounds(280, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_14.setBounds(280, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_15.setBounds(280, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		//Quinta tanda
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_16.setBounds(10, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_17.setBounds(100, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_18.setBounds(190, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_19.setBounds(280, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_20.setBounds(370, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_21.setBounds(370, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_22.setBounds(370, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_23.setBounds(370, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_24.setBounds(370, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		//Separadores
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 462, 450, 1);
		frmProgramacinIii.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(460, 10, 1, 453);
		frmProgramacinIii.getContentPane().add(separator_1);
		
		//Sumas
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_25.setEditable(false);
		textField_25.setBounds(471, 10, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_26.setEditable(false);
		textField_26.setBounds(471, 101, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_27.setEditable(false);
		textField_27.setBounds(471, 192, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_28.setEditable(false);
		textField_28.setBounds(471, 283, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		txtProgramacinIii = new JTextField();
		txtProgramacinIii.setFont(new Font("Tahoma", Font.PLAIN, 54));
		txtProgramacinIii.setEditable(false);
		txtProgramacinIii.setBounds(471, 374, 80, 80);
		frmProgramacinIii.getContentPane().add(txtProgramacinIii);
		txtProgramacinIii.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_30.setEditable(false);
		textField_30.setBounds(10, 474, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_31.setEditable(false);
		textField_31.setBounds(100, 474, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_32.setEditable(false);
		textField_32.setBounds(190, 474, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_33.setEditable(false);
		textField_33.setBounds(280, 474, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_34.setEditable(false);
		textField_34.setBounds(370, 474, 80, 80);
		frmProgramacinIii.getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		//Botones
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBounds(641, 10, 118, 30);
		frmProgramacinIii.getContentPane().add(btnNuevaPartida);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(641, 51, 118, 30);
		frmProgramacinIii.getContentPane().add(btnComprobar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(641, 92, 118, 30);
		frmProgramacinIii.getContentPane().add(btnSalir);
		
		//Tiempo
		
		JLabel lblMejorTiempo = new JLabel("MEJOR TIEMPO");
		lblMejorTiempo.setBounds(641, 150, 100, 20);
		frmProgramacinIii.getContentPane().add(lblMejorTiempo);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setBounds(641, 181, 96, 20);
		frmProgramacinIii.getContentPane().add(textField_35);
		textField_35.setColumns(10);
	}
}