package temperaturas;

/**
 * Clase que define el comportamiento y atributos de la unidad de temperatura
 * Fahrenheit. Extiende de la clase UnidadTemperatura.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class UnidadFahrenheit extends UnidadTemperatura {

	/**
	 * Constructor de la clase sin argumentos. Se espera que el usuario defina
	 * posteriormente el módulo de la medida
	 */
	public UnidadFahrenheit() {
		this.setUnidad("F");
	}

	/**
	 * Constructor con argumentos. Se define el módulo de la medida.
	 * 
	 * @param modulo Se infresa un double con el módulo de la medida.
	 */
	public UnidadFahrenheit(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("F");

	}

	/**
	 * Convierte la unidad Fahrenheit a Celsius
	 */
	@Override
	public UnidadCelsius toCelsius() {
		double salidaModulo = (5.0 / 9.0) * (this.getModulo() - 32);
		return new UnidadCelsius(salidaModulo);
	}

	@Override
	public UnidadFahrenheit toFahrenheit() {
		return this;
	}

	/**
	 * Convierte la unidad Fahrenheit a Kelvin
	 */
	@Override
	public UnidadKelvin toKelvin() {
		UnidadCelsius unidadCelsius = this.toCelsius();

		return unidadCelsius.toKelvin();
	}

	/**
	 * Convierte la unidad Fahrenheit a Rankine
	 */
	@Override
	public UnidadRankine toRankine() {
		return new UnidadRankine(this.getModulo() + 459.67);
	}

}
