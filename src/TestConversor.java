import javax.swing.JOptionPane;

import Ventanas.VentanaPrincipal;

public class TestConversor {
	public static void main(String[] args) {
//		ConversorMoneda conversor = new ConversorMoneda();
//		
//		conversor.setCantidad(200);
//		conversor.setMonedaOrigen("usd");
//		conversor.setMonedaDestino("mxn");
//		
//		System.out.println(conversor.ConvertirDivisas());
		
		VentanaPrincipal ventanaConversor;
		String eleccion = mostrarMenuPrincipal();
		String[] monedas = {"Peso mexicano (mxn)", "Dólar estadounidense (usd)", 
				"Euro (eur)", "Libra estelina (gbp)", "Yen japonés (jpy)", "Won coreano (krw)"};
		
		System.out.println(eleccion);
		
		if (eleccion == "Conversor de monedas") {
			ventanaConversor = new VentanaPrincipal();
			
			for (String moneda: monedas) {
				ventanaConversor.divisaDestino.addItem(moneda);
				ventanaConversor.divisaOrigen.addItem(moneda);
			}
			
			ventanaConversor.frmConversorDeDivisas.setVisible(true);
		}
		
	}
	
	private static String mostrarMenuPrincipal() {
		String[] opcionesConversion = {"Conversor de monedas", "Conversor Magnitudes física"};
		
		return (String) JOptionPane.showInputDialog(null, "Selecciones la acción que desea realizar",
				"Menú principal", JOptionPane.DEFAULT_OPTION, null,  opcionesConversion, "");
	}
}
