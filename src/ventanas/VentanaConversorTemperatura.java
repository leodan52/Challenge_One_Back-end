package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class VentanaConversorTemperatura {

	private JFrame frmConversorDeTemperatura;
	private JTextField campoCelsius;
	private JTextField campoFahrenheit;
	private JTextField campoKelvin;
	private JTextField campoRankine;
	private JButton botonLimpiar;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaConversorTemperatura window = new VentanaConversorTemperatura();
//					window.frmConversorDeTemperatura.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public VentanaConversorTemperatura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeTemperatura = new JFrame();
		frmConversorDeTemperatura.setTitle("Conversor de Temperatura");
		frmConversorDeTemperatura.setBounds(100, 100, 402, 434);
		frmConversorDeTemperatura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmConversorDeTemperatura.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(10, 5, 10, 5)));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(8, 0, 0, 0));

		JLabel lblCelci = new JLabel("Celsius:");
		panel_1.add(lblCelci);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 10));
		panel_1.add(panel_2);

		campoCelsius = new JTextField();
		campoCelsius.setFont(new Font("Dialog", Font.PLAIN, 14));
		campoCelsius.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel(" ° C ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		panel_2.add(campoCelsius);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_1 = new JLabel("Fahrenheit:");
		panel_1.add(lblNewLabel_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 10));
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));

		campoFahrenheit = new JTextField();
		campoFahrenheit.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel_3.add(campoFahrenheit);
		campoFahrenheit.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel(" ° F ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_2 = new JLabel("Kelvin:");
		panel_1.add(lblNewLabel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 10));
		panel_1.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

		campoKelvin = new JTextField();
		campoKelvin.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel_4.add(campoKelvin);
		campoKelvin.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("   K ");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_6);

		JLabel lblNewLabel_3 = new JLabel("Rankine:");
		panel_1.add(lblNewLabel_3);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0, 0, 0, 10));
		panel_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

		campoRankine = new JTextField();
		campoRankine.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel_5.add(campoRankine);
		campoRankine.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel(" ° R");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_7);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));

		Component horizontalGlue = Box.createHorizontalGlue();
		panel_6.add(horizontalGlue);

		botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoCelsius.setText("");
				campoFahrenheit.setText("");
				campoKelvin.setText("");
				campoRankine.setText("");
			}
		});
		panel_6.add(botonLimpiar);

		JLabel lblNewLabel = new JLabel("Challenge Alura ONE Back - end Java G4 | Por: Leonardo D. Santiago");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		frmConversorDeTemperatura.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
	}

	public JTextField getCampoCelsius() {
		return campoCelsius;
	}

	public JTextField getCampoFahrenheit() {
		return campoFahrenheit;
	}

	public JTextField getCampoKelvin() {
		return campoKelvin;
	}

	public JTextField getCampoRankine() {
		return campoRankine;
	}

	public JButton getBotonLimpiar() {
		return botonLimpiar;
	}

	public JFrame getFrmConversorDeTemperatura() {
		return frmConversorDeTemperatura;
	}
}
