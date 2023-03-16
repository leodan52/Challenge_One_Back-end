package ventanas.keyadapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import temperaturas.UnidadCelsius;
import temperaturas.UnidadFahrenheit;
import temperaturas.UnidadKelvin;
import temperaturas.UnidadRankine;
import temperaturas.UnidadTemperatura;

/**
 * Clase que extiende de KeyAdapter. Esta clase se usa para agregar un
 * KeyListener a los campos de texto de la ventana para la conversión de
 * temperatura. Conecta con el paquete temperaturas para realizar las
 * conversiones en tiempo real, mientras el usuario teclea.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class KeyAdapterConversor extends KeyAdapter {

	private JTextField padre;
	private JTextField[] cajas;
	private int numDecimales = 2;

	/**
	 * Constructor de la clase
	 * 
	 * @param padre El JTextField donde se posicionará el usuario
	 * @param cajas Los JTextField disponibles en la ventana, con excepción de padre
	 */
	public KeyAdapterConversor(JTextField padre, JTextField... cajas) {
		this.padre = padre;
		this.cajas = cajas;
	}

	/**
	 * Este método se activa al soltar una tecla. Al activarse se estrae el
	 * contenido del JTextField padre y se realiza la conversion en las otras
	 * unidades, escribiendo en cada JTextField restante el resultado. Si se
	 * inglesan valores que no son númericos, se mostrará el mensaje ERROR en los
	 * otros campos.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		String entradaString = padre.getText();
		String entradaTipo = padre.getName();
		UnidadTemperatura entradaUnidad = null;

		switch (entradaTipo) {

		case "Celsius":
			entradaUnidad = new UnidadCelsius();
			break;
		case "Fahrenheit":
			entradaUnidad = new UnidadFahrenheit();
			break;
		case "Kelvin":
			entradaUnidad = new UnidadKelvin();
			break;
		case "Rankine":
			entradaUnidad = new UnidadRankine();
			break;
		}

		for (JTextField caja : cajas) {
			try {
				entradaUnidad.setModulo(Double.valueOf(entradaString));
				caja.setText(convertirUnidad(caja.getName(), entradaUnidad).getModulo(this.numDecimales) + "");
			} catch (NumberFormatException exc) {

				if (padre.getText().strip().equals("")) {
					caja.setText("");
				} else {
					caja.setText("ERROR");
				}

			}

		}

	}

	/**
	 * Este método realiza la conversión de temperatura correspodiente.
	 * 
	 * @param nombre Nombre de la unidad destino a convertir (String).
	 * @param unidad Unidad inicial, a la cual se le realizará la conversion
	 *               (UnidadTemperatura)
	 * @return Retorna una clase extendida de UnidadTemperatura con el resultado de
	 *         la conversión
	 */
	private UnidadTemperatura convertirUnidad(String nombre, UnidadTemperatura unidad) {

		UnidadTemperatura salida;

		switch (nombre) {
		case "Celsius":
			salida = unidad.toCelsius();
			break;
		case "Fahrenheit":
			salida = unidad.toFahrenheit();
			break;
		case "Kelvin":
			salida = unidad.toKelvin();
			break;
		case "Rankine":
			salida = unidad.toRankine();
			break;
		default:
			salida = unidad;
			break;
		}

		return salida;

	}

}
