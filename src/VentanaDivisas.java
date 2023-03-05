import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import Ventanas.VentanaConversorDivisas;

public class VentanaDivisas extends VentanaConversorDivisas {
	
	public VentanaDivisas() {
		super();
		
		this.agregarListaDivisas();
		this.editarBotonInversion();
	}
	
	private void agregarListaDivisas() {
		String[] monedas = {"", "Peso mexicano (MXN)", "Dólar estadounidense (USD)", 
				"Euro (EUR)", "Libra esterlina (GDP)", "Yen japonés (JPY)", "Won coreano (KRW)"};
		
		for (String moneda: monedas) {
			this.getEntradaDivisaOrigen().addItem(moneda);
			this.getEntradaDivisaDestino().addItem(moneda);

		}
	}
	
	private void editarBotonInversion() {
		
		JComboBox<String> divisaOrigen = this.getEntradaDivisaOrigen();
		JComboBox<String> divisaDestino = this.getEntradaDivisaDestino();
		
		this.getBotonInversor().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object seleccionadoOrigen = divisaOrigen.getSelectedItem();
				Object seleccionadoDestino = divisaDestino.getSelectedItem();
				
				divisaOrigen.setSelectedItem(seleccionadoDestino);
				divisaDestino.setSelectedItem(seleccionadoOrigen);
			}
		});
	}
	
}
