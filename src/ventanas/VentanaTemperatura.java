package Ventanas;

import Ventanas.keyadapter.KeyAdapterConversor;

public class VentanaTemperatura extends VentanaConversorTemperatura {

	public VentanaTemperatura() {
		super();
		this.getCampoCelsius().setName("Celsius");
		this.getCampoFahrenheit().setName("Fahrenheit");
		this.getCampoKelvin().setName("Kelvin");
		this.getCampoRankine().setName("Rankine");
		this.agregarKeyTyped();

	}


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
