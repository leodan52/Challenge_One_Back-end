package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.Rectangle;
import java.awt.BorderLayout;

public class VentanaConversorDivisas {

	private JFrame frmConversorDeDivisas;
	private JTextField cajaEntrada;
	private JComboBox<String> entradaDivisaOrigen;
	private JButton botonInversor;
	private JComboBox<String> entradaDivisaDestino;
	private JButton botonConversor;
	private JLabel labelSalida;
	private JButton botonCopiar;
	private JLabel salidaUnidadDivisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConversorDivisas window = new VentanaConversorDivisas();
					window.frmConversorDeDivisas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaConversorDivisas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeDivisas = new JFrame();
		frmConversorDeDivisas.setBounds(new Rectangle(10, 0, 0, 0));
		frmConversorDeDivisas.setTitle("Conversor de divisas");
		frmConversorDeDivisas.setBounds(100, 100, 757, 291);
		frmConversorDeDivisas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeDivisas.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel mainContenedor = new JPanel();
		mainContenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmConversorDeDivisas.getContentPane().add(mainContenedor);
		mainContenedor.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel panelEntrada = new JPanel();
		mainContenedor.add(panelEntrada);
		panelEntrada
				.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), new EmptyBorder(5, 3, 5, 5)));
		panelEntrada.setLayout(new GridLayout(3, 4, 10, 5));

		JLabel lblIngresaLaCantidad = new JLabel("Ingresa la cantidad");
		panelEntrada.add(lblIngresaLaCantidad);

		JLabel lblDe = new JLabel("De:");
		panelEntrada.add(lblDe);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		panelEntrada.add(horizontalStrut);

		JLabel lblA = new JLabel("a");
		panelEntrada.add(lblA);

		cajaEntrada = new JTextField();
		panelEntrada.add(cajaEntrada);
		cajaEntrada.setColumns(10);

		entradaDivisaOrigen = new JComboBox<>();
		entradaDivisaOrigen.setToolTipText("Seleccione la divisa a convertir\n");
		panelEntrada.add(entradaDivisaOrigen);

		JPanel panel = new JPanel();
		panelEntrada.add(panel);
		panel.setLayout(new GridLayout(1, 3, 5, 0));

		Component horizontalGlue = Box.createHorizontalGlue();
		panel.add(horizontalGlue);

		botonInversor = new JButton("⇆");
		botonInversor.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(botonInversor);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel.add(horizontalGlue_1);

		entradaDivisaDestino = new JComboBox<>();
		entradaDivisaDestino.setToolTipText("Seleccione a qué divisa desea convertir");
		panelEntrada.add(entradaDivisaDestino);

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panelEntrada.add(horizontalStrut_1);

		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panelEntrada.add(horizontalStrut_2);

		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panelEntrada.add(horizontalStrut_3);

		botonConversor = new JButton("Convertir");
		botonConversor.setToolTipText("Haga click aquí para convertir\n");
		panelEntrada.add(botonConversor);

		JPanel panelSalida = new JPanel();
		mainContenedor.add(panelSalida);
		panelSalida.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelSalida.setLayout(new GridLayout(3, 0, 5, 0));

		Component verticalStrut = Box.createVerticalStrut(20);
		panelSalida.add(verticalStrut);

		JPanel panel_1 = new JPanel();
		panelSalida.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		labelSalida = new JLabel("Bienvenido a mi Conversor de Divisas");
		panel_1.add(labelSalida);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		botonCopiar = new JButton("Copiar");
		botonCopiar.setToolTipText("Copie la cantidad al portapapeles");
		botonCopiar.setEnabled(false);
		panel_2.add(botonCopiar);

		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_4);

		salidaUnidadDivisa = new JLabel("");
		salidaUnidadDivisa.setFont(new Font("Dialog", Font.ITALIC, 11));
		panelSalida.add(salidaUnidadDivisa);

		JLabel lblChallengeOne = new JLabel("Challenge One Back-end - Java G4  ||  Por: Leonardo D. Santiago");
		frmConversorDeDivisas.getContentPane().add(lblChallengeOne, BorderLayout.SOUTH);
		lblChallengeOne.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblChallengeOne.setHorizontalAlignment(SwingConstants.RIGHT);
	}

	public JTextField getCajaEntrada() {
		return cajaEntrada;
	}

	public JComboBox<String> getEntradaDivisaOrigen() {
		return entradaDivisaOrigen;
	}

	public JButton getBotonInversor() {
		return botonInversor;
	}

	public JComboBox<String> getEntradaDivisaDestino() {
		return entradaDivisaDestino;
	}

	public JButton getBotonConversor() {
		return botonConversor;
	}

	public JLabel getLabelSalida() {
		return labelSalida;
	}

	public JButton getBotonCopiar() {
		return botonCopiar;
	}

	public JLabel getSalidaUnidadDivisa() {
		return salidaUnidadDivisa;
	}

	public JFrame getFrmConversorDeDivisas() {
		return frmConversorDeDivisas;
	}
}
