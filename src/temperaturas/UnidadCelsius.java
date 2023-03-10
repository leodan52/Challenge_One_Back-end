package temperaturas;

public class UnidadCelsius extends UnidadTemperatura {

	public UnidadCelsius() {
		this.setUnidad("C");
	}

	public UnidadCelsius(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("C");

	}

	@Override
	public UnidadCelsius toCelsius() {
		return new UnidadCelsius(this.getModulo());
	}

	@Override
	public UnidadFahrenheit toFahrenheit() {
		double salidaModulo = (9.0 / 5.0) * this.getModulo() + 32.0;
		return new UnidadFahrenheit(salidaModulo);
	}

	@Override
	public UnidadKelvin toKelvin() {
		return new UnidadKelvin(this.getModulo() + 273.15);
	}

	@Override
	public UnidadRankine toRankine() {
		double salidaModulo = (9.0 / 5.0) * this.getModulo() + 491.67;
		return new UnidadRankine(salidaModulo);
	}

}
