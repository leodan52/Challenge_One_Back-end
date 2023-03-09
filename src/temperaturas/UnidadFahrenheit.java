package temperaturas;

public class UnidadFahrenheit extends UnidadTemperatura {

	public UnidadFahrenheit() {
		this.setUnidad("F");
	}

	public UnidadFahrenheit(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("F");

	}

	@Override
	public UnidadCelsius toCelsius() {
		double salidaModulo = (5.0 / 9.0) * (this.getModulo() - 32);
		return new UnidadCelsius(salidaModulo);
	}

	@Override
	public UnidadFahrenheit toFahrenheit() {
		return this;
	}

	@Override
	public UnidadKelvin toKelvin() {
		UnidadCelsius unidadCelsius = this.toCelsius();
		
		return unidadCelsius.toKelvin();
	}

}
