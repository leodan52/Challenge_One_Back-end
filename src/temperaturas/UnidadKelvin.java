package temperaturas;

public class UnidadKelvin extends UnidadTemperatura {

	public UnidadKelvin() {
		this.setUnidad("k");
	}

	public UnidadKelvin(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("k");

	}

	@Override
	public UnidadCelsius toCelsius() {
		return new UnidadCelsius(this.getModulo() - 273.15);
	}

	@Override
	public UnidadFahrenheit toFahrenheit() {
		UnidadCelsius unidadCelsius = toCelsius();

		return unidadCelsius.toFahrenheit();
	}

	@Override
	public UnidadKelvin toKelvin() {
		return this;
	}

	@Override
	public String representacionUnidad() {
		return this.getModulo() + " K";
	}

	@Override
	public UnidadRankine toRankine() {
		UnidadCelsius unidadCelsius = this.toCelsius();
		return unidadCelsius.toRankine();
	}

}
