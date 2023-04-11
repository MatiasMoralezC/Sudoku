package juego.vista;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

import juego.logica.MatrizACompletar;
import juego.logica.Observador;

public class TableroDeTres {
	
	public JFrame frame;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_35;
	private JSeparator separator_1;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	
	private Observador observador;
	ArrayList<JTextField> cuadriculas = new ArrayList<JTextField>();
	ArrayList<Integer> valoresParaCuadriculas = new ArrayList<Integer>();
	ArrayList<Integer> sumaFilas = new ArrayList<Integer>();
	ArrayList<Integer> sumaColumnas = new ArrayList<Integer>();
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public TableroDeTres() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		initialize();
		pegarMatrizEnVista(null);
		vaciarCuadriculasEditables();
	}
	
	public void setObservador(Observador obs) {
		this.observador = obs;
	}

	/*
	 * public void validarSolucion() { observador.esSolucionCorrecta(); }
	 */
	
	
	
	public void pegarMatrizEnVista(MatrizACompletar matriz) {
//		for (int i = 0; i < matriz.size(); i++) {
//			for (int j = 0; j < matriz.get(i).size(); j++) {
//				
//			}
//		}
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < arr.length; i++) {
			valoresParaCuadriculas.add(arr[i]);
		}
		guardarValoresCuadriculasEnArrayList(cuadriculas);

		for (int i = 1; i <= valoresParaCuadriculas.size(); i++) {
			JTextField cuadri = cuadriculas.get(i);
			cuadri.setText(valoresParaCuadriculas.get(i).toString());
			System.out.println(i);
			
		}
	}
	
	private void vaciarCuadriculasEditables() {
		for (int i = 0; i < cuadriculas.size(); i++) {
			JTextField cuadri = cuadriculas.get(i);
			if (cuadri.isEditable()) {
				cuadri.setText("");
			}
		}
	}
	
	private boolean sonCuadriculasCorrectas() {
		
		return true;
	}
	
	private void guardarValoresCuadriculasEnArrayList(ArrayList<JTextField> lista) {
		JTextField campos[] = {textField_0, textField_1, textField_2,
				textField_3, textField_4, textField_5,
				textField_6, textField_7, textField_8};
		
		for (int i = 0; i < campos.length; i++) {
			lista.add(campos[i]);
		}
	}
	
	private ArrayList<JTextField> getCuadriculas() {
		return cuadriculas;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Programación III");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField_0 = new JTextField();
		textField_0.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_0.setBounds(10, 10, 80, 80);
		frame.getContentPane().add(textField_0);
		textField_0.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_1.setBounds(100, 10, 80, 80);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_2.setBounds(190, 10, 80, 80);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_3.setBounds(10, 101, 80, 80);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_4.setBounds(100, 101, 80, 80);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_5.setBounds(190, 101, 80, 80);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_6.setBounds(10, 192, 80, 80);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_7.setBounds(100, 192, 80, 80);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_8.setBounds(190, 192, 80, 80);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		// Separadores

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 462, 450, 1);
		frame.getContentPane().add(separator);

		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(460, 10, 1, 453);
		frame.getContentPane().add(separator_1);

		// Sumas

		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_25.setEditable(false);
		textField_25.setBounds(471, 10, 80, 80);
		frame.getContentPane().add(textField_25);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_26.setEditable(false);
		textField_26.setBounds(471, 101, 80, 80);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);

		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_27.setEditable(false);
		textField_27.setBounds(471, 192, 80, 80);
		frame.getContentPane().add(textField_27);
		textField_27.setColumns(10);

		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_30.setEditable(false);
		textField_30.setBounds(10, 474, 80, 80);
		frame.getContentPane().add(textField_30);
		textField_30.setColumns(10);

		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_31.setEditable(false);
		textField_31.setBounds(100, 474, 80, 80);
		frame.getContentPane().add(textField_31);
		textField_31.setColumns(10);

		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 54));
		textField_32.setEditable(false);
		textField_32.setBounds(190, 474, 80, 80);
		frame.getContentPane().add(textField_32);
		textField_32.setColumns(10);

		// Botones

		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBounds(641, 10, 118, 30);
		frame.getContentPane().add(btnNuevaPartida);

		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarSolucion();
			}
		});
		btnComprobar.setBounds(641, 51, 118, 30);
		frame.getContentPane().add(btnComprobar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(641, 92, 118, 30);
		frame.getContentPane().add(btnSalir);

		// Tiempo

		JLabel lblMejorTiempo = new JLabel("MEJOR TIEMPO");
		lblMejorTiempo.setBounds(641, 150, 100, 20);
		frame.getContentPane().add(lblMejorTiempo);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setBounds(641, 181, 96, 20);
		frame.getContentPane().add(textField_35);
		textField_35.setColumns(10);
	}

	private List<List<Integer>> guardarSolucion() {
		ArrayList<JTextField> listSolucion = new ArrayList<JTextField>(3);
		List<List<Integer>> listSolucionValores = new ArrayList<List<Integer>>(3);
		guardarValoresCuadriculasEnArrayList(listSolucion);
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			listSolucionValores.add(new ArrayList<Integer>(3));
			for (int j = 0; j < 3; j++) {
				if (listSolucion.get(cont).getText().isEmpty()) throw new RuntimeException("Ingrese todos los valores");
				listSolucionValores.get(i).add(Integer.parseInt(listSolucion.get(cont).getText()));
				cont++;
			}
		}
		System.out.println("---");
		System.out.println(listSolucionValores);
		return listSolucionValores;
	}

	public void setVisible(final boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroDeTres tabDeTres = new TableroDeTres();
					tabDeTres.frame.setVisible(b);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
