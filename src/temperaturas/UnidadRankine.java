package temperaturas;

public class UnidadRankine extends UnidadTemperatura {

	public UnidadRankine() {
		this.setUnidad("R");
	}

	public UnidadRankine(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("R");

	}

	@Override
	public UnidadCelsius toCelsius() {
		Double nuevoModulo = (5.0 / 9.0) * (this.getModulo() - 491.67);
		return new UnidadCelsius(nuevoModulo);
	}

	@Override
	public UnidadFahrenheit toFahrenheit() {
		return new UnidadFahrenheit(this.getModulo() - 459.67);
	}

	@Override
	public UnidadKelvin toKelvin() {
		UnidadCelsius unidadCelsius = this.toCelsius();
		return unidadCelsius.toKelvin();
	}

	@Override
	public UnidadRankine toRankine() {
		return this;
	}

}
