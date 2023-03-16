import java.awt.EventQueue;

import javax.swing.JOptionPane;

import ventanas.VentanaDivisas;
import ventanas.VentanaTemperatura;

/**
 * Clase main (principal) que inicializa el programa. Aquí se despliega el menú
 * para que el usuario elija entre usar el conversor de moneda, o bien, el
 * conversor de temperatura.
 * 
 * @author Santiago García, Leonardo D.
 */

public class Main {

	/**
	 * Método main para inicializar el programa
	 * 
	 * @param args
	 */
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

	/**
	 * Método que especifíca las opciones a mostrar en el menú principal, así como
	 * definirlas
	 * 
	 * @return Regresa un String con la selección que el usuario hizo
	 */
	private static String mostrarMenuPrincipal() {
		String[] opcionesConversion = { "Conversor de monedas", "Conversor de temperaturas" };

		return (String) JOptionPane.showInputDialog(null, "Selecciones la acción que desea realizar", "Menú principal",
				JOptionPane.DEFAULT_OPTION, null, opcionesConversion, "");
	}

}
