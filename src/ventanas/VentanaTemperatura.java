package ventanas;

import ventanas.keyadapter.KeyAdapterConversor;

/**
 * Clase que extiende de VentanaConversorTemperaturas. Define el comportamiento
 * de los elementos de la ventana, así como conecta con las clases del paquete
 * divisas para la funcionalidad
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class VentanaTemperatura extends VentanaConversorTemperatura {

	/**
	 * Constructor de la clase. Inicialza todas las funcionalidades.
	 */
	public VentanaTemperatura() {
		super();
		this.getCampoCelsius().setName("Celsius");
		this.getCampoFahrenheit().setName("Fahrenheit");
		this.getCampoKelvin().setName("Kelvin");
		this.getCampoRankine().setName("Rankine");
		this.agregarKeyTyped();

	}

	/**
	 * Este método agrega a cada campo de texto un KeyListener usando una clase
	 * llamada KeyAdaterConversor del paquete ventana.keyadapter. Toda la conversión
	 * se realiza en la clase anteriormente mencionada.
	 */
	private void agregarKeyTyped() {
		this.getCampoCelsius().addKeyListener(new KeyAdapterConversor(this.getCampoCelsius(), this.getCampoFahrenheit(),
				this.getCampoKelvin(), this.getCampoRankine()));

		this.getCampoFahrenheit().addKeyListener(new KeyAdapterConversor(this.getCampoFahrenheit(),
				this.getCampoCelsius(), this.getCampoKelvin(), this.getCampoRankine()));

		this.getCampoKelvin().addKeyListener(new KeyAdapterConversor(this.getCampoKelvin(), this.getCampoFahrenheit(),
				this.getCampoCelsius(), this.getCampoRankine()));

		this.getCampoRankine().addKeyListener(new KeyAdapterConversor(this.getCampoRankine(), this.getCampoFahrenheit(),
				this.getCampoKelvin(), this.getCampoCelsius()));
	}

}
