package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	public JFrame frmConversorDeDivisas;
	public JTextField entradaCaja;
	public JComboBox divisaOrigen;
	public JComboBox divisaDestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeDivisas = new JFrame();
		frmConversorDeDivisas.setResizable(false);
		frmConversorDeDivisas.setTitle("Conversor de divisas");
		frmConversorDeDivisas.setBounds(100, 100, 884, 287);
		frmConversorDeDivisas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeDivisas.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblIngresaLaCantidad = new JLabel("Ingresa la cantidad a convertir");
		frmConversorDeDivisas.getContentPane().add(lblIngresaLaCantidad, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frmConversorDeDivisas.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		entradaCaja = new JTextField();
		entradaCaja.setBounds(29, 44, 183, 31);
		panel_3.add(entradaCaja);
		entradaCaja.setColumns(10);
		
		JButton botonInvertir = new JButton("bot");
		botonInvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object seleccionOrigen = divisaOrigen.getSelectedItem();
				Object seleccionDestino = divisaDestino.getSelectedItem();
				
				divisaOrigen.setSelectedItem(seleccionDestino);
				divisaDestino.setSelectedItem(seleccionOrigen);
			}
		});
		botonInvertir.setBounds(433, 44, 58, 31);
		panel_3.add(botonInvertir);
		
		divisaOrigen = new JComboBox();
		divisaOrigen.setBounds(224, 44, 197, 31);
		panel_3.add(divisaOrigen);
		
		divisaDestino = new JComboBox();
		divisaDestino.setBounds(503, 44, 197, 31);
		panel_3.add(divisaDestino);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setBounds(224, 25, 70, 15);
		panel_3.add(lblDe);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(503, 25, 70, 15);
		panel_3.add(lblA);
		
		JButton botonConvertir = new JButton("Hacer Conversión");
		botonConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonConvertir.setBounds(664, 87, 158, 25);
		panel_3.add(botonConvertir);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel salidaResultado = new JLabel("");
		panel_1.add(salidaResultado);
	}
}
