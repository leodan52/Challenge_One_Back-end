package Ventanas.keyadapter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import temperaturas.UnidadCelsius;
import temperaturas.UnidadFahrenheit;
import temperaturas.UnidadKelvin;
import temperaturas.UnidadRankine;
import temperaturas.UnidadTemperatura;

public class KeyAdapterConversor extends KeyAdapter {

	private JTextField padre;
	private JTextField[] cajas;

	public KeyAdapterConversor(JTextField padre, JTextField... cajas) {
		this.padre = padre;
		this.cajas = cajas;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		String entradaString = padre.getText() + e.getKeyChar();
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
				caja.setText(convertirUnidad(caja.getName(), entradaUnidad).getModulo() + "");
			} catch (NumberFormatException exc) {

				caja.setText("ERROR");

			}

		}

	}

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
