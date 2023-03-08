import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class TestConversor {
	public static void main(String[] args) {

		String eleccion = mostrarMenuPrincipal();
		
		if (eleccion == "Conversor de monedas") {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VentanaDivisas window = new VentanaDivisas();
						window.getFrmConversorDeDivisas().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}); 
		}
		
	}
	
	private static String mostrarMenuPrincipal() {
		String[] opcionesConversion = {"Conversor de monedas", "Conversor Magnitudes física"};
		
		return (String) JOptionPane.showInputDialog(null, "Selecciones la acción que desea realizar",
				"Menú principal", JOptionPane.DEFAULT_OPTION, null,  opcionesConversion, "");
	}

}
