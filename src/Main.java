import java.awt.EventQueue;

import javax.swing.JOptionPane;

import ventanas.VentanaDivisas;
import ventanas.VentanaTemperatura;

public class Main {
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
		} else if (eleccion == "Conversor de temperaturas") {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VentanaTemperatura window = new VentanaTemperatura();
						window.getFrmConversorDeTemperatura().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}

	}

	private static String mostrarMenuPrincipal() {
		String[] opcionesConversion = { "Conversor de monedas", "Conversor de temperaturas" };

		return (String) JOptionPane.showInputDialog(null, "Selecciones la acción que desea realizar", "Menú principal",
				JOptionPane.DEFAULT_OPTION, null, opcionesConversion, "");
	}

}
